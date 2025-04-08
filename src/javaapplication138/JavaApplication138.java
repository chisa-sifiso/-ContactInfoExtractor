/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication138;

import java.util.Scanner;

/**
 *
 * @author Sifiso
 */
public class JavaApplication138 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your contact details here: ");
        String contactDetails = input.nextLine();

        System.out.print("Enter email address domain here: ");
        String domain = input.next();

        displayEmailAddress(getNumbers(contactDetails), domain);
    }

    public static String getNumbers(String contactDetails) {
        String numbers = "";

        for (int i = 0; i < contactDetails.length(); i++) {
            char letter = contactDetails.charAt(i);
            if (Character.isDigit(letter)) {
                numbers += letter;
            }
        }

        return numbers;
    }
    public static void displayEmailAddress(String numbers, String domain){
        
        
        
        System.out.println(numbers+"@"+domain);
        
    }
}
