/*Courtney Hill
CSC 414
Stubbing Assignment
Create a menu with at least 10 items: include error message, implementation message, and reprint of menu until exit condition is meet.  
This is a program of a cafe that will continue to display the menu.  Once the exit condition is met it will display a message and the total amount owed
by the "customer" */
package menuproject;

import java.util.Scanner;

public class MenuProject {

    
    public static void main(String[] args) {
        //initialized variables for current use and future usage.
        int choice = 0;
        Scanner input = new Scanner(System.in);
        String size = " ";
        int drinkQuantity = 0;
        double totalPrice = 0.0;
        double drinkTotal = 0;
        
        
      
        //menu display
        System.out.println("Coco's Cafe");
        System.out.println("Press 1: Water");
        
        System.out.println("Press 2: Tea");
       
        System.out.println("Press 3: Milk");
        
        System.out.println("Press 4: Lemonade");
        
        System.out.println("Press 5: Latte");
       
        System.out.println("Press 6: Mocha");
        
        System.out.println("Press 7: Iced Coffe");
        
        System.out.println("Press 8: Granita");
        
        System.out.println("Press 9: Coffee");
        
        System.out.println("Press 10: Chai Tea");
        
        System.out.println("Press 0 to Exit and get Total ");
        choice = input.nextInt();
            //while loop that checks the choice of the user
        while(choice != 0)
        {
            //switch case for choice that was chosen
            switch(choice){
                case 1:
                    
                    System.out.println("Not Implemented");
                   break;
                                
                case 2:
                    System.out.println("Not Implemented");
                   break;
                case 3:
                   System.out.println("Not Implemented");
                   break;
                case 4:
                   System.out.println("Not Implemented");
                   break;
                case 5:
                   System.out.println("Not Implemented");
                   break;
                case 6:
                   System.out.println("Not Implemented");
                   break;
                case 7:
                    System.out.println("Not Implemented");
                   break;
                case 8:
                    System.out.println("Not Implemented");
                   break;
                case 9:
                    System.out.println("Not Implemented");
                   break;
                case 10:
                    System.out.println("Not Implemented");
                   break;
                default:
                        System.out.println("Invalid option, please enter a value 0-10");
                        break;
                        
            }
            //reprint of menu after customer makes a choice.
        System.out.println("Coco's Cafe");
        System.out.println("Press 1: Water");
        
        System.out.println("Press 2: Tea");
        
        System.out.println("Press 3: Milk");
       
        System.out.println("Press 4: Lemonade");
        
        System.out.println("Press 5: Latte");
        
        System.out.println("Press 6: Mocha");
        
        System.out.println("Press 7: Iced Coffe");
        
        System.out.println("Press 8: Granita");
        
        System.out.println("Press 9: Coffee");
        
        System.out.println("Press 10: Chai Tea");
      
        
        System.out.println("Press 0 to Exit and get Total ");
        choice = input.nextInt();
            
        }
        
        System.out.println("Thank you for stopping by!!!");
    }
   
    
}


