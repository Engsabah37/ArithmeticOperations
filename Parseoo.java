
package com.mycompany.parseoo;

public class Parseoo {

    public static void main(String[] args) {
     int x = 25;
        int a;
        
        double y = 12.7;
        double b;
        
        String z = "55";
        String c;
        
        //قمنا بتحويل قيمة نصية إلى عدد صحيح 
        a = Integer.parseInt(z);
  
        //قمنا بتحويل قيمة نصية إلى عدد صحيح 
        b = Double.parseDouble(z);
        
        //قمنا بتحويل القيم النصية إلى أرقام
        c = String.valueOf(y);
        z = String.valueOf(x);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println("the int a = " + a);
        System.out.println("the double b = " + b);
        System.out.println("the string c is: " + c);
        System.out.println("the string z is: " + z);
    }
}
