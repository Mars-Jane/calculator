package calculator;

import java.util.Stack;

public class calculate {
	
	private double[] s=new double[50];//¶¨ÒåÊý×ÖÕ»
	private int top2=0;      //Êý×ÖÕ»Õ»¶¥Ö¸Õë
	public double calculate(String textString)
	{
		char[] text=textString.toCharArray();
		char[] stack=new char[50];//¶¨Òå·ûºÅÕ»,´æ·Å·ûºÅ
		int top1=0;      //·ûºÅÕ»Õ»¶¥Ö¸Õë
		char c;
		double a=0;
		int i=0;
		
		while(text[i]!='=')
		{
			c=text[i];
			switch(c) {
			case '+':
			case '-':
				while(top1!=0&&stack[top1]!='(')
				{
					cal(stack[top1--]);
				}
				stack[++top1]=c;
					i++;
					break;
			case '!':
				s[top2]=fact((int)s[top2]);
				i++;
				break;
			case '¦Ð':
				s[++top2]=Math.PI;
				i++;
				break;
			case '¡Á':
			case '¡Â':
			case '%':
				while (stack[top1]== '¡Á' || stack[top1]== '¡Â'||stack[top1]=='%'||stack[top1]=='^') 
				{
					cal(stack[top1--]);
				}
				stack[++top1]=c;
				i++;
				break;
			case '^':
				while(stack[top1]=='^')
				{
					cal(stack[top1--]);
				}
				stack[++top1]=c;
				i++;
				break;
			case '(':
				stack[++top1]=c;
				i++; 
				break;
			case ')':
				while (stack[top1]!= '(') {
					cal(stack[top1--]);
				}
				top1--;  //µ¯³ö×óÀ¨ºÅ
				i++;
				break;
			case '.':
				c=text[++i];
				double t=10;
				int t0;
				while(c>='0'&&c<='9')
				{
					t0=(int)(c-'0');
					a=a+t0/t;
					c=text[++i];
					t=t*10;
				}
				s[++top2]=a;
				break;
			default:
				a = 0;
				while (c >= '0' && c <= '9') 
				{
					a = 10 * a + (double)(c - '0');
					i++;
					c=text[i];
				}
				if(text[i]!='.')
				{
					s[++top2]=a;	
				}
			}
	
		}
		
		
		
		while(top1>0)
		{
			cal(stack[top1--]);
		}
		
		return s[1];
	}
	
	//¼ÆËãº¯Êý
	public void cal(char ch)
	{
		double p, q;
		p = s[top2--];
		q = s[top2--];
		switch (ch) {
		case '+':
			s[++top2] = q + p; break;
		case '-':
			s[++top2] = q - p; break;
		case '¡Á':
			s[++top2] = q * p; break;
		case '¡Â':
			s[++top2] = q / p; break;
		case '%':
			s[++top2] = q % p; break;
		case '^':
			s[++top2] = Math.pow(q, p); break;
		}
	}
	
	public int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	
	
}
