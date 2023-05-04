/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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
public class PolinomioSegundoGradoTest {
    
    public PolinomioSegundoGradoTest() {
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
     * Test of valor method, of class PolinomioSegundoGrado.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        double x = 1;
        PolinomioSegundoGrado instance = new PolinomioSegundoGrado(2, 3, 1);
        double expResult = 6.0;
        double result = instance.valor(x);
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of getA method, of class PolinomioSegundoGrado.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        PolinomioSegundoGrado instance = new PolinomioSegundoGrado(2, 3, 1);
        double expResult = 2.0;
        double result = instance.getA();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getB method, of class PolinomioSegundoGrado.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        PolinomioSegundoGrado instance = new PolinomioSegundoGrado(2, 3, 1);
        double expResult = 3.0;
        double result = instance.getB();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getC method, of class PolinomioSegundoGrado.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        PolinomioSegundoGrado instance = new PolinomioSegundoGrado(2, 3, 1);
        double expResult = 1.0;
        double result = instance.getC();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcular method, of class PolinomioSegundoGrado.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        PolinomioSegundoGrado instance = new PolinomioSegundoGrado(2, 3, 1);
        String expResult = "x1 = -1.0 x2 = -0.5";
        String result = instance.calcular();
        assertEquals(expResult, result);
    }
    
}
