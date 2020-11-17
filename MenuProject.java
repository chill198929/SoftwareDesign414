/*Courtney Hill
CSC 414
Stubbing Assignment
Create a menu with at least 10 items: include error message, implementation message, and reprint of menu until exit condition is meet.
This is a program of a cafe that will continue to display the menu.  Once the exit condition is met it will display a message and the total amount owed
by the "customer" */
//package menuproject;

import java.util.Scanner;

public class MenuProject {


    public static void main(String[] args) {
        //initialized variables for current use and future usage.
        String choice = "";
        Scanner input = new Scanner(System.in);
        String size = " ";
        int drinkQuantity = 0;
        double totalPrice = 0.0;
        double drinkTotal = 0;


//while loop to display menu exit if character is 0
        while(!(choice.equals("0")))
        {
            //menu display
            System.out.println("Coco's Cafe");
            System.out.println("Press 1: Water");

            System.out.println("Press 2: Tea");

            System.out.println("Press 3: Milk");

            System.out.println("Press 4: Lemonade");

            System.out.println("Press 5: Latte");

            System.out.println("Press 6: Mocha");

            System.out.println("Press 7: Iced Coffee");

            System.out.println("Press 8: Granita");

            System.out.println("Press 9: Coffee");

            System.out.println("Press 10: Chai Tea");

            System.out.println("Press 0 to Exit and get Total ");
            choice = input.next();


            //switch case for choice that was chosen
            //displays size options and price
            switch(choice){
                case "0":
                    //exit conditon
                    break;
                case "1":

                    System.out.println("Water");
                    System.out.println("What Size? ");
                    System.out.println("Small: $0.00");
                    System.out.println("Medium: $0.00");
                    System.out.println("Large: $0.00");
                    //get size
                    size = input.next();
                    //pass size and choice to get the price
                    totalPrice += getPrice(choice, size);
                    //break and display menue
                    break;

                case "2":
                    System.out.println("Tea");
                    System.out.println("What Size? ");
                    System.out.println("Small: $2.00");
                    System.out.println("Medium: $3.00");
                    System.out.println("Large: $4.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "3":
                    System.out.println("Milk");
                    System.out.println("What Size? ");
                    System.out.println("Small: $2.00");
                    System.out.println("Medium: $3.00");
                    System.out.println("Large: $4.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "4":
                    System.out.println("Lemonade");
                    System.out.println("What Size? ");
                    System.out.println("Small: $3.00");
                    System.out.println("Medium: $4.00");
                    System.out.println("Large: $5.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "5":
                    System.out.println("Latte");
                    System.out.println("What Size? ");
                    System.out.println("Small: $4.00");
                    System.out.println("Medium: $5.00");
                    System.out.println("Large: $6.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "6":
                    System.out.println("Mocha");
                    System.out.println("What Size? ");
                    System.out.println("Small: $4.00");
                    System.out.println("Medium: $5.00");
                    System.out.println("Large: $6.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "7":
                    System.out.println("Iced Coffee");
                    System.out.println("What Size? ");
                    System.out.println("Small: $4.00");
                    System.out.println("Medium: $5.00");
                    System.out.println("Large: $6.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "8":
                    System.out.println("Granita");
                    System.out.println("What Size? ");
                    System.out.println("Small: $4.00");
                    System.out.println("Medium: $5.00");
                    System.out.println("Large: $6.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "9":
                    System.out.println("Coffee");
                    System.out.println("What Size? ");
                    System.out.println("Small: $1.00");
                    System.out.println("Medium: $2.00");
                    System.out.println("Large: $3.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                case "10":
                    System.out.println("Chai Tea");
                    System.out.println("What Size? ");
                    System.out.println("Small: $3.00");
                    System.out.println("Medium: $4.00");
                    System.out.println("Large: $5.00");
                    //get size
                    size = input.next();
                    //get total price pass choice and size characters
                    totalPrice += getPrice(choice, size);

                    break;
                default:
                    //invalid input
                    System.out.println("Invalid option, please enter a value 0-10");
                    break;

            }


        }
        //display total price and exit message
        System.out.printf("Total Price: $%.2f\n", totalPrice);
        System.out.println("Thank you for stopping by!!!");
    }


//function to get the price of each item chosen
    public static double getPrice(String c, String s) {
        int quantity = 0;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        boolean acceptedValue = false;
//switch on character to get size and price
        switch (c){
            case "1":
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e){
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }

                    //multiple quantity by price to get total
                    total = quantity * 0.00;
                    System.out.printf("You ordered %d small Water(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return the total
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 0.00;
                    System.out.printf("You ordered %d medium Water(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                        }catch (NumberFormatException e){
                            System.out.println("Not a valid.");
                        }
                    }
                    //calculate price
                    total = quantity * 0.00;
                    System.out.printf("You ordered %d large Water(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }


            case "2":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //multiple quantity by price to get total
                    total = quantity * 2.00;
                    System.out.printf("You ordered %d small Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return the total
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 3.00;
                    System.out.printf("You ordered %d medium Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {

                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d large Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "3":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 2.00;
                    System.out.printf("You ordered %d small Milk(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate prce
                    total = quantity * 3.00;
                    System.out.printf("You ordered %d medium Milk(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d large Milk(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "4":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 3.00;
                    System.out.printf("You ordered %d small Lemonade(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calcuate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d medium Lemonade(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d large Lemonade(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "5":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d small Latte(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d medium Latte(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //retrun
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 6.00;
                    System.out.printf("You ordered %d large Latte(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "6":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d small Mocha(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d medium Mocha(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 6.00;
                    System.out.printf("You ordered %d large Mocha(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "7":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d small Iced Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d medium Iced Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 6.00;
                    System.out.printf("You ordered %d large Iced Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "8":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d small Granita(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d medium Granita(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 6.00;
                    System.out.printf("You ordered %d large Granita(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "9":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 1.00;
                    System.out.printf("You ordered %d small Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate
                    total = quantity * 2.00;
                    System.out.printf("You ordered %d medium Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 3.00;
                    System.out.printf("You ordered %d large Coffee(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            case "10":
                //if to check string size and get the quantity
                if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("small")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calcualte price
                    total = quantity * 3.00;
                    System.out.printf("You ordered %d small Chai Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("medium")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 4.00;
                    System.out.printf("You ordered %d medium Chai Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                } else if (s.equalsIgnoreCase("l") || s.equalsIgnoreCase("large")) {
                    //get quantity and check to make sure it is a valid number
                    while(!acceptedValue){
                        try{
                            System.out.println("How many drinks: ");
                            //convert input to integer
                            quantity = Integer.valueOf(input.nextLine());
                            acceptedValue = true;
                            //exception if value is not a number
                        }catch (NumberFormatException e) {
                            //error message
                            System.out.println("Not a valid quantity.");
                        }
                    }
                    //calculate price
                    total = quantity * 5.00;
                    System.out.printf("You ordered %d large Chai Tea(s)\n", quantity );
                    System.out.printf("Total: $%.2f\n", total);
                    //return
                    return total;
                }else{
                    System.out.println("Invalid size option, try again");
                    return 0;
                }

            default:
                System.out.println("Invalid");
                return 0;

        }


    }


}

