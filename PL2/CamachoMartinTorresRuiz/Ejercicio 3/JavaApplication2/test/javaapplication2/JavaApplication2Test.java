/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alvarocamacho
 */
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of madr method, of class JavaApplication2.
     */
   @Test
public void testMadr1() {
        System.out.println("madr");
        int a = 6;
        int b = 4;
        int c = 2;
        int expResult = 2;
        int result = JavaApplication2.madr(a, b, c);
        assertEquals(expResult, result);

    }

    @Test
    public void testMadr2() {
        System.out.println("madr");
        int a = 6;
        int b = 2;
        int c = 4;
        int expResult = 2;
        int result = JavaApplication2.madr(a, b, c);
        assertEquals(expResult, result);

    }

    @Test
    public void testMadr3() {
        System.out.println("madr");
        int a = 2;
        int b = 6;
        int c = 4;
        int expResult = 2;
        int result = JavaApplication2.madr(a, b, c);
        assertEquals(expResult, result);

    }


    @Test
    public void testMadr4() {
        System.out.println("madr");
        int a = 6;
        int b = 3;
        int c = 2;
        int expResult = 1;
        int result = JavaApplication2.madr(a, b, c);
        assertEquals(expResult, result);

    }

    @Test
    public void testMadr5() {
        System.out.println("madr");
        int a = 10;
        int b = 6;
        int c = 4;
        int expResult = 2;
        int result = JavaApplication2.madr(a, b, c);
        assertEquals(expResult, result);

    }


    /**
     * Test of main method, of class JavaApplication2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
