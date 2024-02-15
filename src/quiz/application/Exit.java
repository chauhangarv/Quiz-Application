//package quiz.application;
//
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import javax.swing.JOptionPane;
//
//
//public class Exit extends JFrame implements ActionListener {
//     JButton submit,back;
//     JTextField tfname;
//    
//     
//     Exit(String name){
//         setBounds(130, 50, 300, 100);
//         getContentPane().setBackground(Color.BLACK);
//        setLayout(null);
//        
//         JFrame frame = new JFrame("Exit");
//        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Exit", JOptionPane.YES_NO_CANCEL_OPTION)== JOptionPane.YES_NO_OPTION){
//        System.exit(0);
//        }
//     }
//    
//    
//    public static void main(String[] args){
//        new Exit();
//    }
//    
//}
