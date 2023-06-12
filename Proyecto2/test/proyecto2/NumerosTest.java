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
        List<Integer> esperado1 = List.of(3, 4, 5);
        assertEquals(esperado1, resultado1);

        /*Caso de prueba 2
        Esperado: Fallar
         */
        System.out.println("Test02");
        int numero3 = -3;
        int numero4 = 2;
        List<Integer> resultado2 = Numeros.devolverNumeros(numero3, numero4);
        List<Integer> esperado2 = List.of(-4, -3, -2, -1, 0, 1);
        assertEquals(esperado2, resultado2);
    }
}
