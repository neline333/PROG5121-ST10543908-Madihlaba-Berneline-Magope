/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrations;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Registrations {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
    System.out.println("Register to create an account: ");
    
     System.out.print("Enter first name: ");
    String firstname = input.nextLine();
          
    System.out.print("Enter last name:");
    String lastname= input.nextLine(); 
    
    System.out.print("Enter username: ");
    String username = input.nextLine();
        
    
    System.out.print("Enter your password: ");
    String password = input.nextLine();
    
    
    System.out.print("Enter your cellphone number:");
    String cellphone = input.nextLine();
    
     Login login  =new Login();
     login.registerUser(username, password, cellphone);
     
     if(!login.checkUserName(username)){
         System.out.println("wrong usernam,e");
     }else {
         System.out.println("username  successfully captured ");
     }
     
      if(!login.checkPasswordComplexity(password)){
         System.out.println("wrong password");
     }else {
         System.out.println("password  successfully captured");
     }    
      if(!login.checkCellPhoneNumber(cellphone)){
         System.out.println("wrong cellphone");
     }else {
         System.out.println("cellphone successfully captured ");
     }         
     System.out.println("");
     System.out.println("------Login----");
     System.out.print("Enter username: ");
     String Eusername = input.nextLine();
     System.out.print("Enter Password: ");
     String Epassword = input.nextLine();     
     
     login.loginUser(username, password, Eusername, Epassword);
     login.returnLoginStatus(true, firstname, lastname);
     
    }
}
