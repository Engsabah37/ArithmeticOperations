package com.mycompany.whileoo;
import java.util.*;
public class Whileoo {



    public static void main(String[] args)
    {
     Scanner reader = new Scanner(System.in);
     
    /*int grade=0,sum =0, counter =1;
     
     while (counter<=6)
     {
         System.out.println("Enter grade for student no " + counter);
         grade = reader.nextInt();
         sum+=grade;//sum+sum=grade
         counter++; //1,2,3,4,5,6
     }
      
        System.out.println("Average of the 6 grades is "+sum/6);*/ //مجموعهم علي عددهم
     
       /*int grade =0,sum =0, counter =1;
        System.out.println("Enter 5 grade to get the average or -1 to exit");
     while (counter<=5 && grade!= -1)
     {
         System.out.println("Enter grade for student no " + counter);
         grade = reader.nextInt();
         sum+=grade;//sum+sum=grade
         counter++; //1,2,3,4,5,6
     }
        System.out.println("Average of the 6 grades is " + sum/5);*/
        
    //flag-controlled loop-program
    
     /*double sum = 0.0;
     double value ;
     boolean positiveinput = true;
        while (positiveinput == true ) //الflag
        {
            
            System.out.println("Enter The Next Positive Number");
            value = reader.nextDouble();
            if (value <0)
                
                positiveinput = false;
             else 
            sum = sum +value;
        }
        System.out.println("sum of input number is" + sum); */
     
     //declaration section : to declare needed variables
     /*int guess , rand;
     rand = (int) (Math.random()*100); // random بترجع int عشان كدة ضربنا في 100
     boolean stillplaying =true;
     System.out.println("The generanted random number is " + rand);
      while(stillplaying)
     {
         System.out.println("Guess a number between 0 and 100");
         guess = reader.nextInt(); //read guessed number
         // processing section : processing statements
         if (guess > rand)
             System.out.println("Guess too large");
         else
             if (guess < rand)
                 System.out.println("Guess too small");
         else
             {
                 System.out.println("you win!!!");
                 stillplaying = false;
            }   
        }*/
     
// ||
     
/*int n = 0;
        System.out.println(" enter a number between 1 and 10:") ;
while (n< 1 || n >10){
        n = reader. nextInt() ;
        System.out.println(n + " is between 1 and 10.");
    }*/


     }
}



