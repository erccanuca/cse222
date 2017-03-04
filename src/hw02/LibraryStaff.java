/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import java.util.ArrayList;
import java.util.List;

/**
 * Library staff Class
 * @author ercan
 */
public class LibraryStaff extends LibrarySystemAbstract{
    
   
    
    /**
     * Number of books are library staff own books.
     */
    private List<Books> numberofbooks = new ArrayList<>();
   

    /**
     * 6 parameters constructor.
     * @param userID user id.
     * @param username username of user.
     * @param password password of user.
     * @param name name of user.
     * @param surname surname of user.
     * @param email email of user.
     */
    public LibraryStaff(int userID, String username, String password, String name, String surname, String email) {
        super(userID,username, password, name, surname, email);
    }

    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if added book correctly.
     * throws NullPointerException
     */
    @Override
    public boolean barrowBook(Books obj) throws NullPointerException{
        if(obj==null)
            throw new NullPointerException("Can't add null object!.");
        return numberofbooks.add(obj);
    }
    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if removed book correctly.
     * throws NullPointerException
     */
    @Override
    public boolean returnBook(Books obj)throws NullPointerException{
       if(obj == null)
            throw new NullPointerException("Can't remove null book object!");
        return numberofbooks.remove(obj);
    }
    /**
     * Add book method, this method add library books array list.
     * @param book Books class object
     * @return true if added correctly
     * throws NullPointerException book==null
     */
    public boolean addBook(Books book)throws NullPointerException{
        if(book==null)
            throw new NullPointerException("Can't add null book object!");
        return library_books.add(book);
    }
    /**
     * Remove method, remove from library books array list
     * @param book Books class object
     * @return true if removed correctly.
     * throws NullPointerException book==null
     * throws Error library books array list is empty.
     */
    public boolean removeBook(Books book)throws NullPointerException, Error{
        if(book==null)
            throw new NullPointerException("Can't remove null book object!");
        else if(library_books.isEmpty())
            throw new Error("No books to remove!.");
        return library_books.remove(book);
    }
    /**
     * Register method, add user library to library user array list
     * @param lib_user library user object class
     * @return true if registration is correctly
     * throws NullPointerException lib_user==null
     */
    public boolean register(LibraryUsers lib_user)throws NullPointerException{
        if(lib_user==null)
            throw new NullPointerException("Can't register null library user object!");
        return library_users.add(lib_user) && users.add(lib_user);
    }
    /**
     * Register method, remove user library to library user array list
     * @param lib_user library user object class
     * @return true if de registration is correctly
     * throws NullPointerException lib_user==null
     * @throws Error is empty array list library users. 
     */
    public boolean deregister(LibraryUsers lib_user)throws NullPointerException,Error{
        if(lib_user == null)
            throw new NullPointerException("Can't remove null object.");
        else if(library_users.isEmpty() && users.isEmpty())
            throw new Error("No library user to remove!.");
        return library_users.remove(lib_user) && users.remove(lib_user);
    }
    /**
     * Information method about this class
     * @return Information about this class
     */
    @Override
    public String toString() {
        return "\n\tLibraryStaff{\n\t" + super.toString()+"\n\t" + library_users + "\n\tlibrary_books=" + library_books + "\n}";
    }
  
}
