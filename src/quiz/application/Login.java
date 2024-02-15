package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton submit, back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/login.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,500,600);
        add(image);
        
        JLabel heading = new JLabel("Simple Quiz");
        heading.setBounds(650, 60, 300, 200);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(650, 150, 300, 200);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        add(name);
        
         tfname = new JTextField();
        tfname.setBounds(650, 275, 250, 25);
        tfname.setFont(new Font("Mongolian Baiti",Font.PLAIN, 20));
        add(tfname);
        
        submit = new JButton("Submit");
        submit.setBounds(650, 350, 100, 25);
        submit.addActionListener(this);
        add(submit);
        
       back = new JButton("Back");
        back.setBounds(800, 350, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setSize(1000, 600);
        setLocation(130, 50);
     setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String name = tfname.getText();
             setVisible(false);
            new Submit(name);
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
public static void main(String args[]){
    new Login();
}    
}
