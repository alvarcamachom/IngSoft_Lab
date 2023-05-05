/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author migui
 */
public class JavaApplication2 {
    
    static int madr (int a, int b, int c){
        int mr=1;
        int mmm;
        mmm = ppp (a,ppp(b,c));
        mr=1; 
        for (int i=2;i<=mmm;i++)
            if( a%i==0 && b%i==0 && c%i==0) // si i divide a 'a', a 'b' y a 'c'
                mr=i; // i será el nuevo mr.
        return(mr);
    }
    static int ppp(int a, int b){
        int mmm;
        if(a>b)
            mmm=b;
        else
            mmm=a;
        return(mmm);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b,c , mr;
        System.out.print("Introduce a: ");
        a=Entrada.entero();
        System.out.print("Introduce b: ");
        b=Entrada.entero();
        System.out.print("Introduce c: ");
        c=Entrada.entero();
        System.out.println("");
        mr = madr  (a, b, c);
        System.out.println("El mr de ("+a+", "+b+", "+c+") es: "+mr);
        }
}

    
    
