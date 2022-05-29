package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f; //declaration
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        f=new JFrame("SUPERGOLD CHEKKU OIL");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ggg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400,700,Image.SCALE_AREA_AVERAGING);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);


        b = new JButton("click here to enter");
        b.setBackground(Color.WHITE);
        

        b.setBounds(500,500,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("SUPERGOLD CHEKKU OIL");
        lid.setBounds(160,30,1500,100);
        lid.setFont(new Font("sans-serif",Font.BOLD,70));
        lid.setForeground(Color.BLACK);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}