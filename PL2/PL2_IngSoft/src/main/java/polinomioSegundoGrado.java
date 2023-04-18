/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class polinomioSegundoGrado {

    //Atributos
    private double a;
    private double b;
    private double c;
    
    //Constructor
    public polinomioSegundoGrado() {
    }

    //Métodos
    public String calcular(double a, double b, double c){
        double discriminante = Math.sqrt(Math.pow(b, 2))-4*a*c;
        double resultado1 = (-b-(discriminante))/2*a;
        double resultado2 = (-b+(discriminante))/2*a;
        
        return "x1 = " + Double.toString(resultado1) + " x2 = " + Double.toString(resultado2);
    }
    
}
