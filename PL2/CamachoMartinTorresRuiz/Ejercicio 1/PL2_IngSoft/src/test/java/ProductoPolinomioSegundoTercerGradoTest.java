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
public class ProductoPolinomioSegundoTercerGradoTest {
    
    public ProductoPolinomioSegundoTercerGradoTest() {
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
    PolinomioSegundoGrado po1 = new PolinomioSegundoGrado(1, 2, 3);
    PolinomioTercerGrado po2 = new PolinomioTercerGrado(1, 2, 3, 4);
    /**
     * Test of calcularValor method, of class ProductoPolinomioSegundoTercerGrado.
     */
    @Test
    public void testCalcularValor() {
        System.out.println("calcularValor");
        double x = 0.0;
        ProductoPolinomioSegundoTercerGrado instance = new ProductoPolinomioSegundoTercerGrado(po1, po2);
        double expResult = 36.0;
        double result = instance.calcularValor(x);
        assertEquals(expResult, result, 0.0);

    }
    
}
