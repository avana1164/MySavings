/*
 * Avinash Anand
 * February 26, 2022
 * 
 */
package mysavings;
import java.util.Scanner;
public class MySavings {
    public static void main(String[] args) {
        String userChoice;
        int numCoins, counter = 0, i;
        double withdrawl;
        PiggyBank piggyBank = new PiggyBank();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Show total in bank.\n2. Show breakdown of coins in bank.\n"
                    + "3. Add penny.\n4. Add nickel.\n5. Add dime.\n6. Add quarter.\n7. Remove specific coins.\n"
                    + "8. Take money out of bank.\n9. Quit\nInput the option based on the number beside it. If you type in any thing other than these numbers, the program will break.");
            userChoice = sc.nextLine();
            if(userChoice.equals("1")) {
                System.out.println(piggyBank.getTotal());
            } else if (userChoice.equals("2")) {
                System.out.println(piggyBank.toString());
            } else if (userChoice.equals("3")) {             
                System.out.println("How many pennies do you want to add?");
                while(true){    
                    try{
                        numCoins = Integer.parseInt(sc.nextLine());
                        piggyBank.setTotal(0.01*numCoins);
                        piggyBank.setPennies(numCoins);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("That's not an option.");
                        System.out.println();
                    }
                }
            } else if (userChoice.equals("4")) {
                System.out.println("How many nickels do you want to add?");
                while(true){
                    try{
                        numCoins = Integer.parseInt(sc.nextLine());
                        piggyBank.setTotal(0.05*numCoins);
                        piggyBank.setNickels(numCoins);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("That's not an option.");
                        System.out.println();
                    }
                }
            } else if (userChoice.equals("5")) {
                System.out.println("How many dimes do you want to add?");
                while(true){
                    try{
                        numCoins = Integer.parseInt(sc.nextLine());
                        piggyBank.setTotal(0.1*numCoins);
                        piggyBank.setDimes(numCoins);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("That's not an option.");
                        System.out.println();
                    }
                }
            } else if (userChoice.equals("6")) {
                while(true){
                    System.out.println("How many quarters do you want to add?");
                    try {
                        numCoins = Integer.parseInt(sc.nextLine());                   
                        piggyBank.setTotal(0.25*numCoins);
                        piggyBank.setQuarters(numCoins);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("That's not an option.");
                        System.out.println();
                    }                                                        
                }
            } else if (userChoice.equals("7")) {
                if(piggyBank.getTotal() <= 0){
                    System.out.println("You have no money!!");                   
                } else {
                    System.out.println("What type of coin would you like to withdrawl, \ntype in \"quarter\", \"dime\", \"nickel\", \"penny\" (type in any other character to return to the main menu): ");
                    userChoice = sc.nextLine();
                    if(userChoice.equals("quarter")||userChoice.equals("dime")||userChoice.equals("nickel")||userChoice.equals("penny")){
                        while(true){
                            System.out.println("How many coins do you want to withdraw?");
                            try {
                                numCoins = Integer.parseInt(sc.nextLine());
                                if(userChoice.equals("quarter")){
                                    
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("That's not an option.");
                                System.out.println();
                            }
                        }
                    } else {
                        break;
                    }                                 
                    
                        
            }
                        
            } else if (userChoice.equals("8")) {
                if(piggyBank.getTotal() <= 0){
                    System.out.println("You have no money!!");                   
                } else {
                    while(true){
                        System.out.println("How much money do you want to withdraw (in dollars and if anything other than a number is typed in, then you will return to the main menu): ");
                        try {
                            withdrawl = Double.parseDouble(sc.nextLine());
                            if(withdrawl > piggyBank.getTotal()){
                                System.out.println("You don't have that much money!!");
                                continue;
                            }
                            piggyBank.setTotal(-withdrawl);
                            for(i = 0; i < piggyBank.getQuarters(); i++){                                                                                             
                                if(withdrawl - 0.25 < 0){
                                    break;
                                }                                                              
                                withdrawl*=100;
                                withdrawl = Math.round(withdrawl);
                                withdrawl -= 25;
                                withdrawl/=100;                              
                            }
                            piggyBank.setQuarters(-i);
                            
                            for(i = 0; i < piggyBank.getDimes(); i++){                                                                                              
                                if(withdrawl - 0.1 < 0){
                                    break;
                                }                                                              
                                withdrawl*=100;
                                withdrawl = Math.round(withdrawl);
                                withdrawl -= 10;
                                withdrawl/=100;                               
                            }    
                            piggyBank.setDimes(-i);
                            
                            for(i = 0; i < piggyBank.getNickels(); i++){                                                              
                                if(withdrawl - 0.05 < 0){
                                    break;
                                }                                                              
                                withdrawl*=100;
                                withdrawl = Math.round(withdrawl);
                                withdrawl -= 5;
                                withdrawl/=100;                               
                            }   
                            piggyBank.setNickels(-i);
                            
                            for(i = 0; i < piggyBank.getPennies(); i++){                                                                                              
                                if(withdrawl - 0.01 < 0){
                                    break;
                                }                                                              
                                withdrawl*=100;
                                withdrawl = Math.round(withdrawl);
                                withdrawl -= 1;
                                withdrawl/=100;                                                             
                            } 
                            piggyBank.setPennies(-i);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("That's not an option.");
                            break;
                        }
                    }   
                }               
            } else {
                break;
            }
            System.out.println();
        }
    }   
}