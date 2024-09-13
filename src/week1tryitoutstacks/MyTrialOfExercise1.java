/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1tryitoutstacks;

import java.util.*;
import static week1tryitoutstacks.Week1TryItOutStacks.isBalanced;

/**
 *
 * @author Mark
 */
public class MyTrialOfExercise1 {
    //Exercise 1: Check if a string of parentheses is balanced, meaning each opening parenthesis 
//has a corresponding closing parenthesis in the correct order. 
//The output of each check should be either true or false. Use the following examples to be evaluated:
//parentheses1 = ( ( ( ) ) )
//parentheses2 = ( ( ) ( ) )
//parentheses3 = ( ( )
//parentheses4 = ( ) )
    
    public static boolean isBalanced(String parentheses){
        // Create a stack to keep track of opening parentheses 
        Stack<Character> stack = new Stack<Character>();

        // Loop through each character in the string
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            
        // If the character is an opening parenthesis, push it onto the stack 
            if (c=='(') {
                stack.push(c);
        // If the character is a closing parenthesis, check if the stack is empty 
        // or if the top of the stack is a matching opening parenthesis
            } else if(c==')'){
                    if(stack.isEmpty() || stack.peek()!= '('){
                        return false;
                }
                    else {
                        stack.pop();
                    }
            }
                 
        }
    // After looping through all characters, if the stack is empty, the parentheses are balanced 
    return stack.isEmpty();
    }
    
public static void main(String[] args) {
    // Test cases
    String parentheses1 = "((()))";
    String parentheses2 = "()()";
    String parentheses3 = "(";
    String parentheses4 = ")";

    // Check if each string of parentheses is balanced and print the result 
    System.out.println(isBalanced (parentheses1)); // true
    System.out.println(isBalanced (parentheses2)); // true 
    System.out.println(isBalanced (parentheses3)); // false 
    System.out.println(isBalanced (parentheses4)); // false

    }

    
    
}
