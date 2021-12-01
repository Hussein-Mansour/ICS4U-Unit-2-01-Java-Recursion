/* This program Reverse the String by recursion
*
* @author  Hussein
* @version 1.0
* @since 2020-11-23
*/

import java.util.Scanner;

/**
* This is the standard "Recursion" program.
*/

final class Recursion {

    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Recursion() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
     * Starting the reverse Method
     *
     * @param String 
     */      
     public static String reverseString(String str) {
         // this Method uses recursion to reverse a string
         if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
     }
    /**
    * Starting the main Method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // calling reverse method
        String str = "recursion";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
        // print Done.
        System.out.println("\nDone.");
    }
}
