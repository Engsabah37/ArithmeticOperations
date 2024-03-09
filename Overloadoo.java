package com.mycompany.overloadoo;

import java.util.Scanner;

public class Overloadoo
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in) ;               
        int a=10 , b=20;
        //int c =30;
        char x ='A' , y ='a';
        //la
        System.out.println( larger(a, b) );
        //System.out.println(larger(a, b, c));
        System.out.println(larger(x, y) );
    }
    
    
public static int larger (int n1 ,int n2)
{
if (n1>n2) 
    return n1 ;
else
    return n2 ;
} 
  
public static int larger (int n1 ,int n2, int n3)
{
if (n1>n2 && n1>n3) 
    return n1 ;
else if (n2>n1 && n2>n3) 
    return n2 ;
else  
    return n3;
}

public static char larger (char c1 ,char c2)
{
if (c1>c2) 
    return c1 ;
else
    return c2 ;
} 

}
