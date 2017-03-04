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
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class AdminLinkedTest {
    
    public AdminLinkedTest() {
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
     * Test of getAdminCode method, of class Admin.
     */
    @org.junit.Test
    public void testGetAdminCode() {
        System.out.println("getAdminCode");
        AdminLinked instance = new AdminLinked();
        String expResult = "1111";
        String result = instance.getAdminCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminCode method, of class Admin.
     */
    @org.junit.Test
    public void testSetAdminCode() {
        System.out.println("setAdminCode");
        String adminCode = "1111";
        AdminLinked instance = new AdminLinked();
        instance.setAdminCode(adminCode);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Admin.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        LibraryStaffLinked staff = new LibraryStaffLinked(0, "", "", "", "", "");
        AdminLinked instance = new AdminLinked();
        boolean expResult = true;
        boolean result = instance.add(staff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of add method, of class Admin.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void testAdd_NullPointerException() {
        System.out.println("testAdd_NullPointerException");
        LibraryStaffLinked staff = null;
        AdminLinked instance = new AdminLinked();
        boolean expResult = false;
        boolean result = instance.add(staff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Admin.
     */
    @org.junit.Test
    public void testRemove(){
        System.out.println("remove");
        LibraryStaffLinked staff = new LibraryStaffLinked(0, "", "", "", "", "");
        AdminLinked instance = new AdminLinked();
        assertTrue(instance.add(staff));
        boolean expResult = true;
        boolean result = instance.remove(staff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of remove method, of class Admin.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void testRemove_NullPointerException(){
        System.out.println("testRemove_NullPointerException");
        LibraryStaffLinked staff = null;
        AdminLinked instance = new AdminLinked();
        boolean expResult = false;
        boolean result = instance.remove(staff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Admin.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        AdminLinked instance = new AdminLinked();
        String expResult = "Admin{\n" +
        "	Register{Users{\n" +
        "	userID=11, name=Ercan, surname=UCA, email=ercanuca@gmail.com}\n" +
        "	username=ercanuca, password=1234}, adminCode=1111,\n" +
        "	library_staffs=[]}\n";
        String result = instance.toString();
       
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
