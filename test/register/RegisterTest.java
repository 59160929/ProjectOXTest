/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KirkThunder
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
     * Test of IsNull method, of class Register.
     */
    @Test
    public void testIsNull() {
        
        Register instance = new Register();
        boolean expResult = true;
        boolean result = instance.IsNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of IsPasswordMisMatch method, of class Register.
     */
    @Test
    public void testIsPasswordMisMatch() {

        Register instance = new Register();
        boolean expResult = true;
        boolean result = instance.IsPasswordMisMatch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of IsUserExist method, of class Register.
     */
    @Test
    public void testIsUserExist() throws Exception {
      
        Register instance = new Register();
        boolean expResult = true;
        boolean result = instance.IsUserExist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Register.
     */
    @Test
    public void testMain() {
        ;
    }

    /**
     * Test of InsertUser method, of class Register.
     */
    @Test
    public void testInsertUser() {
       
    }
    
}
