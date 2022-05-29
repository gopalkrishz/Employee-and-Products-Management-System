package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details extends Thread implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;

    details(){

        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/web.jpg"));
        l1.setIcon(i1);
        f.add(l1);


        l2 = new JLabel("Employee Details");
        l2.setBounds(430,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);
        b1.setVisible(true);


        b2=new JButton("View");
        b2.setBounds(530,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(420,140,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        JLabel lable2 = new JLabel("Products Details");
        lable2.setBounds(430,199,200,40);
        lable2.setFont(new Font("serif",Font.BOLD,25));
        lable2.setForeground(Color.black);
        l1.add(lable2);
        b5=new JButton("add ");
        b5.setBounds(430,270,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);
         b6=new JButton("remove");
        b6.setBounds(550,270,100,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        l1.add(b6);
        b7=new JButton("view");
        b7.setBounds(490,350,100,40);
        b7.setFont(new Font("serif",Font.BOLD,15));
        b7.addActionListener(this);
        l1.add(b7);

        f.setVisible(true);
        f.setSize(700,500);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==b5){
            f.setVisible(false);
            new AddStocks();
        }
        if(ae.getSource()==b6){
            f.setVisible(false);
            new RemoveStocks();
        }
        if(ae.getSource()==b7){
            f.setVisible(false);
            new View_Employee();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
