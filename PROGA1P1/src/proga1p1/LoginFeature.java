/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proga1p1;

/**
 *
 * @author Matome Mupye */
import javax.swing.JOptionPane;
public class LoginFeature {
    
    public LoginFeature(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public LoginFeature() {
       
    }
    
     private String username;
     private String password;
     
    public void loginUser(String username, String password){
         
      for (int i  = 0; i < 2; i++){
           if(i < 3){
        
         
         if (username.equals("Ko_ki") && password.equals("Rabo@9#4")){
             JOptionPane.showMessageDialog(null,"Welcome,Koketso!");
             i=3;
         } else {
             JOptionPane.showMessageDialog(null,"Login failed,Please check username and password.");
             
         }
        }else
        {
            JOptionPane.showMessageDialog(null,"Login failed! Program will exit.");
            
            i=3;
        }
   
    }
    }

    

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
