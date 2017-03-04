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
public class LibraryStaffTest {
    
    public LibraryStaffTest() {
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
     * Test of barrowBook method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testBarrowBook() throws Exception {
        System.out.println("barrowBook");
        Books obj = new Books("", "", "", 0);
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        assertTrue(instance.addBook(obj));
        boolean expResult = true;
        boolean result = instance.barrowBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of barrowBook method, of class LibraryStaff.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void testBarrowBook_NullPointerException() throws Exception {
        System.out.println("testBarrowBook_NullPointerException");
        Books obj = null;
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        boolean expResult = false;
        boolean result = instance.barrowBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class LibraryStaff.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void testReturnBook_NullPointerException() throws Exception {
        System.out.println("testReturnBook_NullPointerException");
        Books obj = null;
        LibraryStaff instance = null;
        boolean expResult = false;
        boolean result = instance.returnBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of returnBook method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testReturnBook() throws Exception {
        System.out.println("returnBook");
        Books obj = new Books("", "", "", 0);
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        instance.barrowBook(obj);
        boolean expResult = true;
        boolean result = instance.returnBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class LibraryStaff.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void testAddBook() {
        System.out.println("addBook");
        Books book = null;
        LibraryStaff instance = null;
        boolean expResult = false;
        boolean result = instance.addBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testRemoveBook() throws Exception {
        System.out.println("removeBook");
        Books book = new Books("", "", "", 0);
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        boolean expResult = true;
        assertTrue(instance.addBook(book));
        boolean result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testRegister() {
        System.out.println("register");
        LibraryUsers lib_user = new LibraryUsers(0, "", "", "", "", "");
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        boolean expResult = true;
        boolean result = instance.register(lib_user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deregister method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testDeregister() throws Exception {
        System.out.println("deregister");
        LibraryUsers lib_user = new LibraryUsers(0, "", "", "", "", "");;
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        boolean expResult = true;
        assertTrue(instance.register(lib_user));
        boolean result = instance.deregister(lib_user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LibraryStaff.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        LibraryStaff instance = new LibraryStaff(0, "", "", "", "", "");
        String expResult = "\n" +
        "	LibraryStaff{\n" +
        "	Register{Users{\n" +
        "	userID=0, name=, surname=, email=}\n" +
        "	username=, password=}\n" +
        "	[]\n" +
        "	library_books=[]\n" +
        "}";
       
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
