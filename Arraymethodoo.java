package com.mycompany.arraymethodoo;

import java.util.Scanner;

public class Arraymethodoo {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
    
        System.out.println("Enter size of Array");    
        int size;
        size =input.nextInt(); 
        int [] ids = new int [size];
        fillarray(ids);
        
        printarray(ids);
        
        System.out.println("Enter the id to search for");
        int searchedid= input.nextInt();
        int returnedindex = search(ids, searchedid);
        
        if(returnedindex>=0)
            System.out.println("The item is found"); 
        else
            System.out.println("The item is not found");
    }
    
    public static void fillarray(int[]list)
    {
       for(int i =0; i<list.length; i++)
       {
           System.out.println("Enter No " + (i+1) );
           list [i]= input.nextInt();
       }
           
    }
    
    
    public static void printarray(int[]list)
    {
       for(int i =0; i<list.length; i++)
       {
           System.out.println(list[i] );
       }
           
    }
    
   public static int search(int[]list,int target)
    {
       for(int i =0; i<list.length; i++)
       if(list[i]==target)
           return i;
       return -1;
    } 
   
   
   
}
