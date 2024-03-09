
package com.mycompany.tryocatchoo;

import java.util.*;

public class Tryocatchoo
{

    public static void main(String[] args)
    {
    final double pi =3.14;
        System.out.println("hi");
        System.out.println("please select 1 for area of circle , 2 for area of squre , 3 for area of tringle : ");
    Scanner input = new Scanner(System.in);
    
    try
    {
    int r = input.nextInt();
    if (r<=0)
    {
        
    }
        System.out.println("1.area of circle");
        System.out.println("2.area of squre");
        System.out.println("3.area of tringle");
        System.out.println("4.exit");
        System.out.println("enter your choice");
        
        int choice = input.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.println("area ="+ (pi*r*r));
                break;
            case 2 :
                System.out.println("circumference ="+ (2*pi*r));
                break;
            case 3 :
            System.exit(0);
                break;
            default:
                System.out.println("invalid entry!");
        }
    }
    
    
    catch(Exception e)
    {
        System.out.println("error :" + e.getMessage());
        System.exit(0);
    }
    }
    
}
