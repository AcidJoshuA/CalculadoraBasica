/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Calculadorabasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int opcion;
    double num1, num2, resultado;
    char continuar;
    do{
    System.out.println("Calculadora Básica");
    System.out.println("sumar");
    System.out.println("restar");
    System.out.println("multiplicar");
    System.out.println("dividir");
    System.out.print("seleccionar una opción: ");
    opcion = scanner.nextInt();
    System.out.print("Ingresar num1: ");
    num1 = scanner.nextDouble();
    System.out.print("Ingresar num2: ");
    num2 = scanner.nextDouble();
    if(opcion == 1){
    resultado = num1 + num2;
    System.out.println("Resultado de suma: " + resultado);
    }else if (opcion == 2){
    resultado = num1 - num2;
    System.out.println("Resultado de resta: " + resultado);
    }else if (opcion == 3){
    resultado = num1 * num2;
    System.out.println("Resultado de multiplicación: " + resultado);
    }else if (opcion == 4){
    if (num2 != 0){
    resultado = num1 / num2;
    System.out.println("Resultado de división: " + resultado);
    }else{
    System.out.println("No se puede dividir por 0.");
    }else{
    System.out.println("Opción inválida.");
    }
    System.out.print("¿Desea continuar? (s/n): ");
    continuar = scanner.next().charAt(0);
    } while (continuar == 's' || continuar == 'S'); 
    System.out.println("Gracias por usar.");
    }
}
