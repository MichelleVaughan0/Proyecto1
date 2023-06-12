/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author mvaug
 */
import java.util.*;

public class Numeros {

    /**
     * Declaración de variables
     *
     * @param numero1
     * @param numero2
     * @return numeros[]
     * @throws java.lang.Exception
     *
     */
    public static List<Integer> devolverNumeros(int numero1, int numero2) throws Exception {
        List<Integer> numeros = new ArrayList<>();

        for (int i = numero1 + 1; i < numero2; i++) {
            if(i%2 !=0)
            numeros.add(i);
        }

        return numeros;
    }
}
