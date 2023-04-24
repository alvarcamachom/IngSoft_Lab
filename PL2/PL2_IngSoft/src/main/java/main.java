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
        polinomioTercerGrado polinomio2 = new polinomioTercerGrado();
        
        // Definir los valores de los coeficientes
        double a = 4;
        double b = 2;
        double c = 1;
        //double d = -6;
        
        
        // Calcular el valor del polinomio y mostrar el resultado
        //System.out.println(polinomio.calcular(a, b, c));
        System.out.println(polinomio.calcular(a,b,c));
    }
}

