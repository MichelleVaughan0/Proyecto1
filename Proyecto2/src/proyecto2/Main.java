/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.Scanner;
import static proyecto2.Numeros.devolverNumeros;

/**
 *
 * @author mvaug
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ingreso = new Scanner (System.in);
        
        System.out.println("Impresora de números");
        System.out.print("Ingrese número 1: ");
        int numero1 = ingreso.nextInt();
        System.out.print("Ingrese número 2: ");
        int numero2 = ingreso.nextInt();
        System.out.println("NÚMEROS COMPRENDIDOS ENTRE " + numero1 + " Y " + numero2 + " : ");
        System.out.println(devolverNumeros(numero1,numero2));
        
    }
}
