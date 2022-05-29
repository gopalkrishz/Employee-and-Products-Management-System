package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Products implements ActionListener{
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String stockname,quantity,IFS,manf,exp;
    JButton b1,b2;
    ImageIcon icon;

    Print_Products(String ifs){
        try{
            conn con = new conn();
            String str = "select * from stocks where IFS = '"+ifs+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){


                stockname = rs.getString("stockname");
                quantity = rs.getString("quantity");
                IFS = rs.getString("IFS");
                manf = rs.getString("manf");
                exp = rs.getString("exp");

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        f=new JFrame("Print Data");
        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);
        f.setBackground(Color.white);
        f.setLayout(null);


        id9=new JLabel();
        id9.setBounds(0,0,595,642);
        id9.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpeg"));
        id9.setIcon(img);

        id8 = new JLabel("Employee Details");
        id8.setBounds(50,10,250,30);
        f.add(id8);
        id8.setForeground(Color.white);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id9.add(id8);
        f.add(id9);
        aid = new JLabel(IFS);
        aid.setBounds(140,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        aid.setForeground(Color.orange);
        id9.add(aid);

        id1 = new JLabel("product:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.white);
        id9.add(id1);

        aid1 = new JLabel(stockname);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        aid1.setForeground(Color.white);
        id9.add(aid1);


        id2 = new JLabel("quantity:");
        id2.setBounds(50,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.white);
        id9.add(id2);

        aid2 = new JLabel(quantity);
        aid2.setBounds(200,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        aid2.setForeground(Color.white);
        id9.add(aid2);

        id3= new JLabel("IFS:");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.white);
        id9.add(id3);

        aid3= new JLabel(IFS);
        aid3.setBounds(200,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        aid3.setForeground(Color.white);
        id9.add(aid3);


        id4= new JLabel("expiry date:");
        id4.setBounds(50,270,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.white);
        id9.add(id4);

        aid4= new JLabel(exp);
        aid4.setBounds(200,270,300,30);
        aid4.setFont(new Font("serif",Font.BOLD,20));
        aid4.setForeground(Color.white);
        id9.add(aid4);

        b1=new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        id9.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,520,100,30);
        b2.addActionListener(this);
        id9.add(b2);


    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[] args){
        new Print_Data("Print Data");
    }

}