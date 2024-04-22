/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proga1p1;


import javax.swing.JOptionPane;

/**
 *
 * @author Matome Maupye
 */

public class PROGA1P1 {
    public static void main(String[] args) {
        // Prompt the user to create an account
        JOptionPane.showMessageDialog(null,"Create an account by entering the following details for registration (Press Okay!)");
        
        // Get user input for registration
        String  uname = JOptionPane.showInputDialog(null,"Enter username:");
        new RegistrationFeature().checkUsername(uname);
        String pword  = JOptionPane.showInputDialog(null,"Enter password:");
        String firstname = JOptionPane.showInputDialog(null,"Enter firstname:");
        String lastname = JOptionPane.showInputDialog(null,"Enter lastname:");
        
        // Register the user
        new RegistrationFeature().registerUser(uname,pword,firstname,lastname);
        
        // After registration, prompt the user to login
        String username =JOptionPane.showInputDialog("Enter username:");
        String password =JOptionPane.showInputDialog("Enter password:");
        
        // Login the user
        new LoginFeature().loginUser(username, password);
    }
}

