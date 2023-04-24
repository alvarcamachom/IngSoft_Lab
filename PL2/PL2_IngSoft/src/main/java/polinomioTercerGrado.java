/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class polinomioTercerGrado {

    //Atributos
    private double a;
    private double b;
    private double c;
    private double d;
    
    //Constructor
    public polinomioTercerGrado() {
    }

    //Métodos
public String calcular(double a, double b, double c, double d) {
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