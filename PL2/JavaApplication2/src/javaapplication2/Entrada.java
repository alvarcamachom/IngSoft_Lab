/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication2;
import java.io.*;
/**
 *
 * @author migui
 */
public class Entrada {
        static String inicializar(){
    String buzon="";
    InputStreamReader flujo=new InputStreamReader(System.in);
    BufferedReader teclado=new BufferedReader(flujo);
    try{
    buzon=teclado.readLine();
    }
    catch(Exception e){
    System.out.append("Entrada incorrecta)");
    }
    return buzon;
    }
    static int entero(){
    int valor=Integer.parseInt(inicializar());
    return valor;
    }
    static double real(){
    double valor=Double.parseDouble(inicializar());
    return valor;
    }
    static String cadena(){
    String valor=inicializar();
    return valor;
    }
    static char caracter(){
    String valor=inicializar();
    return valor.charAt(0);
}

}
