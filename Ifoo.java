package ifoo;
import java.util.Scanner;
public class Ifoo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
    // ||
    
    int marks ;
        System.out.println("enter your mark");
    marks = input.nextInt();
    if (marks >=0 || marks <=100)
            System.out.println("the number between 0 and 100");
    else 
        System.out.println("the number is out of range");
    
    }
       
    }


