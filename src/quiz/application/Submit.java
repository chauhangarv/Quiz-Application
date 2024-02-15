package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Submit extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    JTextField tfname;
    
    Submit(String name){
        this.name = name;
        
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome"+" "+name);
        heading.setBounds(0, 20, 800, 100);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
         heading.setForeground(Color.WHITE);
        add(heading);
        heading = new JLabel("Rules & Regulation");
        heading.setBounds(350, 90, 800, 100);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(Color.WHITE);
        add(heading);
        
         JLabel submit = new JLabel();
        submit.setBounds(50, 160, 800, 300);
        submit.setFont(new Font("Tahona", Font.PLAIN, 15));
        submit.setText(
        "<html>"+
                 "1.Yelling out answers it do not disrupts the quiz."+"<br><br>"+
                 "2.Cell Phones and other sources are allowed in the quiz."+"<br><br>"+
                 "3.Without any unmeanfull objects entry is prohibited in the quiz."+"<br><br>"+
                 "4.Change answers is not allowed once you completed or not completed."+"<br><br>"+
                 "5.Time is not negotiable because it can't wait for anyone."+"<br><br>"+
                 "6.This quiz is just for fun take it seriously."+"<br><br>"+
                 "</html>"
        );
        submit.setForeground(Color.WHITE);
        add(submit);
        
        back = new JButton("Back");
        back.setBounds(350, 450, 100, 25);
        back.addActionListener(this);
        add(back);
        
         start = new JButton("Start");
        start.setBounds(550, 450, 100, 25);
        start.addActionListener(this);
        add(start);
        
        setSize(1000,600);
        setLocation(130,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
           // setVisible(false);
            new Start(name);
            String name = tfname.getText();
             setVisible(false);
            new Start(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Submit("User");
    }
}
