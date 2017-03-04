/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;


/**
 * This class do that is any processing on library system for all users.
 * @author ercan
 */
public interface ProcessLibrarySystem {
    
    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if added book correctly.
     * throws NullPointerException 
     */
    public boolean barrowBook(Books obj) throws NullPointerException;
    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if removed book correctly.
     * throws NullPointerException.
     */
    public boolean returnBook(Books obj)throws NullPointerException;
    
    /**
     * View all books by users is added by library staff.
     */
    public void viewBooks();
    
    /**
      * Log in for Users
      * @param obj Register Class object
      * @return true if right username and password, otherwise throw exception
      * throws SecurityException
      */
    public boolean logIn(Register obj)throws SecurityException;
     /**
     * Log out for Users
     * @param obj Register Class object
     * @return true if username and password are right
     * throws SecurityException
     */
    public boolean logOut(Register obj)throws SecurityException;
}

