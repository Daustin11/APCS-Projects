/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 22brobdani
 */
public class PlanetTest {
    
    public PlanetTest() {
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
     * Test of addDays method, of class Planet.
     */
    @Test
    public void testAddDays() {
        System.out.println("addDays");
        double g = 0.0;
        Planet instance = new Planet();
        instance.addDays(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDays method, of class Planet.
     */
    @Test
    public void testGetDays() {
        System.out.println("getDays");
        Planet instance = new Planet();
        double expResult = 0.0;
        double result = instance.getDays();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOrbits method, of class Planet.
     */
    @Test
    public void testGetNumOrbits() {
        System.out.println("getNumOrbits");
        Planet instance = new Planet();
        int expResult = 0;
        int result = instance.getNumOrbits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaysTowardNext method, of class Planet.
     */
    @Test
    public void testGetDaysTowardNext() {
        System.out.println("getDaysTowardNext");
        Planet instance = new Planet();
        double expResult = 0.0;
        double result = instance.getDaysTowardNext();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
        @Test
    public void testConstructoraddQuizavgScore()
    {
        Student s1 = new Student("Billy");
        s1.addQuiz(100);
        s1.addQuiz(96);
        s1.addQuiz(90);
        assertEquals(95, s1.getAverageScore(),0.0);
        assertEquals(286,s1.getTotalScore(),0.0);
    }
}
