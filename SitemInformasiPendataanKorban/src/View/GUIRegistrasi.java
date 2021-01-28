package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUIRegistrasi extends JFrame {
    JLabel login1,daftar,top,niklabel,namalabel,kerjalabel,goldarlabel,agamalabel,genderlabel,
    notelplabel,tgllahirlabel,bantuanlabel;
    JTextField textniklogin,textnikdaftar,textnamalogin,textnamadaftar,
    textkerja,textgoldar,textagama,textgender,textnotelp,texttgllahir,textbantuan;
    JButton login,reg,back;
    
   public GUIRegistrasi(){
        setSize(700, 650);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);        
        top = new JLabel("> Registrasi <");
        top.setBounds(160, 40, 600, 90);
        top.setFont(new Font("Eras Demi ITC",Font.BOLD,50));
        top.setForeground(Color.cyan);
        add(top);    
        niklabel = new JLabel("NIK");
        niklabel.setBounds(120, 150, 60, 30);
        niklabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(niklabel);
        textnikdaftar = new JTextField();
        textnikdaftar.setBounds(120, 180, 200, 30);
        textnikdaftar.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textnikdaftar);
        namalabel= new JLabel("Nama");
        namalabel.setBounds(120, 210, 100, 30);
        namalabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(namalabel);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(120, 240, 200, 30);
        textnamadaftar.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textnamadaftar);
        kerjalabel = new JLabel("Pekerjaan");
        kerjalabel.setBounds(120, 270, 100, 30);
        kerjalabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(kerjalabel);
        textkerja = new JTextField();
        textkerja.setBounds(120, 300, 200, 30);
        textkerja.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textkerja);
        goldarlabel = new JLabel("Golongan Darah");
        goldarlabel.setBounds(120, 330, 150, 30);
        goldarlabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(goldarlabel);
        textgoldar = new JTextField();
        textgoldar.setBounds(120, 360, 200, 30);
        textgoldar.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textgoldar);
        agamalabel = new JLabel("Agama");
        agamalabel.setBounds(120, 390, 200, 30);
        agamalabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(agamalabel);
        textagama = new JTextField();
        textagama.setBounds(120, 420, 200, 30);
        textagama.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textagama);
       
        genderlabel = new JLabel("Jenis Kelamin");
        genderlabel.setBounds(350, 150, 200, 30);
        genderlabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(genderlabel);
        textgender = new JTextField();
        textgender.setBounds(350, 180, 200, 30);
        textgender.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textgender);
        notelplabel = new JLabel("No Telepon");
        notelplabel.setBounds(350, 210, 150, 30);
        notelplabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(notelplabel);
        textnotelp = new JTextField();
        textnotelp.setBounds(350, 240, 200, 30);
        textnotelp.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textnotelp);
        tgllahirlabel = new JLabel("Tanggal Lahir (mm/dd/yyyy)");
        tgllahirlabel.setBounds(350, 270, 250, 30);
        tgllahirlabel.setFont(new Font("Arial Black",Font.BOLD,14));
        add(tgllahirlabel);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(350, 300, 200, 30);
        texttgllahir.setFont(new Font("Arial ",Font.PLAIN,13));
        add(texttgllahir);
        bantuanlabel = new JLabel("Bantuan");
        bantuanlabel.setBounds(350, 330, 200, 30);
        bantuanlabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(bantuanlabel);
        textbantuan = new JTextField();
        textbantuan.setBounds(350, 360, 200, 30);
        textbantuan.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textbantuan);
        reg = new JButton("Regristrasi");
        reg.setBounds(260, 480, 150, 40);
        reg.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        reg.setBackground(Color.YELLOW);
        add(reg);
        back = new JButton("Back");
        back.setBounds(30, 530, 80, 30);
        back.setFont(new Font("Comic Sans MS",Font.BOLD,13));
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
        
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
               try {
                   String nik = textnikdaftar.getText();
                   String nama = textnamadaftar.getText();
                   String kerja = textkerja.getText();                   
                   String goldar = textgoldar.getText();
                   String agama = textagama.getText();
                   String gender = textgender.getText();
                   String notelp = textnotelp.getText();
                   Date tgllahir = new Date(texttgllahir.getText());
                   String bantuan = textbantuan.getText();
                   allobjctrl.korban.insert(nik, nama,kerja,goldar,agama,gender,notelp,tgllahir,bantuan);
                   JOptionPane.showMessageDialog(null, "Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                   kosong();
                  }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, "Format Penulisan Salah","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);  
                   kosong();
               }
            }       
        });
}
   void kosong(){
        textnikdaftar.setText(null);
        textnamadaftar.setText(null);
        textkerja.setText(null);
        textgoldar.setText(null);
        textagama.setText(null);
        textgender.setText(null);
        textnotelp.setText(null);
        texttgllahir.setText(null);
        textbantuan.setText(null);
    }
}
