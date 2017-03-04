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
public class BooksTest {
    
    public BooksTest() {
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
     * Test of getBook_name method, of class Books.
     */
    @org.junit.Test
    public void testGetBook_name() {
        System.out.println("getBook_name");
        Books instance = new Books("mybook", "", "", 0);
        String expResult = "mybook";
        String result = instance.getBook_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBook_name method, of class Books.
     */
    @org.junit.Test
    public void testSetBook_name() {
        System.out.println("setBook_name");
        String book_name = "book";
        Books instance = new Books("book2", "", "", 0);
        instance.setBook_name(book_name);
        assertEquals(instance.getBook_name(),book_name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBook_author method, of class Books.
     */
    @org.junit.Test
    public void testGetBook_author() {
        System.out.println("getBook_author");
        Books instance = new Books("", "author", "", 0);
        String expResult = "author";
        String result = instance.getBook_author();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBook_author method, of class Books.
     */
    @org.junit.Test
    public void testSetBook_author() {
        System.out.println("setBook_author");
        String book_author = "author";
        Books instance = new Books("", "author2", "", 0);
        instance.setBook_author(book_author);
        assertEquals(book_author, instance.getBook_author());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBook_type method, of class Books.
     */
    @org.junit.Test
    public void testGetBook_type() {
        System.out.println("getBook_type");
        Books instance = new Books("", "", "type", 0);;
        String expResult = "type";
        String result = instance.getBook_type();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBook_type method, of class Books.
     */
    @org.junit.Test
    public void testSetBook_type() {
        System.out.println("setBook_type");
        String book_type = "type";
        Books instance = new Books("", "", "type2", 0);
        instance.setBook_type(book_type);
        assertEquals(instance.getBook_type(), book_type);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBookID method, of class Books.
     */
    @org.junit.Test
    public void testGetBookID() {
        System.out.println("getBookID");
        Books instance = new Books("", "", "", 0);
        int expResult = 0;
        int result = instance.getBookID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBookID method, of class Books.
     */
    @org.junit.Test
    public void testSetBookID() {
        System.out.println("setBookID");
        int bookID = 0;
        Books instance = new Books("", "", "", 1);
        instance.setBookID(bookID);
        assertEquals(bookID, instance.getBookID());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Books.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Books instance = new Books("", "", "", 0);
        String expResult = "\n\t\tBooks{book_name=, book_author=, book_type=, bookID=0}\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
