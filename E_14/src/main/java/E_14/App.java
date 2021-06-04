package E_14;

import java.util.Scanner;
import java.text.DecimalFormat;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        final float taxConstant = (float) 0.055;
        Scanner reader = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("###.##");
        System.out.print("Please Enter Total: ");
        float total = Float.parseFloat(formatter.format(reader.nextFloat()));
        System.out.print("Please Enter the State ");
        String state = reader.next();

        if(state.compareTo("WI") == 0){
            float tax = Float.parseFloat(formatter.format(taxConstant*total));
            System.out.printf("The subtotal is $%.2f%n The tax is is $%.2f%n Your total is $%.2f%n",total,tax,total+tax);

            return;

        }
        System.out.printf("Your total is $%.2f%n", total);
    }
}
