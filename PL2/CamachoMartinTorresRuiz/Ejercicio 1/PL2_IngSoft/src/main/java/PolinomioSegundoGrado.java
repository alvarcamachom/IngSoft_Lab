/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class PolinomioSegundoGrado {

    //Atributos
    double a;
    double b;
    double c;
    
    //Constructor
    public PolinomioSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Métodos
    public double valor(double x) {
        return a * x * x + b * x + c;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }    
    
    public String calcular() {
        try {
            double discriminante = Math.pow(b, 2) - 4*a*c;
            if (discriminante < 0) {
                return "No existen soluciones reales";
            } else if (a == 0) {
                return "a no puede ser cero";
            } else {
                double resultado1 = (-b - Math.sqrt(discriminante)) / (2*a);
                double resultado2 = (-b + Math.sqrt(discriminante)) / (2*a);
                return "x1 = " + Double.toString(resultado1) + " x2 = " + Double.toString(resultado2);
            }
        } catch (NumberFormatException e) {
            return "Error: introduzca valores numéricos para a, b y c";
        }
    }


    
}
