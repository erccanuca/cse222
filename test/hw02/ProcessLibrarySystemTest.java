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
public class ProcessLibrarySystemTest {
    
    public ProcessLibrarySystemTest() {
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
     * Test of barrowBook method, of class ProcessLibrarySystem.
     */
    @org.junit.Test
    public void testBarrowBook() throws Exception {
        System.out.println("barrowBook");
        Books obj = new Books("", "", "", 0);
        ProcessLibrarySystem instance = new ProcessLibrarySystemImpl();
        boolean expResult = false;
        boolean result = instance.barrowBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class ProcessLibrarySystem.
     */
    @org.junit.Test
    public void testReturnBook() throws Exception {
        System.out.println("returnBook");
        Books obj = null;
        ProcessLibrarySystem instance = new ProcessLibrarySystemImpl();
        boolean expResult = false;
        boolean result = instance.returnBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewBooks method, of class ProcessLibrarySystem.
     */
    @org.junit.Test
    public void testViewBooks() {
        System.out.println("viewBooks");
        ProcessLibrarySystem instance = new ProcessLibrarySystemImpl();
        instance.viewBooks();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class ProcessLibrarySystem.
     */
    @org.junit.Test
    public void testLogIn() {
        System.out.println("logIn");
        Register obj = null;
        ProcessLibrarySystem instance = new ProcessLibrarySystemImpl();
        boolean expResult = false;
        boolean result = instance.logIn(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class ProcessLibrarySystem.
     */
    @org.junit.Test
    public void testLogOut() {
        System.out.println("logOut");
        Register obj = null;
        ProcessLibrarySystem instance = new ProcessLibrarySystemImpl();
        boolean expResult = false;
        boolean result = instance.logOut(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class ProcessLibrarySystemImpl implements ProcessLibrarySystem {

        public boolean barrowBook(Books obj) throws NullPointerException, Error {
            return false;
        }

        public boolean returnBook(Books obj) throws NullPointerException, Error {
            return false;
        }

        public void viewBooks() {
        }

        public boolean logIn(Register obj) throws SecurityException {
            return false;
        }

        public boolean logOut(Register obj) throws SecurityException {
            return false;
        }
    }
    
}
