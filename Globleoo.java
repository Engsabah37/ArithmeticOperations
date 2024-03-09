package com.mycompany.globleoo;

public class Globleoo 
{
        public static int globalvar;
        
    public static void main(String[] args) 
    {
       globalvar=100;
       int globalvar; //local varible hides global varible
       globalvar = 500;
        //System.out.println(globalvar);
        System.out.println(Globleoo.globalvar);
    int localx =100;
        {
        localx = 700;
        int blockvar=10;
        blockvar=300;
        }
        //blockvar =500; //but local varible 
        display();
        sum();
    }
    
public static void display ()
{
    //System.out.println(localx);//but local varible
    System.out.println(globalvar);
    
}    
    
public static int sum()
{
    
    System.out.println(globalvar);
    return 0;
}     

    
}
