package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static quiz.application.Start.score;
//import javax.swing.JOptionPane;


public class Score extends JFrame implements ActionListener {
    
    JButton submit;
   // JTextField tfname;
    
    Score(String name, int score){
         setBounds(130, 50, 1000, 600);
         getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/score.jpg"));
         Image i2 = i1.getImage().getScaledInstance(500, 450, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60,100,340,290);
        add(image);
        
         JLabel heading = new JLabel("ThankYou" +" "+ name +" "+"for playing Quiz.");
        heading.setBounds(500, 30, 500, 90);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahona", Font.PLAIN, 30));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is "+" "+ score);
        lblscore.setBounds(500, 200, 500, 30);
        lblscore.setForeground(Color.WHITE);
        lblscore.setFont(new Font("Tahona", Font.PLAIN, 30));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(550, 360, 100, 30);
        //submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
//         back = new JButton("Exit");
//        back.setBounds(650, 400, 100, 30);
//        back.addActionListener(this);
//        JFrame frame = new JFrame("Exit");
//        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Exit", JOptionPane.YES_NO_CANCEL_OPTION)== JOptionPane.YES_NO_OPTION){
//        System.exit(0);
//        }
//        add(back);
//        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
     
    }
    
    public static void main(String[] args){
        new Score("User", 0);
    }
}
