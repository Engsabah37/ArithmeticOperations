
package com.mycompany.scanneroo;

import java.util.Scanner;

public class Scanneroo {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        int x,y,z;
        
        /*
        طلبنا من المستخدم إدخال الرقم الأول وقمنا بقراءة الرقم
        قمنا بتخزين الرقم الذي يدخله المستخدم في المتغير
        */
        System.out.println("Enter the first number: ");
        x = scan.nextInt();
        
        /*
        طلبنا من المستخدم إدخال الرقم الثاني وقمنا بقراءة الرقم
        قمنا بتخزين الرقم الذي يدخله المستخدم في المتغير
        */
        System.out.println("Enter the second number: ");
        y = scan.nextInt();
        
        // قمنا بجمع الرقمين وطباعة الناتج
        z = x + y;
        System.out.println("the result is: " + z);
    }
}
