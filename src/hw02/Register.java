/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

/**
 * Registration Class
 * @author ercan
 */
public class Register extends Users{
    
    /**
     *  to enter system user's identify
     */
    private String username;
    /**
     *  to enter system user's special letters
     */
    private String password;
    /**
     * Default constructor.
     */
    public Register() {
        //super();
        this.username = "ercanuca";
        this.password = "1234";
    }
    /**
     * 6 parameters constructor.
     * @param userID The user id.
     * @param username The username of user
     * @param password The password of user
     * @param name The name of user
     * @param surname The surname of user
     * @param email The email of user 
     */
    public Register(int userID,String username, String password, String name, String surname, String email) {
        super(userID, name, surname, email);
        this.username = username;
        this.password = password;
    }
    /**
     * Getter method
     * @return username
     */
    public String getUsername() {
        return username;
    }
    /**
     * Setter method
     * @param username is new username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Getter method
     * @return password
     */
    public String getPassword() {
        return password;
    }
   /**
    * Setter Method
    * @param password is new password
    */
    public void setPassword(String password) {
        this.password = password;
    }
     /**
      * Log in for students
      * @param obj Register Class object
      * @return true if right username and password, otherwise throw exception
      * throws SecurityException
      */
    public boolean logIn(Register obj) throws SecurityException{  
        if( equals(obj) && equals(obj))
            return true;
        else 
            throw new SecurityException("Security Error!!!");
    }
    /**
     * for Students logout
     * @param obj Register Class object
     * @return true if username and password are right
     * throws SecurityException
     */
    public boolean logOut(Register obj)throws SecurityException{  
        if( equals(obj) && equals(obj))
            return true;
        else 
            throw new SecurityException("Security Error!!!"); 
    }

    
    /**
     * This method is override method, using for login and logout methods
     * @param other Register Class object
     * @return true if equals username and password, other else false;
     */
    public boolean equals(Register other) {

        if ((!this.username.equals(other.username))) {
            return false;
        }
        return (this.password.equals(other.password));
    } 

    @Override
    public String toString() {
        return "Register{" + super.toString() +"\tusername=" + username + ", password=" + password + '}';
    }
    
    
}
