/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class UsersTest {
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserID method, of class Users.
     */
    @org.junit.Test
    public void testGetUserID() {
        System.out.println("getUserID");
        Users instance = new Users(0, "", "", "");
        int expResult = 0;
        int result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class Users.
     */
    @org.junit.Test
    public void testSetUserID() {
        System.out.println("setUserID");
        int userID = 0;
        Users instance = new Users();
        instance.setUserID(userID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Users.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Users instance = new Users(0, "ercan", "", "");
        String expResult = "ercan";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Users.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Users instance = new Users();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Users.
     */
    @org.junit.Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Users instance = new Users(0, "", "uca", "");
        String expResult = "uca";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Users.
     */
    @org.junit.Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Users instance = new Users();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Users.
     */
    @org.junit.Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Users instance = new Users(0, "", "", "ercanuca@gmail.com");
        String expResult = "ercanuca@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Users.
     */
    @org.junit.Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Users instance = new Users();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Users.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Users instance = new Users();
        String expResult = "Users{\n" +
        "	userID=11, name=Ercan, surname=UCA, email=ercanuca@gmail.com}\n" +
        "";
        //System.out.print("-"+instance.toString()+"-");
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
