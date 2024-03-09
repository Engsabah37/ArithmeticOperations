package switchoo;
import java.util.Scanner;
public class Switchoo {

    public static void main(String[] args) {
   
    Scanner reader = new Scanner(System.in);
    
    // Example if
    
     /*char grade;
        System.out.println("Enter your grade");
    grade = reader.next().charAt(0);
    
    if(grade =='A')
            System.out.println("Excellent");
     else if(grade == 'B')
            System.out.println("Very good");
     else if(grade == 'C')
            System.out.println("good");
     else if(grade == 'D')
            System.out.println("fair");
     else if(grade == 'F')
            System.out.println("failed");
     else 
        System.out.println("The grade is invalid");*/
    
    //Example switch
    
    /* char grade;
        System.out.println("Enter your grade");
    grade = reader.next().charAt(0);
    switch (grade)
    {
        case 'A':
            System.out.println("Excellent");
            break; //ايه اللي هيحصل لو مافيش break
        //case'A':
        case 'B':
            System.out.println("Very good");
            break;
        case 'C':
            System.out.println("good");
            break;
        case 'D':
            System.out.println("fair");
            break;
        case 'F':
            System.out.println("failed");
            break;
        default:
            System.out.println("Invaild grade");
    }*/
    
     /*int choise, num1,num2 ;
        System.out.println("Enter your choise:");
        System.out.println("1.add two numbers");
        System.out.println("2.Get the double of a positive number");
        System.out.println("3.Get the square of a number");
        choise = reader.nextInt();
    switch (choise)
    {
        case 1 :
            System.out.println("1.Enter two numbers");
            num1 =reader.nextInt();
            num2 =reader.nextInt();
            System.out.println(num1+num2);
        break;
        case 2 :
            System.out.println("2.Enter two numbers");
            num1 =reader.nextInt();
            num2 =reader.nextInt();
            System.out.println(num1-num2);
        break;        
        case 3 :
            System.out.println("3.Get the square of a number");
            num1 =reader.nextInt();
            if(num1>0)
            System.out.println(num1*num1);
        break;
        
        default:
            System.out.println("Invalid Input choise");
    }*/
    
    //the some action
    
    /*char ch;
        System.out.println("Enter charcter to test");
       ch = reader.next().charAt(0);
       
       switch(ch)
       {
           case 'a' :
           case 'e' :
           case 'o' :
           case 'i' :
           case 'u' :
        System.out.println("This is vowel ");
        break;
        default:
           System.out.println("this is Normal charcter");
        // switch vs. nested if
        
       }*/
    } 
}
    
