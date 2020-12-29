import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * Class ini merupakan aplikasi kalkulator sederhana.
 * 
 * @author (Rahul Hardiyat) 
 * @version (29 Desember 2020)
 */

public class Kalkulator extends JFrame {

    private double TEMP;
    private double SolveTEMP;
    
    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    JFrame frame=new JFrame ("KALKULATOR");
    JPanel panel=new JPanel ();
    JTextField hasil1 = new JTextField ();
    //membuat button sebagai event source untuk eksekusi tindakan pengguna  
    JButton tombol1 = new JButton("1");
    JButton tombol2 = new JButton("2");
    JButton tombol3 = new JButton("3");
    JButton tombol4 = new JButton("4");
    JButton tombol5 = new JButton("5");
    JButton tombol6 = new JButton("6");
    JButton tombol7 = new JButton("7");
    JButton tombol8 = new JButton("8");
    JButton tombol9 = new JButton("9");
    JButton tombol0 = new JButton("0");
    JButton tombolHapus = new JButton("C");
    JButton tombolKali = new JButton ("x");
    JButton tombolBagi = new JButton ("/");
    JButton tombolKurang = new JButton ("-");
    JButton tombolTambah = new JButton ("+");
    JButton tombolSolve = new JButton ("=");
        
   /**
     * Method untuk tombol operator:
     * membuat action listener bagi setiap tombol dan operasi
     */
    public Kalkulator(){
        //memanggilkan method tampilan untuk menampilkan app 
        Tampilan();
        //listener untuk setiap tombol angka
        tombol1.addActionListener(new ListenToSatu());
        tombol2.addActionListener(new ListenDua());
        tombol3.addActionListener(new ListenTiga());
        tombol4.addActionListener(new ListenEmpat());
        tombol5.addActionListener(new ListenLima());
        tombol6.addActionListener(new ListenEnam());
        tombol7.addActionListener(new ListenTujuh());
        tombol8.addActionListener(new ListenDelapan());
        tombol9.addActionListener(new ListenSembilan());
        tombol0.addActionListener(new ListenNol());
        //listener untuk setiap tombol operasi
        tombolTambah.addActionListener(new ListenToTambah());
        tombolKurang.addActionListener(new ListenToKurang());
        tombolKali.addActionListener(new ListenToKali());
        tombolBagi.addActionListener(new ListenToBagi());
        tombolSolve.addActionListener(new ListenToSolve());
        tombolHapus.addActionListener(new ListenToHapus());
    } 
    
     /**
     * Method untuk tampilan
     * membuat frame & icon tombol
     */
    public void Tampilan(){
        frame.setVisible(true);
        frame.setSize(226,254);
        frame.setResizable(false);
        frame.setLocation(500,300);
        frame.setLayout(null);
        
        frame.add(panel);
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setSize(220,190);
        panel.setBackground(new java.awt.Color(255,0,0));
        
        panel.add(hasil1);
        hasil1.setEditable (false);
        //mengatur posisi untuk setiap tombol
        panel.add(hasil1);
        hasil1.setBounds (0,0,220,50);

        panel.add(tombol7);
        tombol7.setBounds (0,50,55,35);

        panel.add(tombol8);
        tombol8.setBounds (55,50,55,35);

        panel.add(tombol9);
        tombol9.setBounds (110,50,55,35);

        panel.add(tombol4);
        tombol4.setBounds (0,85,55,35);

        panel.add(tombol5);
        tombol5.setBounds (55,85,55,35);

        panel.add(tombol6);
        tombol6.setBounds (110,85,55,35);

        panel.add(tombol1);
        tombol1.setBounds (0,120,55,35);

        panel.add(tombol2);
        tombol2.setBounds (55,120,55,35);

        panel.add(tombol3);
        tombol3.setBounds (110,120,55,35);

        panel.add(tombol0);
        tombol0.setBounds (55,155,55,35);
        
        panel.add(tombolHapus);
        tombolHapus.setBounds (0,155,55,35);

        panel.add(tombolBagi);
        tombolBagi.setBounds (165,155,55,35);

        panel.add(tombolTambah);
        tombolTambah.setBounds (165,50,55,35);

        panel.add(tombolKurang);
        tombolKurang.setBounds (165,85,55,35);

        panel.add(tombolKali);
        tombolKali.setBounds (165,120,55,35);

        panel.add(tombolSolve);
        tombolSolve.setBounds (110,155,55,35);

        panel.add(tombolHapus);
        tombolHapus.setBounds (0,155,55,35);
        
    }
    
    /**
     * Implementasi listener class
     * Melakukan tindakan terhadap tombol dari pengguna
     * menampilkan angka inputan penguna daya layar
     * mengimplementasi interface ActionListener
     * tombol 1, 2, 3, 4, 5, 6, 7, 8, 9 , 0 dan operasi lainnya
     */
    //event untuk button 1
     class ListenToSatu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "1");
        }
    }
    //event untuk button 2
    class ListenDua implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "2");
        }
    }
    //event untuk button 3
     class ListenTiga implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "3");
        }
    }
    //event untuk button 4
    class ListenEmpat implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "4");
        }
    }
    //event untuk button 5
    class ListenLima implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "5");
        }
    }
    //event untuk button 6
    class ListenEnam implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "6");
        }
    }
    //event untuk button 7
    class ListenTujuh implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "7");
        }
    }
    //event untuk button 8
    class ListenDelapan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "8");
        }
    }
    //event untuk button 9
     class ListenSembilan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           display = hasil1.getText();
           hasil1.setText(display + "9");
        }
    }
    //event untuk button 0
    class ListenNol implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = hasil1.getText();
            hasil1.setText(display + "0");
        }
    }
    //event untuk button penambahan
    class ListenToTambah implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(hasil1.getText());
            hasil1.setText("");
            addBool = true;
        }
    }
    //event untuk button pengurangan
    class ListenToKurang implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(hasil1.getText());
            hasil1.setText("");
            subBool = true;
        }
    }
    //event untuk button perkalian
    class ListenToKali implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(hasil1.getText());
            hasil1.setText("");
            mulBool = true;
        }
    }

    class ListenToBagi implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(hasil1.getText());
            hasil1.setText("");
            divBool = true;
        }
    }
    //event untuk button hapus
     class ListenToHapus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = hasil1.getText();
            hasil1.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }
    
    /**
     * Implementasi listener class
     * Melakukan tindakan/operasi terhadap tombol dari pengguna
     * operasi yang dilakukan tambah, kali, bagi dan pengurangan
     */
    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(hasil1.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = TEMP /SolveTEMP;
            hasil1.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }
}


