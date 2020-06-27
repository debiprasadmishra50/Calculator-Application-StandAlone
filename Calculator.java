import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame  implements ActionListener
{
	JTextField tf1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	
	public Calculator() 
	{
		setLayout(null);
		setTitle("Calcaulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf1 = new JTextField();
		b1 = new JButton("1");		b2 = new JButton("2");
		b3 = new JButton("3");		b4 = new JButton("4");
		b5 = new JButton("5");		b6 = new JButton("6");
		b7 = new JButton("7");		b8 = new JButton("8");
		b9 = new JButton("9");		b10 = new JButton("0");
		b11= new JButton("+");		b12 = new JButton("-");
		b13 = new JButton("*");		b14 = new JButton("/");
		b15 = new JButton("%");		b16 = new JButton("=");
		
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);
		add(b6);	add(b7);	add(b8);	add(b9);	add(b10);	
		add(b11);	add(b12);	add(b13);	add(b14);	add(b15);
		add(b16);	add(tf1);
		
		tf1.setBounds(30,30,335,20);
		
		b1.setBounds(30,60,80,20);		b2.setBounds(115,60,80,20);
		b3.setBounds(200,60,80,20);		b4.setBounds(285,60,80,20);
		b5.setBounds(30,90,80,20);		b6.setBounds(115,90,80,20);
		b7.setBounds(200,90,80,20);		b8.setBounds(285,90,80,20);
		
		b9.setBounds(30,120,80,20);		b10.setBounds(115,120,80,20);
		b11.setBounds(200,120,80,20);	b12.setBounds(285,120,80,20);
		
		b13.setBounds(30,150,80,20);	b14.setBounds(115,150,80,20);
		b15.setBounds(200,150,80,20);	b16.setBounds(285,150,80,20);
		
		setSize (440,250);	setVisible(true);
		b1.addActionListener(this);		b2.addActionListener(this);
		b3.addActionListener(this);		b4.addActionListener(this);
		b5.addActionListener(this);		b6.addActionListener(this);
		b7.addActionListener(this);		b8.addActionListener(this);
		b9.addActionListener(this);		b10.addActionListener(this);
		b11.addActionListener(this);	b12.addActionListener(this);
		b13.addActionListener(this);	b14.addActionListener(this);
		b15.addActionListener(this);	b16.addActionListener(this);	
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
	int no1 = 0 , no2 = 0;
	char op=0;
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String text = ae.getActionCommand();
		char ch = text.charAt(0);
		
		if(Character.isDigit(ch))
		{
			tf1.setText(tf1.getText()+ch);
		}
		if(ch == '+')
		{
			no1 = Integer.parseInt(tf1.getText());
			tf1.setText("");
			op = '+';
		}
		if(ch == '-')
		{
			no1 = Integer.parseInt(tf1.getText());
			tf1.setText("");
			op = '-';
		}if(ch == '*')
		{
			no1 = Integer.parseInt(tf1.getText());
			tf1.setText("");
			op = '*';
		}
		if(ch == '/')
		{
			no1 = Integer.parseInt(tf1.getText());
			tf1.setText("");
			op = '/';
		}
		if(ch == '%')
		{
			no1 = Integer.parseInt(tf1.getText());
			tf1.setText("");
			op = '%';
		}
		if(ch == '=')
		{
			no2 = Integer.parseInt(tf1.getText());
			if(op == '+')
				tf1.setText(""+(no1 + no2));
			if(op == '-')
				tf1.setText(""+(no1 - no2));
			if(op == '*')
				tf1.setText(""+(no1 * no2));
			if(op == '/')
				tf1.setText(""+(no1 / no2));
			if(op == '%')
				tf1.setText(""+(no1 % no2));
			
		}
	}
}










