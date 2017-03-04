/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import java.util.ArrayList;
import java.util.List;

/**
 * Administer Class informations.
 * @author ercan
 */
public class Admin extends Register{
    /**
     * Administer code
     */
    private String adminCode;
    /**
     * Library staff araylist.
     */
    private List<LibraryStaff> library_staffs = new ArrayList<>();
    /**
     * Default constructor
     */
    public Admin() {
        super();
        this.adminCode ="1111";
    }
    /**
     * 7 parameter constructor
     * @param userID user id
     * @param username username of user
     * @param password user password
     * @param name name of user
     * @param surname surname of user
     * @param email email of user
     * @param adminCode code of admin
     */
    public Admin(int userID,String username, String password, String name, String surname, String email,String adminCode) {
        super(userID, username, password, name, surname, email);
        this.adminCode = adminCode;
    }
   /**
    * Getter administer code
    * @return administer code
    */
    public String getAdminCode() {
        return adminCode;
    }
    /**
     * Setter admin code
     * @param adminCode set new admin code
     */
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
    /**
     * Add method, add library staff
     * @param staff LibraryStaff object class
     * @return true if added correctly
     * throws NullPointerException if staff null object
     */
    public boolean add(LibraryStaff staff)throws NullPointerException{
        if(staff == null)
            throw new NullPointerException("Can't add null object.");
        return library_staffs.add(staff);
    }
    /**
     * remove method, remove staff from system
     * @param staff Library Staff object
     * @return true if removed correctly.
     * throws NullPointerException if staff null object
     * throws Error if array list is empty.
     */
    public boolean remove(LibraryStaff staff)throws NullPointerException,Error{
       if(staff == null)
            throw new NullPointerException("Can't remove null object.");
       else if(library_staffs.isEmpty())
            throw new Error("No library staff");
        return library_staffs.remove(staff);
    }
    /**
     * View information about administer
     * @return information of administer
     */
    @Override
    public String toString() {
        return "Admin{\n\t" +super.toString()+ ", adminCode=" + adminCode + ",\n\tlibrary_staffs=" + library_staffs + "}\n";
    }

}

