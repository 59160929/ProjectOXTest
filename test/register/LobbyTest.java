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
public class LobbyTest {
    
    public LobbyTest() {
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
     * Test of ShowRoom method, of class Lobby.
     */
    @Test
    public void testShowRoom() {
        System.out.println("ShowRoom");
        Lobby instance = new Lobby();
        boolean expResult = true;
        instance.ShowRoom();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
/*  public void testGetUser() throws Exception {
        System.out.println("getUser");
        LoginForm instance = new LoginForm();
        boolean expResult = false;
        boolean result = instance.getUser();
        assertEquals(expResult, result)
    
    */
    /**
     * Test of main method, of class Lobby.
     */
    @Test
    public void testMain() {
        System.out.println("main");
       
    }
    
}
