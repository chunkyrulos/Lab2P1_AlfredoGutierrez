/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_alfredogutierrez;

import java.util.Scanner;

/**
 *
 * @author Alfredo Gutierrez
 */
public class Lab2P1_AlfredoGutierrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menú");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("Introduzca su opción");
        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el número que desea evaluar: ");
                int num = sc.nextInt();
                int cont = 1;
                int cont_cero = 0;

                while (num <= 1) {
                    System.out.println("Intente nuevamente.");
                    num = sc.nextInt();
                }
                boolean esPar = esPar(num);
                boolean esPrimo = esPrimo(num);

                if (esPar) {
                    System.out.println("El número ingresado es par");
                } else {
                    System.out.println("El numero ingresado es impar");

                }
                if (esPrimo) {
                    System.out.println("El numero ingresado es primo");
                } else {
                    System.out.println("El numero ingresado no es primo");

                }

            }
            break;

            case 2: {
                int mcd = 0;
                int num1, num2;
                System.out.println("Ingrese primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Ingrese segundo numero: ");
                num2 = sc.nextInt();
                
                while (num1 != num2) {
                    if (num1 > num2) {
                       
                        num1 = num1 - num2;
                        
                    }
                    if(num1 < num2){
                        
                        num2 = num2 - num1;
                      
                    }  
                }
                System.out.println("El valor de MCD es "+ num2);
                

            }

   

    

    
    

    case 3: {
    
     
            }
    System.out.println (

    "Menú");
    System.out.println (

    "1. Ejercicio 1");
    System.out.println (

    "2. Ejercicio 2");
    System.out.println (

    "3. Ejercicio 3");
    System.out.println (

"Introduzca su opción");
        
        }
    
    }

    private static boolean esPar(int num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean esPrimo(int num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
