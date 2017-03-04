/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class LibrarySystemAbstractLinkedTest {
    
    public LibrarySystemAbstractLinkedTest() {
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
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
        List<Users> expResult = new LinkedList<>();
        List<Users> result = instance.getUsers();
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
        List<Users> users = new LinkedList<>();
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
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
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
        List<LibraryUsersLinked> expResult = new LinkedList<>();
        List<LibraryUsersLinked> result = instance.getLibrary_users();
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
        List<LibraryUsersLinked> library_users = new LinkedList<>();
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();        instance.setLibrary_users(library_users);
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
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
        List<Books> expResult = new LinkedList<>();
        List<Books> result = instance.getBooks();
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
        List<Books> library_books = new LinkedList<>();
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
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
        hw02.LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
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
        LibrarySystemAbstractLinked instance = new LibraryStaffLinked(0, "asd", "11", "", "", "");
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
        hw02.LibrarySystemAbstractLinked instance = new LibraryStaffLinked(0, "asd", "11", "", "", "");
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
        LibrarySystemAbstractLinked instance = new LibrarySystemAbstractLinkedTest.LibrarySystemAbstractLinkedImpl();
        String expResult = "Register{Users{\n" +
        "	userID=11, name=Ercan, surname=UCA, email=ercanuca@gmail.com}\n" +
        "	username=ercanuca, password=1234}";
         //System.out.print("-"+instance.toString()+"-");
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class LibrarySystemAbstractLinkedImpl extends LibrarySystemAbstractLinked {
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
