
package scanner;
import java.util.Scanner;
public class scanneroo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
 int numInputs = 10, input = 0, sum = 0, stopLoop = 999;
 System.out.println("أعداد 10 أدخل");
 for (int i = 0; i < numInputs; i++) {
 numInputs = input.nextInt(); 
 if (input == stopLoop){
 break;
 } 
 else
 {
 sum += input; 
 }
 }
 System.out.println(":الأعداد مجموع "+ sum);
}

    }
    
}
