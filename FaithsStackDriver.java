// File/Class Name: FaithsStackDriver.java
// Author: Faith Reeves
// Class Purpose: To test the FaithsStack class. Allows the user to create a 
//                stack and test all of its methods

package faithsstackdriver;

import java.util.Scanner;

public class FaithsStackDriver {

    public static void main(String[] args) {

        // create an instance of FaithsStack
        FaithsStack<String> myStack = new FaithsStack<>();

        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // create a String to store the user's answer
        String outputAnswer = "";

        // until the user enters a '*' cycle through the loop
        while (!outputAnswer.equals("*")) {

            // ouput a menu of method choices for the user
            System.out.println("STACK METHOD OPTIONS:");

            System.out.println("Push an item onto the stack       (enter 1)");

            System.out.println("Pop an item off of the stack      (enter 2)");

            System.out.println("Peek at the top item of the stack (enter 3)");

            System.out.println("Check if the stack is empty       (enter 4)");

            System.out.println("Exit program                      (enter *)");

            System.out.print("What would you like to do with your stack?: ");

            // read in the users choice of what to do with the stack
            outputAnswer = input.next();

            // print an extra line
            System.out.println();

            // beginning of try block
            try {

                // switch statement for the user's method choice
                switch (outputAnswer) {

                    // case for push() method
                    case "1" -> {

                        // ask the user what they want to push onto the stack
                        System.out.print("What would you like to push onto the stack?: ");

                        // read in their answer
                        String pushItem = input.next();

                        // print an extra line
                        System.out.println();

                        // tell them what they pushed onto the stack
                        System.out.println(myStack.push(pushItem) + " was pushed onto the stack.");

                        // break out of the switch statement
                        break;

                    }

                    // case for pop() method
                    case "2" -> {

                        // tell the user what was popped off the stack
                        System.out.println(myStack.pop() + " was popped off of the stack.");

                        // break out of the switch statement
                        break;

                    }

                    // case for peek() method
                    case "3" -> {

                        // tell the user what is at the top of the stack
                        System.out.println(myStack.peek() + " is at the top of the stack.");

                        // break out of the switch statement
                        break;
                    }

                    // case for isEmpty() method
                    case "4" -> {

                        // is the stack is empty, execute statement
                        if (myStack.isEmpty()) {

                            // tell the user the stack is empty
                            System.out.println("The stack is empty.");
                        } else {

                            // tell the user the stack is NOT empty
                            System.out.println("The stack is not empty.");
                        }

                        // break out of the switch statement
                        break;
                    }

                    // case if user wants to end program
                    case "*" -> {

                        // ending message to thank the user for playing
                        System.out.println("Thanks for playing! Exiting Program.");

                        // exit program
                        System.exit(0);
                    }

                    // execute if user does not choose a valid option
                    default -> {

                        // tell the user to pick a valid option
                        System.out.println("Please choose a valid option (1, 2, 3, 4, or * )");
                    }

                } // end of switch statement

            } //end of try block
            // catch block that catches exception if user tries to pop() or
            // peek() from an empty stack
            catch (EmptyStackException ex) {

                // tell the user the stack is empty and to try again
                System.out.println("The stack is empty. Try a different method.");

            }

            // print an extra line
            System.out.println();

        } // end of while loop
    }
}