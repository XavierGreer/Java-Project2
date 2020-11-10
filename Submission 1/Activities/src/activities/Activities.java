/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activities;

/**
 *
 * @author xaviergreer
 */
import java.util.Scanner;

public class Activities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initialize a object from the Scanner class for user input.
        Scanner Day = new Scanner(System.in);
        System.out.println("please enter any day of the week. Please spell out the day completely.");
        String NewDay = Day.nextLine();
        //a boolean variable is created for the while statement.
        boolean contin = false;
        
        //while statement which is used to repeat loop if incorrect input is received.
        while(contin == false){      
            //if... else if... if statements are created to check for user input and provide the correct output depending on the input received.
            //contin variable is also changed depending on the input provided by the user.
            // the equalsIgnoreCase() method is used to ignore case sensitivity from user input.
            if(NewDay.equalsIgnoreCase("Monday")){
                System.out.println("Mondays activity is riding bikes.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Tuesday")){
                System.out.println("Tuesdays activity is swimming in the local pool.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Wednesday")){
                System.out.println("Wednesdays activity is hiking.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Thursday")){
                System.out.println("Thursdays activity is going to the movie theater.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Friday")){
                System.out.println("Fridays activity is sky diving.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Saturday")){
                System.out.println("Saturdays activity is visiting the zoo.");
                contin = true;
            }
            else if(NewDay.equalsIgnoreCase("Sunday")){
                System.out.println("Sundays activity is computer programming.");
                contin = true;
            }
            else{
               System.out.println("That is not a day of the week.");
               System.out.println("please enter any day of the week. Please spell out the day completely.");
               NewDay = Day.nextLine();
               
            }                
        }
    }
    
}

