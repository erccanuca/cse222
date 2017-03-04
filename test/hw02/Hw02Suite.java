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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ercan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({hw02.LibraryStaffLinkedTest.class, hw02.LibrarySystemAbstractTest.class, hw02.AdminTest.class, hw02.LibraryUsersTest.class, hw02.LibraryStaffTest.class, hw02.LibraryUsersLinkedTest.class, hw02.AdminLinkedTest.class, hw02.LibrarySystemAbstractLinkedTest.class, hw02.ProcessLibrarySystemTest.class, hw02.UsersTest.class, hw02.RegisterTest.class, hw02.BooksTest.class, hw02.MainClassTest.class})
public class Hw02Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
