package com.mycompany.twodimensionalarraymethod;

import java.util.Scanner;

public class TwoDimensionalArraymethod 
{

   
    // TwoDimensionalArraymethod
    
 static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {

    
    int [][]matrix =new int [5][3];
        fillarray(matrix);
        System.out.println("array filled");
        
        System.out.println("array will be printed");
        printarray(matrix);
        
        System.out.println("array will be summed");
       int total = sumarray(matrix);
        System.out.println(total);
    }
    
    
    
    public static void fillarray(int[][]list)
    {
       for(int row =0; row<list.length; row++)
           for(int col =0; col<list[0].length; col++)
           {
                System.out.println("Enter Data for row no" + (row+1) + "and column no" + (col+1) );
                list[row][col]=input.nextInt();
           }
           
    }
       
    
    public static void printarray(int[][]list)
    {
       for(int row =0; row<list.length; row++)
           for(int col =0; col<list[0].length; col++)
           {
              System.out.println(row + col );
           }
           
    }
    
    
    public static int sumarray(int[][]list)
    {
        int sum=0;
       for(int row =0; row<list.length; row++)
           for(int col =0; col<list[0].length; col++)
           {
               sum+=list[row][col];
           }
     return sum;
           
    }
    
    
}
