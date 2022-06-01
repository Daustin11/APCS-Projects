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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of addQuiz method, of class Student.
     */
    @Test
    public void testAddQuiz() {
        System.out.println("addQuiz");
        double g = 0.0;
        Student instance = new Student();
        instance.addQuiz(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Student.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Student instance = new Student();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPoints method, of class Student.
     */
    @Test
    public void testGetTotalPoints() {
        System.out.println("getTotalPoints");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getTotalPoints();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverage method, of class Student.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getAverage();
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
        assertEquals(95, s1.getAverage(),0.0);
        assertEquals(286,s1.getTotalPoints(),0.0);
    }

    
}
