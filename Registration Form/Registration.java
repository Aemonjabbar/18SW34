import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;
public class Registration extends JFrame implements ActionListener   
{  
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;  
    JTextField  tf2,tf3,tf4, tf6;  
    JButton btn1, btn2;
    JRadioButton r1=new JRadioButton("Male");
    JRadioButton r2=new JRadioButton("Female");  
    JComboBox c;
    JPasswordField p1, p2;  
    Registration()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Registration Form in Java");  
        l1 = new JLabel("Registration Form in Windows Form:");  
        l1.setForeground(Color.RED);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:"); 
        l2.setForeground(Color.BLUE);  
        l3 = new JLabel("Phone no:");  
        l3.setForeground(Color.BLUE);
        l4 = new JLabel("Email:"); 
        l4.setForeground(Color.BLUE); 
        l5 = new JLabel("Password:"); 
        l5.setForeground(Color.BLUE); 
        l6 = new JLabel("Address:");
        l6.setForeground(Color.BLUE);  
        l7 = new JLabel("City:"); 
        l7.setForeground(Color.BLUE); 
        l8 =new JLabel("Gender:");
        l8.setForeground(Color.BLUE);
         String s[]={"Karachi","hyderabad"};
         c=new JComboBox(s);  
        
        tf2 = new JTextField();  
     
        tf3 = new JTextField();  
        tf4=new JTextField();
          
        
        p1 = new JPasswordField();  
        tf6 = new JTextField();  
         
        
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");
          
        
        btn1.addActionListener(this);  
        btn2.addActionListener(this);
          
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 330, 200, 30);  
          
         
        tf2.setBounds(300, 70, 200, 30);  
        tf3.setBounds(300, 110, 200, 30);
         
         
         tf4.setBounds(300,150,200,30); 
         
        
        p1.setBounds(300, 190, 200, 30);  
        tf6.setBounds(300, 230, 200, 30);  
           c.setBounds(300, 290, 200, 30) ;
        r1.setBounds(300, 330, 200, 30);
        r2.setBounds(300, 370 , 200, 30);
        btn1.setBounds(50, 470, 100, 30);  
        btn2.setBounds(170, 470, 100, 30);
        
         ButtonGroup bg=new ButtonGroup();
         bg.add(r1);bg.add(r2);


        add(l1);  
        add(l2);  
        add(tf2);  
        add(l3);  
        add(tf3);  
        add(l4); 
         add(tf4); 
 
        add(l5); 
          
        add(p1) ; 
        add(l6);
        add(tf6);
        add(l7);  
        add(c); 
        add(l8);
          
        add(btn1);  
        add(btn2);  

        add(r1);
        add(r2);
        
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {  
           
            String s2 = tf2.getText();  
            String s3 = tf3.getText(); 
            String s4 = tf4.getText(); 
            char[] s5 = p1.getPassword();  
              
            

            String s8 = new String(s3);  
           
              
            
            String s6 = tf6.getText();  
            
            
          }else  
           {
            tf2.setText("");  
            tf3.setText("");  
            tf4.setText("");
            p1.setText("");  
             
         
            tf6.setText(""); 
             
          
    }
    }   
    public static void main(String args[])  
    {  
        new Registration();  
    }  
 
}