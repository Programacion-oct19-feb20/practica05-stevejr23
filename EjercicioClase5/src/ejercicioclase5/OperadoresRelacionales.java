/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase5;

/**
 *
 * @author reroes
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 10;

        System.out.printf("Igualdad: %d == %d = %s\n", valorA, valorB,
                valorA == valorB);//el doble = es para ver si dos variables son iguales
        System.out.printf("Desigualdad: %d != %d = %s\n", valorA, valorB,
                valorA != valorB);
        System.out.printf("Mayor: %d > %d = %s\n", valorA, valorB,
                valorA > valorB);
        System.out.printf("Menor: %d < %d = %s\n", valorA, valorB,
                valorA < valorB);
        System.out.printf("Mayor Igual: %d >= %d = %s\n", valorA, valorB,
                valorA >= valorB);
        System.out.printf("Menor Igual: %d <= %d = %s\n", valorA, valorB,
                valorA <= valorB);
    }

}
