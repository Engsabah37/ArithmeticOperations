package arryss;
import java.util.Scanner;
public class Arrayss {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
   
    /*double s1, s2;
        System.out.println("Enter 1st salary");
        s1 = input.nextDouble();
        System.out.println("Enter 2st salary");
        s2 = input.nextDouble();
        
        s1=s1 + (s1*0.10);
        s2=s2 + (s2*0.10);
        System.out.println(s1);
        System.out.println(s2);*/
    
    //array
    //user input of size the array
     
    /*System.out.println("Enter Size of array");
    int size;
    size = input.nextInt();
    double[] salaries = new double[size];*/
    
   // array initialization
    /*double[] salaries = {1000.1, 200.2, 3000.3}; 
    System.out.println(salaries[0]);*/
    
    
    //accessing array elements
     
    /*System.out.println("Enter Size of array");
    int size;
    size = input.nextInt();
    double[] salaries = new double[size];
    
    for(int i=0; i<salaries.length; i++)
    {
     //System.out.println("Enter salary for employee No" + i);
     System.out.println("Enter salary for employee No" + (i+1));
     salaries[i]=input.nextDouble();*/
    
    //the sum and the average
    /*System.out.println("Enter Size of array");
     int size;
    size = input.nextInt();
    double[] salaries = new double[size];
    
    for(int i=0; i<salaries.length; i++)
    {
     System.out.println("Enter salary for employee No" + (i+1));
     salaries[i]=input.nextDouble();
    }
     double sum=0;
     for(int i=0; i<salaries.length; i++)
     {
         sum+=salaries[i];
     }
        System.out.println("the sum of salaries is" + sum);
        System.out.println("the average of salaries is"+sum/salaries.length);*/
    
     //the sum and the average of positive intger
    System.out.println("Enter Size of array");
     int size;
    size = input.nextInt();
    int[] numbers = new int[size];
    
    for(int i=0; i<numbers.length; i++)
    {
     System.out.println("Enter number for employee No" + (i+1));
     numbers[i]=input.nextInt();
    }
     double sum=0 , count=0;
     for(int i=0; i<numbers.length; i++)
     {
       if (numbers[i]>0 )  
         sum+=numbers[i];
       count++;
     }
        System.out.println("the average of positive numbers is"+sum/count);
  
   /*for (int i = 0; i <5; i++){
        System.out.println(i);*/
     
   /* String [] name = {"Eng", "sabah","Gomaa"};
    for (int i = 0; i <name.length; i++){
        System.out.println(name[i]);*/
   
   /*String [] name = {"Eng", "sabah","Gomaa"};
    for (String names: name){
        System.out.println(names);*/
   
   /*char[] charcter = {'a', 'b','c'};
    for (char chr: charcter){
        System.out.println(chr);*/
   
    }
    
}
