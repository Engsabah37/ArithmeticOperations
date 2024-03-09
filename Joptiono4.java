package com.mycompany.joptionoo4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Joptiono4 extends JFrame 
{
    JPanel p= new JPanel();
    JButton B = new JButton("save");
    JButton B2 = new JButton("show");
    JTextField t1 = new JTextField();
    public Joptiono4()
    {
        bmop();
    }
    public void bmop()
    {
      //setTitle("sabah");
      this.setTitle("sabah"); //this
      this.setSize(400, 200);
      this.setResizable(false);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(100, 500);
        add(p);//ADD Panel
        p.setBackground(Color.red);//Background Panel //IMPORT AWT
        add(B);
        add(B2);
        add(t1);
    }
}