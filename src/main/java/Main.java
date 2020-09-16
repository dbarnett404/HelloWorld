
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darren
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name? ");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Hello " + userName);  // Output user input
    }
}
