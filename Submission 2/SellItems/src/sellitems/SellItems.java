/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellitems;

/**
 *
 * @author xaviergreer
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SellItems {

    /**
     * @param args the command line arguments
     */
   
    
    //Method to perform tax eqaution
    static void saleTaxed(double itemsTotal, double itemsTaxes){
        double newTotal = itemsTotal + itemsTaxes;
        Double rounded = Math.round(newTotal * 100.0) / 100.0;
        System.out.println("Your total with taxes is \t$" + rounded);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean contin = true;
        ArrayList<Float> items = new ArrayList<Float>();
        int i = 0;
    
        while(contin == true){
            i++;
            System.out.println("Please enter the price of item #" + i);
            float itemPrice = sc.nextFloat();
            items.add(itemPrice);

            System.out.println("would you like to add another item?");
            String answer = sc.nextLine();
            answer = sc.nextLine();
            
            INNER_LOOP:
                if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")){
                    break INNER_LOOP;
                }
                else if(answer.equalsIgnoreCase("No") ||answer.equalsIgnoreCase("N")){
                    contin = false;
                }
                else
                    while(!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("No") ||answer.equalsIgnoreCase("N"))){
                        System.out.println("Invalid input, please try again.");
                        answer = sc.nextLine();
                    }
            
        }          
        
        double total = 0;
        
        for(int x=0; x<items.size(); x++) { 
            total += items.get(x);
            
            System.out.println("Item #" + x + " price is \t$" + items.get(x) + "\n");
            
        }

        Double rounded = Math.round(total * 100.0) / 100.0;
        System.out.println("Your total before taxes is \t$" + rounded);
        
        float taxes = 0.07f;
        double itemsTaxes = total * taxes;
        
        rounded = Math.round(itemsTaxes * 100.0) / 100.0;
        
        System.out.println("You are being taxed \t\t$" + rounded);
        
        saleTaxed(total,itemsTaxes);
        
    }
}
