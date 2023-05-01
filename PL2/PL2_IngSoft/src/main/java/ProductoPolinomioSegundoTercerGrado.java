/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migui
 */
public class ProductoPolinomioSegundoTercerGrado extends PolinomioTercerGrado {
    private PolinomioSegundoGrado p;
    
    ProductoPolinomioSegundoTercerGrado(PolinomioSegundoGrado p1, PolinomioTercerGrado p2) {
        super(0, 0, 0, 0);
        this.p = p1;
        this.a = p1.getA() * p2.getA();
        this.b = p1.getA() * p2.getB() + p1.getB() * p2.getA();
        this.c = p1.getA() * p2.getC() + p1.getB() * p2.getB() + p1.getC() * p2.getA();
        this.d = p1.getB() * p2.getC() + p1.getC() * p2.getB();
    }

    public double calcularValor(double x) {
        double resultado1 = p.valor(x);
        double resultado2 = super.valor(x);
        return resultado1 * resultado2;
    }
    
}
