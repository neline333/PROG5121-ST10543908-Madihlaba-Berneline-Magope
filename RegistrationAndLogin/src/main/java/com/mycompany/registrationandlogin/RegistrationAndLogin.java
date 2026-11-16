/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class RegistrationAndLogin {

    private static boolean loginStatus;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("REGISTRATION");
        
        System.out.print("Enter first name:");
        String firstname = input.nextLine();
        
        System.out.print("Enter last name:");
        String lastname = input.nextLine();
        
        System.out.print("Enter username:");
        String username = input.nextLine();
        
        System.out.print("Enter phone number(+27):");
        String number = input.nextLine();
        
        Login login = new Login();
        
        //Ceate a variable that checks whether the login was a sucess
        boolean validUsername = login.checkUsername;
        boolean validPassword = login.checkPasswordComplexity;
        boolean validNumber = login.CheckCellPhoneNumber;
        
        if (validUsername) {
            System.out.println("Username successfully captured.");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters.");
            
        if (validPassword) {
            System.out.println("Password successfully captured.");
        }else{
            System.out.println("Password is not correctly formatted, please unsure that your password contains at least eight characters, a capital letter, a small letter, and a special character");
            
        if (validNumber) {
            System.out.println("Phone number successfully captured.");
        }else{
            System.out.println("Phone number is incorrectly formatted and does not contain the international code");
        }
        
        if (validUsername && validPassword && validNumber) {
            System.out.println("Registration Successful.");
            
            System.out.println("LOGIN");
            System.out.println("Enter Username:");
            String storedUsername = input.nextLine();
            
            System.out.println("Enter password:");
            String storedPassword = input.nextLine();
            
            System.out.println("Enter phone number");
            String storedNumber = input.nextLine();
            
            if (loginStatus) {
                System.out.println("Welcome to QuickChat.");
                System.out.println("option)Send Messages.");
                System.out.println("option 2)Show recent messages?-Coming Soon");
                System.out.println("option 3)Quit.");
                
                Scanner contollerv = input;
                int nextInt;
                int controllerv = input.nextInt();
                
                switch (controllerv) {
                    
                    case 1:
                        System.out.println("How many messages would you like to send?");
                        break;
                        
                    case 2:
                        System.out.println("Coming soon");
                        break;
                        
                    case 3:
                        System.exit(0);
                        break;
                        
                    default:
                        System.out.println("Wrong input entered.");
                        break;
                        
                }
                
            }
            
            input.close();
                    
                    
                }
            }
        }
        
    }
}
        

    
            
           
