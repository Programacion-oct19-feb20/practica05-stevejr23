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
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean valorA = true;
        boolean valorB = false;

        System.out.printf("Negacion: !%s = %s\n", valorA, !valorA);
        System.out.printf("Negacion: !%s = %s\n", valorB, !valorB);
        System.out.printf("And: %s & %s = %s\n", valorA, valorB, 
                valorA & valorB);
        System.out.printf("And: %s | %s = %s\n", valorA, valorB, 
                valorA | valorB);
       
        //V and F=F
        //V and V=v
        //F and F=F
        //V or V=V
        //V or F=V
        //F or V=V
        //F or F=F
    }

}
