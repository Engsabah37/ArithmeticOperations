
package com.mycompany.methodsoo;

import java.util.Scanner;


public class Methodsoo
{
    
   /* public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println(Math.sqrt(25));
        double i = 32;
        System.out.println(Math.sqrt(i));
        
    }*/

    
   /* public static void main(String[] args) 
        {
         Scanner input = new Scanner(System.in);
         System.out.println("start of the program");
          drowline();
            System.out.println("Welcom  to the first part in function");
            drowline();
            drowline();
            drowline();
            drowline();
            drowline();
            drowline();
            drowline();
            drowline();
        }
    
   //void drowline()
   public static void drowline() 
   {
    for(int i = 0; i<10; i++)
   {
   System.out.println('*');
   }
    System.out.println();
   }
    
} */



/*public static void main(String[] args) 
        {
         Scanner input = new Scanner(System.in);
         System.out.println("start of the program"); 
          drowline('*');
            System.out.println("Welcom  to the first part in function");
            drowline('$');
            drowline('a');
            drowline('b');
            drowline('c');
            drowline('d');
        }
    
   public static void drowline(char ch) 
   {
    for(int i = 0; i<200; i++)
   {
   System.out.println(ch);
   }
    System.out.println();
   }
    
}/*
    

/*public static void main(String[] args) 
        {
         Scanner input = new Scanner(System.in);
         System.out.println("start of the program");
          drowline('*', 10);
            System.out.println("Welcom  to the first part in function");
            drowline('$',20);
            drowline('a', 200);
            drowline('#', 5);
        }
    

   public static void drowline(char ch, int length ) 
   {
    for(int i = 0; i<length; i++)
   {
   System.out.println(ch);
   }
    System.out.println();
   }
    
}*/
    


/*public static void main(String[] args) 
        {
         Scanner input = new Scanner(System.in);
         int x = 20, y =10,total =0;
            System.out.println(sum(x, y));
            total= sum (x,y);
            total= sum(x, y) * 5/3;
            System.out.println(total);
        }
    
   
   public static void drowline(char ch, int length ) 
   {
    for(int i = 0; i<length; i++)
   {
   System.out.println(ch);
   }
    System.out.println();
   }
   
   public static int sum(int i , int j)
   {
    int result ;
    result = i + j;
    return result ;
   }
}*/
    

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3 ,total;
        double avg;
        System.out.println("Enter 3 Number");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
    total = sum(num1, num2, num3);
        avg = average(num1, num2, num3);
            display(total, avg);
    }
    
public static int sum(int n1, int n2, int n3)
{
    return n1+n2+n3;
    
}

public static double average (int n1, int n2, int n3)
{
    //n1,n2,n3 peratme average
  return sum (n1,n2,n3)/3;
}  

public static void display (int s , double a)
{
    System.out.println("The sum of the 3 numbers is " + s);
    System.out.println("The average of the 3 numbers is " + a);
}
 

}









