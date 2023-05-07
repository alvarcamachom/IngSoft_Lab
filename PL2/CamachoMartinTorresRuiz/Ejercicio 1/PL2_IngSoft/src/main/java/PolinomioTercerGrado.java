/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class PolinomioTercerGrado {

    //Atributos
    double a;
    double b;
    double c;
    double d;
    
    //Constructor
    public PolinomioTercerGrado(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public PolinomioTercerGrado() {
    }

    //Métodos
    
    public double valor(double x) {
        return a * x * x * x + b * x * x + c * x + d;
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

    public double getD() {
        return d;
    }
    
    
    public String calcular() {
        double p = (3 * a * c - Math.pow(b, 2)) / (3 * Math.pow(a, 2));
        double q = (2 * Math.pow(b, 3) - 9 * a * b * c + 27 * Math.pow(a, 2) * d) / (27 * Math.pow(a, 3));
        double u = Math.cbrt((-q / 2) + Math.sqrt(Math.pow(q / 2, 2) + Math.pow(p / 3, 3))) + Math.cbrt((-q / 2) - Math.sqrt(Math.pow(q / 2, 2) + Math.pow(p / 3, 3)));
        double x1 = u - (b / (3 * a));
        double x2 = -(u / 2) - (b / (3 * a));
        double x2_imag = Math.abs((Math.sqrt(3) / 2) * (u - (b / (3 * a))));
        double x3 = -(u / 2) - (b / (3 * a));
        double x3_imag = -Math.abs((Math.sqrt(3) / 2) * (u - (b / (3 * a))));
        return "x1 = " + Double.toString(x1) + ", x2 = " + Double.toString(x2) + " + " + Double.toString(x2_imag) + "i, x3 = " + Double.toString(x3) + " + " + Double.toString(x3_imag) + "i";
    } 
}