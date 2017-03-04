/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import java.util.ArrayList;
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
public class LibrarySystemAbstractTest {
    
    public LibrarySystemAbstractTest() {
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
     * Test of getUsers method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testGetUsers() {
        System.out.println("getUsers");
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        ArrayList<Users> expResult = new ArrayList<>();
        ArrayList<Users> result = (ArrayList<Users>) instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testSetUsers() {
        System.out.println("setUsers");
        ArrayList<Users> users = new ArrayList<>();
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        instance.setUsers(users);
        assertEquals(users, instance.getUsers());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLibrary_users method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testGetLibrary_users() {
        System.out.println("getLibrary_users");
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        ArrayList<LibraryUsers> expResult = new ArrayList<>();
        ArrayList<LibraryUsers> result = (ArrayList<LibraryUsers>) instance.getLibrary_users();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLibrary_users method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testSetLibrary_users() {
        System.out.println("setLibrary_users");
        ArrayList<LibraryUsers> library_users = new ArrayList<>();
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        instance.setLibrary_users(library_users);
        assertEquals(instance.getLibrary_users(), library_users);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBooks method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testGetBooks() {
        System.out.println("getBooks");
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        ArrayList<Books> expResult = new ArrayList<>();
        ArrayList<Books> result = (ArrayList<Books>) instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBooks method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testSetBooks() {
        System.out.println("setBooks");
        ArrayList<Books> library_books = new ArrayList<>();
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        instance.setBooks(library_books);
        
        assertEquals(instance.getBooks(), library_books);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewBooks method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testViewBooks() {
        System.out.println("viewBooks");
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        instance.viewBooks();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testLogIn() {
        System.out.println("logIn");
        Register obj = new LibraryStaff(0, "asd", "11", "", "", "");
        LibrarySystemAbstract instance = new LibraryStaff(0, "asd", "11", "", "", "");
        boolean expResult = true;
        boolean result = instance.logIn(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logOut method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testLogOut() {
        System.out.println("logOut");
        Register obj = new LibraryStaff(0, "asd", "11", "", "", "");
        LibrarySystemAbstract instance = new LibraryStaff(0, "asd", "11", "", "", "");
        boolean expResult = true;
        boolean result = instance.logOut(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LibrarySystemAbstract.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        LibrarySystemAbstract instance = new LibrarySystemAbstractImpl();
        String expResult = "Register{Users{\n" +
        "	userID=11, name=Ercan, surname=UCA, email=ercanuca@gmail.com}\n" +
        "	username=ercanuca, password=1234}";
         //System.out.print("-"+instance.toString()+"-");
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class LibrarySystemAbstractImpl extends LibrarySystemAbstract {

        @Override
        public boolean barrowBook(Books obj) throws NullPointerException {
            return true;
        }

        @Override
        public boolean returnBook(Books obj) throws NullPointerException {
            return true;
        }
    }
    
}
