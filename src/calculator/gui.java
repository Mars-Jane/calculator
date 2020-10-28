package calculator;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class gui extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setTitle("������");
		setBackground(new Color(240, 240, 240));
		setBounds(100,100,425,546);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.PLAIN, 25));
		textField.setBounds(0, 0, 400, 80);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button_PI = new JButton("��");
		button_PI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"��"));
			}
		});
		button_PI.setFont(new Font("����", Font.PLAIN, 25));
		button_PI.setBounds(0, 80, 80, 80);
		panel.add(button_PI);
		
		JButton button_CE = new JButton("CE");
		button_CE .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				char c[]=str1.toCharArray();
				int i;
				for(i=c.length-1;i>=0&&(c[i]>='0'&&c[i]<='9'||c[i]=='.');i--)
				{
					c[i]='\0';
				}
				i++;
				StringBuffer s=new StringBuffer(str1);
				s.delete(i, str1.length());
				str1=s.toString();
				textField.setText((str1));
			}
		});
		button_CE.setBounds(80, 80, 80, 80);
		button_CE.setFont(new Font("����", Font.PLAIN, 25));
		panel.add(button_CE);
		
		JButton button_C = new JButton("C");
		button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText((""));
			}
		});
		button_C.setBounds(160, 80, 80, 80);
		button_C.setFont(new Font("����", Font.PLAIN, 25));
		panel.add(button_C);
		
		JButton button_DEL = new JButton("DEL");
		button_DEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				if(str1.length()>0)
				{
					str1=str1.substring(0,str1.length()-1);
				    textField.setText((str1+""));
				}
			
			}
		});
		button_DEL.setBounds(240, 80, 80, 80);
		button_DEL.setFont(new Font("����", Font.PLAIN, 25));
		panel.add(button_DEL);
		
		JButton button_�� = new JButton("\u00F7");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"��"));
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(320, 80, 80, 80);
		panel.add(button_��);
		
		JButton button_�η� = new JButton("x^y");
		button_�η�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"^"));
			}
		});
		button_�η�.setFont(new Font("����", Font.PLAIN, 25));
		button_�η�.setBounds(0, 160, 80, 80);
		panel.add(button_�η�);
		
		JButton button_ȡ�� = new JButton("Mod");
		button_ȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"%"));
			}
		});
		button_ȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_ȡ��.setFont(new Font("����", Font.PLAIN, 25));
		button_ȡ��.setBounds(0, 240, 80, 80);
		panel.add(button_ȡ��);
		
		JButton button_�׳� = new JButton("n!");
		button_�׳�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"!"));
			}
		});
		button_�׳�.setFont(new Font("����", Font.PLAIN, 25));
		button_�׳�.setBounds(0, 320, 80, 80);
		panel.add(button_�׳�);
		
		JButton button_������ = new JButton("(");
		button_������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"("));
			}
		});
		button_������.setFont(new Font("����", Font.PLAIN, 25));
		button_������.setBounds(0, 400, 80, 80);
		panel.add(button_������);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"7"));
			}
		});
		button_7.setFont(new Font("����", Font.PLAIN, 25));
		button_7.setBounds(80, 160, 80, 80);
		panel.add(button_7);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"4"));
			}
		});
		button_4.setFont(new Font("����", Font.PLAIN, 25));
		button_4.setBounds(80, 240, 80, 80);
		panel.add(button_4);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"1"));
			}
		});
		button_1.setFont(new Font("����", Font.PLAIN, 25));
		button_1.setBounds(80, 320, 80, 80);
		panel.add(button_1);
		
		JButton button_������ = new JButton(")");
		button_������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+")"));
			}
		});
		button_������.setFont(new Font("����", Font.PLAIN, 25));
		button_������.setBounds(80, 400, 80, 80);
		panel.add(button_������);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"8"));
			}
		});
		button_8.setFont(new Font("����", Font.PLAIN, 25));
		button_8.setBounds(160, 160, 80, 80);
		panel.add(button_8);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"5"));
			}
		});
		button_5.setFont(new Font("����", Font.PLAIN, 25));
		button_5.setBounds(160, 240, 80, 80);
		panel.add(button_5);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"2"));
			}
		});
		button_2.setFont(new Font("����", Font.PLAIN, 25));
		button_2.setBounds(160, 320, 80, 80);
		panel.add(button_2);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"0"));
			}
		});
		button_0.setFont(new Font("����", Font.PLAIN, 25));
		button_0.setBounds(160, 400, 80, 80);
		panel.add(button_0);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"9"));
			}
		});
		button_9.setFont(new Font("����", Font.PLAIN, 25));
		button_9.setBounds(240, 160, 80, 80);
		panel.add(button_9);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"6"));
			}
		});
		button_6.setFont(new Font("����", Font.PLAIN, 25));
		button_6.setBounds(240, 240, 80, 80);
		panel.add(button_6);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"3"));
			}
		});
		button_3.setFont(new Font("����", Font.PLAIN, 25));
		button_3.setBounds(240, 320, 80, 80);
		panel.add(button_3);
		
		JButton button_�� = new JButton(".");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"."));
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(240, 400, 80, 80);
		panel.add(button_��);
		
		JButton button_�� = new JButton("\u00D7");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"��"));
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(320, 160, 80, 80);
		panel.add(button_��);
		
		JButton button_�� = new JButton("-");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();				
				if(str1.length()==0)
				{
					textField.setText("0-");
				}
				else if(str1.charAt(str1.length()-1)>='0'&&str1.charAt(str1.length()-1)<='9'
						||str1.charAt(str1.length()-1)=='��'||str1.charAt(str1.length()-1)=='!'
						||str1.charAt(str1.length()-1)==')')
				{
					textField.setText(str1+"-");
				}
				else
				{
					textField.setText(str1+"0-");
				}
				
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(320, 240, 80, 80);
		panel.add(button_��);
		
		JButton button_�� = new JButton("+");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText((str1+"+"));
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(320, 320, 80, 80);
		panel.add(button_��);
		
		JButton button_�� = new JButton("=");
		button_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText()+"=";
				//��ʾ���
				calculate Cal=new calculate();
				DecimalFormat df = new DecimalFormat("0.00000");
				String a=df.format(Cal.calculate(str1));
				textField.setText(str1+a);
			}
		});
		button_��.setFont(new Font("����", Font.PLAIN, 25));
		button_��.setBounds(320, 400, 80, 80);
		panel.add(button_��);
	}

}
