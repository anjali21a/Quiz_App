package quiz.application;


import javax.swing.*;//JFrame java Extended version k swing package k andart so we need to import javax.swing;
import java.awt.*;//color class iske andr hoti hai
import java.awt.event.*;//to implement actionlistner interface(awt k event pkg k andr)
///**
// *
// * @author Anjali
// */
public class Login  extends JFrame implements ActionListener{
    JButton rules, back;//globally declared variables
    JTextField tfname;
    Login()//constructor
    {
       
        setSize(1200,4000);//setSize() takes two arguments(height,Width)
        setVisible(true);//hmara jo frame hota hai uski visibility by default hidden hoti hai
        
        //by defalut frame top-left me khulta hai kyuki vo uski origin hoti hai but we can change it
        setLocation(150,80);//top-400 left-200
        
        getContentPane().setBackground(Color.WHITE);//set frame color
        
        //image uthani hai folder se
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        
        //component ko frame k upr place krne k liye
        add(image);//directly i1 ko nahi pass kar skte hai JLabel ka object bna k pass krna padega
        
        setLayout(null);//hm apna layout use kr rhe hai
        image.setBounds(0,0,600,500);
        
        //frame k upr kuchh v likhna hai to JLabel ki help se likh skte ho
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);//left,top,height,width
        add(heading);//to show heading on fram
//        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);//or
        heading.setForeground(new Color(30,144,254));
       
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        //text box
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
         
        //Rules button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);//iss wale button pe kuchha action hua hai
        add(rules);
        
        //back button
//        JButton back = new JButton("Back");
        back = new JButton("Back");//remove local declaration
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);//back button pe kch action hua hai
        add(back);
    }
     //implements actionListener 
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
        
     
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == rules) {
//            String name = tfname.getText();
//            setVisible(false);
//            new Rules(name);
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//        }
//    }
        
public static void main(String args[]){
       new Login();
   }
}

