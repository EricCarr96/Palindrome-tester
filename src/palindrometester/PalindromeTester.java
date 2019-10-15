/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometester;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PalindromeTester {

    public static void main(String[] args) {
        
        String wordInput;
        Scanner sc = new Scanner(System.in);
        //get user input
        System.out.println("Enter a Palindrome: ");
        wordInput = sc.nextLine();
        //invoke method
        isPalindrome(wordInput);
       
    }
    //isPalindrome method wil go letter by letter checking to see if the word is a palindrome
    
    public static boolean isPalindrome(String wordInput)
    {
        for (int i = 0; i <= wordInput.length() / 2; i++ )
        {
            if(wordInput.charAt(i) != wordInput.charAt(wordInput.length()- i - 1))
            {
                System.out.println("This is not a Palindrome ");
                return false;
            }
        }
    System.out.println("This is a Palindrome!");
    return true;
    }
    
}
