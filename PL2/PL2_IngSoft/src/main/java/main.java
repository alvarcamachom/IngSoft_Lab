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
        // Definir los valores de los coeficientes
        double a = 2;
        double b = 3;
        double c = 1;
        double d = -6;
        double x = 1;
        
        // Crear un objeto de la clase polinomioSegundoGrado
        PolinomioSegundoGrado polinomio = new PolinomioSegundoGrado(a, b, c);
        PolinomioTercerGrado polinomio2 = new PolinomioTercerGrado(a, b, c, d);

        
        
        
        
        // Calcular el valor del polinomio y mostrar el resultado
        
        System.out.println(polinomio.valor(x));
        System.out.println(polinomio2.valor(x));
        System.out.println(polinomio.calcular());
        System.out.println(polinomio2.calcular());
        
        PolinomioSegundoGrado p1 = new PolinomioSegundoGrado(1, 2, 3);
        PolinomioSegundoGrado p2 = new PolinomioSegundoGrado(4, 5, 6);
        ProductoPolinomioSegundoGrado p = new ProductoPolinomioSegundoGrado(p1, p2);
        
        PolinomioSegundoGrado po1 = new PolinomioSegundoGrado(1, 2, 3);
        PolinomioTercerGrado po2 = new PolinomioTercerGrado(1, 2, 3, 4);
        ProductoPolinomioSegundoTercerGrado po = new ProductoPolinomioSegundoTercerGrado(po1, po2);
        
        System.out.println(p.valor(x));
        System.out.println(po.valor(x));
        
        
    }
}

