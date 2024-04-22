/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proga1p1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Koketso Rabothata
 */
public class RegistrationFeatureTest {
    
    public RegistrationFeatureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Setup class");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Setup  before each test");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUname method, of class RegistrationFeature.
     */
    @Test
    public void testGetUname() {
        System.out.println("getUname");
        RegistrationFeature instance = new RegistrationFeature();
        String expResult = "";
        String result = instance.getUname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUname method, of class RegistrationFeature.
     */
    @Test
    public void testSetUname() {
        System.out.println("setUname");
        String uname = "";
        RegistrationFeature instance = new RegistrationFeature();
        instance.setUname(uname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPword method, of class RegistrationFeature.
     */
    @Test
    public void testGetPword() {
        System.out.println("getPword");
        RegistrationFeature instance = new RegistrationFeature();
        String expResult = "";
        String result = instance.getPword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPword method, of class RegistrationFeature.
     */
    @Test
    public void testSetPword() {
        System.out.println("setPword");
        String pword = "";
        RegistrationFeature instance = new RegistrationFeature();
        instance.setPword(pword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class RegistrationFeature.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        RegistrationFeature instance = new RegistrationFeature();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class RegistrationFeature.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        RegistrationFeature instance = new RegistrationFeature();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class RegistrationFeature.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        RegistrationFeature instance = new RegistrationFeature();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class RegistrationFeature.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        RegistrationFeature instance = new RegistrationFeature();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class RegistrationFeature.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String uname = "";
        String pword = "";
        String firstname = "";
        String lastname = "";
        RegistrationFeature instance = new RegistrationFeature();
        instance.registerUser(uname, pword, firstname, lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class RegistrationFeature.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        RegistrationFeature instance = new RegistrationFeature();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class RegistrationFeature.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        RegistrationFeature instance = new RegistrationFeature();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
