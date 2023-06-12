/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto2;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mvaug
 */
public class NumerosTest {

    /**
     * Test of devolverNumeros method, of class Numeros.
     */
    @Test
    public void testDevolverNumeros() throws Exception {
        // Caso de prueba 1
        System.out.println("Test01");
        int numero1 = 2;
        int numero2 = 6;
        List<Integer> resultado1 = Numeros.devolverNumeros(numero1, numero2);
        List<Integer> esperado1 = List.of(3,5);
        assertEquals(esperado1, resultado1);

        //Caso de prueba 2
        System.out.println("Test02");
        int numero3 = -3;
        int numero4 = 2;
        List<Integer> resultado2 = Numeros.devolverNumeros(numero3, numero4);
        List<Integer> esperado2 = List.of(-1, 1);
        assertEquals(esperado2, resultado2);
                
        //Caso de prueba 3
        System.out.println("Test03");
        int numero5 = 10;
        int numero6 = 20;
        List<Integer> resultado3 = Numeros.devolverNumeros(numero5, numero6);
        List<Integer> esperado3 = List.of(11,13,15,17,19);
        assertEquals(esperado3, resultado3);
    }
}
