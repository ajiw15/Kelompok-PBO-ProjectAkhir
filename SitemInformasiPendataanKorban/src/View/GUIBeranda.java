package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIBeranda extends JFrame {
   JLabel top;
   JButton login,reg,update,delete;
    
   public GUIBeranda(){
       setSize(700, 600);
       setLayout(null);
       getContentPane().setBackground(Color.GRAY); 
       top = new JLabel("Data Korban Bencana");
       top.setBounds(110, 50, 650, 50);
       top.setFont(new Font("Eras Bold ITC",Font.BOLD,40));
       top.setForeground(Color.cyan);
       add(top);    
       reg = new JButton("Registrasi");
       reg.setBounds(200, 140, 300, 50);
       reg.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       reg.setBackground(Color.yellow);
       add(reg);
       login = new JButton("Login");
       login.setBounds(200, 200, 300, 50);
       login.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       login.setBackground(Color.yellow);
       add(login); 
       update = new JButton("Update");
       update.setBounds(200, 260, 300, 50);
       update.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       update.setBackground(Color.yellow);
       add(update); 
       delete = new JButton("Delete");
       delete.setBounds(200, 320, 300, 50);
       delete.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       delete.setBackground(Color.yellow);
       add(delete); 
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setLocationRelativeTo(null);
        
        login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUILogin login = new GUILogin();
                        dispose();                
            }            
        });
        
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUIRegistrasi register = new GUIRegistrasi();
                        dispose();                
            }            
        });
        
        update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUIUpdate update = new GUIUpdate();
                        dispose();                
            }            
        });
        
         delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        GUIDelete del = new GUIDelete();
                        dispose();                
            }            
        });
   }
}
