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
public class LoginFormTest {
    
    public LoginFormTest() {
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
     * Test of IsUserMatch method, of class LoginForm.
     */
    @Test
    public void testIsUserMatch() throws Exception {
        LoginForm instance = new LoginForm();
        boolean result = instance.IsUserMatch();
        assertEquals(true,result);
        
    }

    /**
     * Test of getUser method, of class LoginForm.
     */
    @Test
    public void testGetUser() throws Exception {
        System.out.println("getUser");
        LoginForm instance = new LoginForm();
        boolean expResult = false;
        boolean result = instance.getUser();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testMain() {
        

    }
    
}
