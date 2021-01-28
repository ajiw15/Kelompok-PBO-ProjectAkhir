package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIDelete extends JFrame {
    JLabel delet, niklabel;
    JTextField textnikdelete;
    JButton delete,back;
    
    public GUIDelete(){
        setSize(500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        delet = new JLabel("Delete Data");
        delet.setBounds(150, 30, 600, 50);
        delet.setFont(new Font("Eras Demi ITC",Font.BOLD,30));
        delet.setForeground(Color.cyan);
        add(delet);        
        niklabel = new JLabel("NIK");
        niklabel.setBounds(150, 80, 100, 30);
        niklabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(niklabel);
        textnikdelete = new JTextField();
        textnikdelete.setBounds(150, 120, 200, 30);
        textnikdelete.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textnikdelete);
        delete = new JButton("Delete");
        delete.setBounds(200, 180, 100, 40);
        delete.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        delete.setBackground(Color.YELLOW);
        add(delete);
        back = new JButton("Back");
        back.setBounds(30, 360, 80, 30);
        back.setFont(new Font("Arial",Font.BOLD,13));
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        add(back);
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);      
        
         back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                GUIBeranda gui = new GUIBeranda();
            }         
        });
         
        delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {               
                        allobjctrl.korban.hapus(textnikdelete.getText());                        
                        JOptionPane.showMessageDialog(null,"Data Berhasil Di Hapus","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();                                   
            }
            
        });  
    }
    void kosong(){
        textnikdelete.setText(null);
   }
}
