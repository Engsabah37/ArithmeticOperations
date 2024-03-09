
package com.mycompany.revisiononloopoo;

import java.util.Scanner;

public class Revisiononloopoo 
{

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    
    /*int passclass;         //passengers class
             double bagWeight;     //passengers bag Weight
             double excessWeight; //passengers excess Weight
             double charge = -1; //charge on excess Weight
        
            System.out.println("please enter passengers class");
             passclass = input.next().charAt(0);
        
             System.out.println("please enter bag weight");
             bagWeight = input.nextDouble();
             
        switch (passclass)
            {
                case 'f':
                case 'F':
                    if(bagWeight>30)
                    {
                        excessWeight = bagWeight-30;
                        charge = excessWeight * 10;
                    }
                    break;
                case 'b':    
                case 'B':
                    if(bagWeight>25)
                    {
                        excessWeight = bagWeight-25;
                        charge = excessWeight * 10;
                    }
                    break;
                case 'e':
                case 'E':
                    if(bagWeight>20)
                    {
                        excessWeight = bagWeight-20;
                        charge = excessWeight * 10;
                    }
                    break;
                default :
                    System.out.println("You entered invalid class");

            }
        
            System.out.println("You Have To Pay Extra Char equal " + charge );*/
             
             
            //same example loop
            
             /*int passclass; //passengers class
             double bagWeight; //passengers bag Weight
             double excessWeight; //passengers excess Weight
             double charge = -1; //charge on excess Weight
            int numberofpassengers; //number of to passengers
             
             System.out.println("please enter number of passengers");
            numberofpassengers = input.nextInt();
            
            for( int counter =1; counter<numberofpassengers; counter++ )  
                {   
                    System.out.println("please enter passengers class for passenger no" +counter);
                     passclass = input.next().charAt(0);

                     System.out.println("please enter bag weight");
                     bagWeight = input.nextDouble();

                switch (passclass)
                    {
                        case 'f':
                        case 'F':
                            if(bagWeight>30)
                            {
                                excessWeight = bagWeight-30;
                                charge = excessWeight * 10;
                            }
                            break;
                        case 'b':    
                        case 'B':
                            if(bagWeight>25)
                            {
                                excessWeight = bagWeight-25;
                                charge = excessWeight * 10;
                            }
                            break;
                        case 'e':
                        case 'E':
                            if(bagWeight>20)
                            {
                                excessWeight = bagWeight-20;
                                charge = excessWeight * 10;
                            }
                            break;
                        default :
                            System.out.println("You entered invalid class");

                    }

                    System.out.println("Yoy Have To Pay Extra Char equal " + charge );
                }*/

        //nested loop
        /*int passclass; //passengers class
                 double bagWeight; //passengers bag Weight
                 double excessWeight; //passengers excess Weight
                 double charge = 0; //charge on excess Weight
                int numberofpassengers = 0; //number of to passengers
                int numberofgroups=0;   //number of group

                 System.out.println("please enter number of groups");
                 numberofgroups = input.nextInt();

                 for(int groupcounter =0 ; groupcounter<=numberofpassengers;groupcounter++ )
                {
                 System.out.println("please enter number of passengers for group number ");
                numberofpassengers = input.nextInt();

                    for( int counter =1; counter<numberofpassengers; counter++ )  
                        {   
                            System.out.println("please enter passengers class for passenger no" +counter);
                             passclass = input.next().charAt(0);

                             System.out.println("please enter bag weight");
                             bagWeight = input.nextDouble();

                        switch (passclass)
                            {
                                case 'f':
                                case 'F':
                                    if(bagWeight>30)
                                    {
                                        excessWeight = bagWeight-30;
                                        charge = excessWeight * 10;
                                    }
                                    break;
                                case 'b':    
                                case 'B':
                                    if(bagWeight>25)
                                    {
                                        excessWeight = bagWeight-25;
                                        charge = excessWeight * 10;
                                    }
                                    break;
                                case 'e':
                                case 'E':
                                    if(bagWeight>20)
                                    {
                                        excessWeight = bagWeight-20;
                                        charge = excessWeight * 10;
                                    }
                                    break;
                                default :
                                    System.out.println("You entered invalid class");

                            }

                            System.out.println("You Have To Pay Extra Char equal " + charge );
                        }   
                }*/
    
    
    
    
    
    }
}
