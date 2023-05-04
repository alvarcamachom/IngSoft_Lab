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
public class PolinomioTercerGradoTest {
    
    public PolinomioTercerGradoTest() {
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
     * Test of valor method, of class PolinomioTercerGrado.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        double x = 1.0;
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        double expResult = 0.0;
        double result = instance.valor(x);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Test of getA method, of class PolinomioTercerGrado.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        double expResult = 2.0;
        double result = instance.getA();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getB method, of class PolinomioTercerGrado.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        double expResult = 3;
        double result = instance.getB();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getC method, of class PolinomioTercerGrado.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        double expResult = 1.0;
        double result = instance.getC();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getD method, of class PolinomioTercerGrado.
     */
    @Test
    public void testGetD() {
        System.out.println("getD");
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        double expResult = -6.0;
        double result = instance.getD();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcular method, of class PolinomioTercerGrado.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        PolinomioTercerGrado instance = new PolinomioTercerGrado(2, 3, 1, -6);
        String expResult = "x1 = 0.9999999999999973, x2 = -1.2499999999999987 + 0.8660254037844363i, x3 = -1.2499999999999987 + -0.8660254037844363i";
        String result = instance.calcular();
        assertEquals(expResult, result);
    }
    
}
