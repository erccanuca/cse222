/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

/**
 * This class for user informations.
 * @author ercan
 */
public class Users{
    
    /**
     * User ID
     */
    private int userID;
    /**
     * name of user
     */
    private String name;
    /**
     * surname of user
     */
    private String surname;
    /**
     * user email
     */
    private String email;

    
    /**
     * Default Constructor for only administer;
     * namely administer me :D
     */
    public Users() {
        this.userID = 11;
        this.name = "Ercan";
        this.surname = "UCA";
        this.email = "ercanuca@gmail.com";
    }

    /**
     * 4 parameters constructor
     * @param userID id of user.
     * @param name The name of user
     * @param surname The surname of user
     * @param email The email of user
     */
    public Users(int userID,String name, String surname, String email) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    /**
     * Getter user ID.
     * @return ID of user.
     */
    public int getUserID() {
        return userID;
    }
    /**
     * Setter user ID.
     * @param userID set new user ID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
    /**
     * Getter name
     * @return name of user
     */
    public String getName() {
        return name;
    }
    /**
     * Setter name
     * @param name is new name user
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * Getter surname
    * @return surname of user
    */
    public String getSurname() {
        return surname;
    }
    /**
     * Setter surname
     * @param surname  is new surname of user
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Getter email
     * @return email of user
     */
    public String getEmail() {
        return email;
    }
    /**
     * Setter email
     * @param email  is new email of user
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Show information about users.
     * @return return string as information users.
     */
    @Override
    public String toString() {
        return "Users{\n\t" + "userID="
                + userID + ", name=" 
                + name + ", surname=" 
                + surname + ", email=" 
                + email + "}\n";
    }
   
}
