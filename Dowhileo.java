package com.mycompany.dowhileo;
import java.util.Scanner;
public class Dowhileo {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        //while vs do-while
    
    /*int grade=0,sum =0, counter =1;
     
        System.out.println("Enter 6 grade to get the average");
    do
     {
         System.out.println("Enter grade for student no " + counter);
         grade = reader.nextInt();
         sum+=grade;//sum+sum=grade
         counter++; //1,2,3,4,5,6
     }
    while (counter<=6);
        System.out.println("Average of the 6 grades is "+sum/6);*/
    
        
   /* int option;
    int num1=20, num2=10;
do 
{            
    System.out.println("select your choise from menu");
    System.out.println("1.sum 2 numbers");
    System.out.println("2.subtract 2 numbers");
    System.out.println("divide 2 numbers");
    System.out.println("0.exit");
    option = reader.nextInt();
    switch (option)
    {
        case 1:
            System.out.println("sum of the 2 numbers is" + (num1+num2));
            break;
        case 2:
            System.out.println("Subtract of the 2 numbers is" + (num1-num2));
            break;
        case 3:
            System.out.println("divide of the 2 numbers is" + (num1/num2));
            break;
        case 0:
            System.out.println("good bye");
            break;
        default:
            System.out.println("Invalid Option");
            break;
    }
}        
while (option !=0);*/
   
   // ||
   
   /*int n;
do {
System.out.println(" enter a number between 1 and 10:") ;
n = reader. nextInt() ;
} 
while (n< 1 || n >10);
System.out.println(n + " is between 1 and 10.");*/
    }

}