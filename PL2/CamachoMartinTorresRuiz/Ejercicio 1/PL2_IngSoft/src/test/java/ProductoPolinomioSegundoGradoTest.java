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
public class ProductoPolinomioSegundoGradoTest {

    public ProductoPolinomioSegundoGradoTest() {
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
     * Test of getP method, of class ProductoPolinomioSegundoGrado.
     */
    PolinomioSegundoGrado p1 = new PolinomioSegundoGrado(1, 2, 3);
    PolinomioSegundoGrado p2 = new PolinomioSegundoGrado(4, 5, 6);

    @Test
    public void testGetP() {
        System.out.println("getP");
        ProductoPolinomioSegundoGrado instance = new ProductoPolinomioSegundoGrado(p1, p2);
        PolinomioSegundoGrado expResult = p1;
        PolinomioSegundoGrado result = instance.getP();
        assertEquals(expResult, result);
    }

    /**
     * Test of valor method, of class ProductoPolinomioSegundoGrado.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        double x = 0.0;
        ProductoPolinomioSegundoGrado instance = new ProductoPolinomioSegundoGrado(p1, p2);
        double expResult = 84.0;
        double result = instance.valor(x);
        assertEquals(expResult, result, 0.0);

    }

}
