package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing {

	public static void main(String[] args) {
	
		  JFrame f=new JFrame("Welcome");  
		    final JTextField tf1=new JTextField();  
		    tf1.setBounds(200,100, 150,20); 
		    final JTextField tf2=new JTextField();
		    tf2.setBounds(200,150, 150,20);
		    final JTextField tf3=new JTextField();
		    tf3.setBounds(200,200, 150,20);
		    final JTextField tf4=new JTextField();
		    tf4.setBounds(200,250, 150,20);
		    final JTextField tf5=new JTextField();
		    tf5.setBounds(200,300, 150,20);
		    final JPasswordField p1 = new JPasswordField();
		    p1.setBounds(200,350, 150,20);
		    final JPasswordField p2 = new JPasswordField();
		    p2.setBounds(200,400, 150,20);
		    
		    final JTextField tf6=new JTextField();
		    tf6.setBounds(200,500, 150,20);
		    final JTextField tf7=new JTextField();
		    tf7.setBounds(200,550, 150,20);
		    final JTextField tf8=new JTextField();
		    tf8.setBounds(200,600, 150,20);
		    final JTextField tf9=new JTextField();
		    tf9.setBounds(200,650, 150,20);
		    //String s1 = tf1.getText();
		  
		    JButton b=new JButton("Submit"); 
		    b.setBounds(150,450,95,30); 
		    JLabel l,l1,l2,l3,l4,l5,l6,l7;  
		    l=new JLabel("Registration Form");  
		    l.setBounds(150,50, 150,30);
		    l1=new JLabel("First name :");  
		    l1.setBounds(50,100, 100,30);  
		    l2=new JLabel("Last name :"); 
		    l2.setBounds(50,150, 100,30);  
		    l3=new JLabel("E-mail :"); 
		    l3.setBounds(50,200, 100,30);  
		    l4=new JLabel("Phone :"); 
		    l4.setBounds(50,250, 100,30);  
		    l5=new JLabel("User name :"); 
		    l5.setBounds(50,300, 100,30);  
		    l6=new JLabel("Password :"); 
		    l6.setBounds(50,350, 100,30);  
		    l7=new JLabel("Re-Password :"); 
		    l7.setBounds(50,400, 100,30);  
		    
		   
		    
		    
		     
		    f.add(l); f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6);  f.add(l7);  
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		            tf6.setText(tf1.getText());
		            tf7.setText(tf2.getText());
		            tf8.setText(tf3.getText());
		            tf9.setText(tf4.getText());
				        }  
				    });
		    
		    f.add(b);f.add(tf1); f.add(tf2); f.add(tf3);f.add(tf4);f.add(tf5);f.add(p1);f.add(p2);f.add(tf6);
		    f.add(tf7);f.add(tf8);f.add(tf9);
		    f.setSize(500,800);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    
	}



}
