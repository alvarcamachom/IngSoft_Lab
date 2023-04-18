/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alvarocamacho
 */
public class main {
    public static void main(String[] args) {
        // Crear un objeto de la clase polinomioSegundoGrado
        polinomioSegundoGrado polinomio = new polinomioSegundoGrado();
        
        // Definir los valores de los coeficientes
        int a = 6;
        int b = 1;
        int c = 35;
        
        // Calcular el valor del polinomio y mostrar el resultado
        System.out.println(polinomio.calcular(a, b, c));
    }
}

