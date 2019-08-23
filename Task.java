import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

     class Form {
	
	JFrame frame=new JFrame();
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2;
	JTextField jtf1,jtf2,jtf3;
	JTextArea jta1,jta2;
	JComboBox<String> combo1;
	JRadioButton male,female;
	ButtonGroup g;
	String [] city= {"Choose City","Karachi","Hyderabad","Jamshoro","Badin"};
	JPanel p1,p2;
	Font font;
	Container c=frame.getContentPane();
	public Form()
	{
		frame.setVisible(true);
		frame.setSize(1100, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
		font=new Font("Arial",Font.BOLD,20);
		p1=new JPanel();
		p1.setBounds(130,650,400,200);
		
		// name
		l1=new JLabel("Name");
		l1.setBounds(150, 65, 100, 30);
		l1.setFont(font);
		jtf1=new JTextField();
		jtf1.setFont(font);
		jtf1.setBounds(270, 65, 240,40);
		
		//phone
		l2=new JLabel("Phone No");
		l2.setBounds(150, 140, 100, 30);
		l2.setFont(font);
		jtf2=new JTextField();
		jtf2.setFont(font);
		jtf2.setBounds(270, 140, 240,40);
		
		//email
		l3=new JLabel("Email");
		l3.setBounds(150, 215, 100, 30);
		l3.setFont(font);
		jtf3=new JTextField();
		jtf3.setFont(font);
		jtf3.setBounds(270, 215, 240,40);
		
		//address
		l4=new JLabel("Address");
		l4.setBounds(150, 290, 100, 30);
		l4.setFont(font);
		jta1=new JTextArea();
		jta1.setFont(font);
		jta1.setBounds(270, 290, 240,120);
		
		//city
		l5=new JLabel("City");
		l5.setBounds(150,450,100,30);
		l5.setFont(font);
		combo1=new JComboBox<>(city);
		combo1.setFont(font);
		combo1.setBounds(270,450,240,30);
		
		//radioButton
		l6=new JLabel("Gender");
		l6.setBounds(150, 525, 100, 30);
		l6.setFont(font);
		male=new JRadioButton("Male");
		female=new JRadioButton("female");
		male.setFont(font);
		male.setBounds(270, 525, 80,30);
		female.setFont(font);
		female.setBounds(410, 525, 90,30);
		g=new ButtonGroup();
		g.add(male);
		g.add(female);
		
		//show record
		jta2=new JTextArea();
		jta2.setFont(font);
		jta2.setBounds(600, 65, 380,500);
		jta2.setEditable(false);
		//JScrollPane scroll = new JScrollPane(jta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//buttons
		b1=new JButton("Submit");
		b1.setFont(font);
		b2=new JButton("Clear");
		b2.setFont(font);
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(jtf1.getText().equals("")||jtf2.getText().equals("")||jtf3.getText().equals("")||jta1.getText().equals("")||combo1.getSelectedItem().equals("Choose City"))
				{
					JOptionPane.showMessageDialog(null, "Your are not Enter any option");
				}
				else
				{
					String s;
					if(male.isSelected()) {
						s="Male";
					}
					else
					{
						s="Female";
					}
					jta2.setFont(font);
					jta2.append("\nName:        "+jtf1.getText()+"\nPhone No:  "+jtf2.getText()+"\nEmail:        "
					+jtf3.getText()+"\nAddress:    "+jta1.getText()+"\nCity:           "+combo1.getSelectedItem()
					+"\nGender:      "+s+"\n");
				}
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta2.setText("");
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jta1.setText("");
				combo1.setSelectedIndex(0);
				if(male.isSelected()) {
					
				}
				else {
					
				}
				
			}
		});
		
		
		//c.add(scroll);
		c.add(p1);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		p1.add(b1);
		p1.add(b2);
		c.add(jtf1);
		c.add(jtf2);
		c.add(jtf3);
		c.add(jta1);
		c.add(jta2);
		c.add(combo1);
		c.add(male);
		c.add(female);

	}
	
	public static void main(String[] args) {
		new Form();
		

	}

}
