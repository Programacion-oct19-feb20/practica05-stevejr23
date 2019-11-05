/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase5;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * un padre de familia a pagado 3 cuaotas de navidad de sus hijos la cuota 
 * uno fue de 15 dolares y la cuota dos de 10 y la cuota tres de 16 dolares
 * generar un   programa en lenguaje java que permita ingresar por teclado 
 * el valor de las cuota, luego presentar el promedio de dolares pagados entre 
 * las cuotas ademas presentar un mensaje en pantalla (True o False) dependiendo
 * del promedio si el promedio es mayor o igual a 11 deberia salir true si el
 * promedio es menor a 11 deberia salir false
 */
public class EjercicioClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        int cuota1;
        int cuota2;
        int cuota3;
        
        System.out.println("Ingrese el valor de la cuota 1");
        cuota1 = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota 2");
        cuota2 = entrada.nextInt();
        System.out.println("Ingrese el valor del la cuota 3");
        cuota3 = entrada.nextInt();
        
        int promedio = (cuota1 + cuota2 +cuota3)/3;
        System.out.printf("El promedio de las cuotas: %d\n"
                +"promedio: %s\n",promedio, promedio >=11 );
        
    }
    
}
