package randoo;
import java.util.Random;
public class Randoo {

    public static void main(String[] args) {
          Random num1 = new Random();
        Random num2 = new Random(50);
        
        System.out.println( num1.nextInt());
        
        System.out.println(  num1.nextInt(50));
      
       System.out.println( num1.nextDouble()); 
       
        System.out.println( num2.nextInt());
    }
    
}
