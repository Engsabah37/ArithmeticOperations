
package com.mycompany.replaceoo;

public class Replaceoo {

    public static void main(String[] args) {
    String name = "youssef";
        String department = " programming";
        
        System.out.println("the number of character of your name is: " + name.length());
        
        System.out.println("the first character in your name is: " + name.charAt(0));
        
        System.out.println("the index of \"p\" in your department is: " + department.indexOf("p"));
        
        String name1 = name.replace('y', 'Y');
        
        System.out.println("the new name is: " + name1);
        
        System.out.println("the result of concatenating the two string is: " + name1.concat(department));
        
        System.out.println("the result of comparing the name and name1 is: " + name.compareTo(name1));

    }
}
