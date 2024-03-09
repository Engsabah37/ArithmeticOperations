package com.mycompany.joptionoo2;

import java.awt.Color;
import javax.swing.JFrame;

public class Joptionoo2 
{

    public static void main(String[] args) 
    {
        
        JFrame far = new JFrame(); // object JFrame container
        //Frame
        //far.setVisible(false);
        far.setVisible(true); //Visible
        far.setTitle("Eng_sabah"); //JFrame Title
        far.setSize(500,100);// X,Y
        far.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // far.setResizable(true);
        far.setResizable(true);//عدم تغير في الحجم
        //far.setBackground(Color.yellow); //import awt but helper of color
        
    }
}
