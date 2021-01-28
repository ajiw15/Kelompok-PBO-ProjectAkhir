package View;

import Entity.StatusEntity;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class GUIView extends JFrame {
   JButton back,dftrbtn;
    JTextArea area = new JTextArea();
    JLabel datakorban,daftarstatus;
    JComboBox pilstatus = new JComboBox(StatusEntity.status);
    int cek = allobjctrl.korban.cekDataKorban(allobjctrl.korban.korban().getNik());
    
    public GUIView(){
        setSize(720, 600);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        datakorban = new JLabel("Data Korban");
        datakorban.setFont(new Font("Eras Demi ITC",Font.BOLD,30));
        datakorban.setForeground(Color.cyan);
        datakorban.setBounds(120, 30, 250, 30);
        add(datakorban);
        area.setBounds(30, 90, 400, 300);
        area.setBackground(Color.white);
        area.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(area);
        daftarstatus = new JLabel("Daftar Status");
        daftarstatus.setBounds(455, 30, 250, 30);
        daftarstatus.setFont(new Font("Eras Demi ITC",Font.BOLD,30));
        daftarstatus.setForeground(Color.cyan);
        add(daftarstatus);
        pilstatus.setBounds(450, 90, 230, 30);
        pilstatus.setFont(new Font("Arial Black",Font.BOLD,13));
        pilstatus.setBackground(Color.yellow);
        add(pilstatus);
        dftrbtn = new JButton("Daftar");
        dftrbtn.setBounds(500, 150, 100, 30);
        dftrbtn.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        dftrbtn.setBackground(Color.yellow);
        add(dftrbtn);
        back = new JButton("Back");
        back.setBounds(30, 450, 80, 30);
        back.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        add(back);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(cek==-1){
           JOptionPane.showMessageDialog(null, "Anda Belum Daftar Status","information",JOptionPane.INFORMATION_MESSAGE);
        }else if(cek==-2){
            JOptionPane.showMessageDialog(null, "Anda Belum Daftar Status","information",JOptionPane.INFORMATION_MESSAGE);
        }else{
            area.setText(datakorban());
        }
        
        dftrbtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int indexstatus = pilstatus.getSelectedIndex();
                allobjctrl.korban.daftarstatus(indexstatus, allobjctrl.korban.getData());
                area.setText(datakorban());                
            }         
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                GUIBeranda utama = new GUIBeranda();
            }         
        });
    }
        
        String datakorban(){
        int cek = allobjctrl.korban.cekDataKorban(allobjctrl.korban.korban().getNik());
        String text = "\n NIK = "+allobjctrl.korban.showDataKorban(cek).getKorban().getNik()
        +"\n"+ " Nama = "+allobjctrl.korban.showDataKorban(cek).getKorban().getNama()+"\n"
        + " Pekerjaan = "+allobjctrl.korban.showDataKorban(cek).getKorban().getPekerjaan()+"\n"
        + " Golongan Darah = "+allobjctrl.korban.showDataKorban(cek).getKorban().getGoldarah()+"\n"
        + " Agama = "+allobjctrl.korban.showDataKorban(cek).getKorban().getAgama()+"\n"
        + " Jenis Kelamin = "+allobjctrl.korban.showDataKorban(cek).getKorban().getJeniskelamin()+"\n"
        + " No Telp = "+allobjctrl.korban.showDataKorban(cek).getKorban().getNotelp()+"\n"
        + " Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(allobjctrl.korban.showDataKorban(cek).getKorban().getTglLahir())
        +"\n"+ " Bantuan = "+allobjctrl.korban.showDataKorban(cek).getKorban().getBantuan()
        +"\n"+ " Status = "+StatusEntity.status[allobjctrl.korban.showDataKorban(cek).getIndexStatus()];
        return text;
    }
}
