/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proga1p1;

/**
 *
 * @author Matome Maupye
 */
import javax.swing.JOptionPane;

public class RegistrationFeature {

    public RegistrationFeature(String uname, String pword, String firstname, String lastname) {
        this.uname = uname;
        this.pword = pword;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public RegistrationFeature() {
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the pword
     */
    public String getPword() {
        return pword;
    }

    /**
     * @param pword the pword to set
     */
    public void setPword(String pword) {
        this.pword = pword;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    private String uname;
    private String pword;
    private String firstname;
    private String lastname;
    
    public  void registerUser(String uname, String pword,String firstname, String lastname){
        
        
        String passwordMessage ="Password is not correctly formatted,please ensure that the password contains at least 8 characters,a capital letter,a number,and a special character.";
       String usernameMessage ="Username is not correctly formatted,please ensure that your username contains an underscore and is no more that 5 characters in length." ;
        
        if (checkUsername(uname)==true &&checkPassword(pword)==true
                ){
                JOptionPane.showMessageDialog(null,"Registration successful!");
        } else {
               JOptionPane.showMessageDialog(null,"Registration failed:\n" + usernameMessage+"\n"+passwordMessage);
        }
        
    }
    
    public boolean checkUsername(String username){
        if (username.contains("_") && username.length() <=5){
            //return "Username successfully captured";
            return true;
        } else {
          //  return "Username is not correctly formatted,please ensure that your username contains an underscore and is no more that 5 characters in length.";
          }return false;
    }
    
  public  boolean checkPassword(String password){
      boolean hasUpperCase=false;
      boolean hasDigit=false;
      boolean hasSpecialChar=false;
      
      for (char ch:password.toCharArray()){
          if (Character.isUpperCase(ch)){
              hasUpperCase=true;
          } else if (Character.isDigit(ch)){
              hasDigit=true;
          } else if(!Character.isLetterOrDigit(ch)){
              hasSpecialChar=true;
          }
      }
      
      if (password.length()>=8 && hasUpperCase && hasDigit && hasSpecialChar){
          //return "Password successfully captured";
          return true;
      } else {
          //return "Password is not correctly formatted,please ensure that the password contains at least 8 characters,a capital letter,a number,and a special character.";
           return false;
      }
  }
   
}
