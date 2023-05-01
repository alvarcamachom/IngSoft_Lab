/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migui
 */
public class ProductoPolinomioSegundoGrado extends PolinomioSegundoGrado{
    private PolinomioSegundoGrado p;
    
    ProductoPolinomioSegundoGrado(PolinomioSegundoGrado p1, PolinomioSegundoGrado p2) {
        super(0, 0, 0);
        this.p = p1;
        this.a = p1.getA() * p2.getA();
        this.b = p1.getA() * p2.getB() + p1.getB() * p2.getA();
        this.c = p1.getA() * p2.getC() + p1.getB() * p2.getB() + p1.getC() * p2.getA();
    }


    public double valor(double x) {
        return p.valor(x) * super.valor(x);
    }
    
}
