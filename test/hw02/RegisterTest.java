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
public class RegisterTest {
    
    public RegisterTest() {
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
     * Test of getUsername method, of class Register.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Register instance = new Register(0, "ercan", "", "", "", "");
        String expResult = "ercan";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Register.
     */
    @org.junit.Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "ercanuca2";
        Register instance = new Register();
        instance.setUsername(username);
        assertEquals(instance.getUsername(), username);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Register.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Register instance = new Register();
        String expResult = "1234";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Register.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "1111";
        Register instance = new Register();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class Register.
     */
    @org.junit.Test
    public void testLogIn() {
        System.out.println("logIn");
        Register obj = new Register(0, "ercanuca", "1234", "", "", "");
        Register instance = new Register();
        boolean expResult = true;
        boolean result = instance.logIn(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class Register.
     */
    @org.junit.Test
    public void testLogOut() {
        System.out.println("logOut");
        Register obj = new Register();
        Register instance = new Register();
        boolean expResult = true;
        boolean result = instance.logOut(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Register.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Register other = new Register(0, "qwe", "123", "", "", "");
        Register instance = new Register(0, "qwe", "123", "", "", "");
        boolean expResult = true;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Register.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Register instance = new Register();
        String expResult = "Register{Users{\n" +
        "	userID=11, name=Ercan, surname=UCA, email=ercanuca@gmail.com}\n" +
        "	username=ercanuca, password=1234}";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
