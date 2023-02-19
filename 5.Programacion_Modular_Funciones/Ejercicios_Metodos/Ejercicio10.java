/*
 * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
 * Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no.
 */

 import java.util.Scanner;

 public class Ejercicio10 {
 
     //Método para verificar si la fecha es correcta o no
     public static int validezFecha(int mes, int dia) {

        if (mes > 0 && mes < 13 && dia > 0 && dia < 31) {
            return 1;
        }
        
        return 0;
     }
 
     //Main
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introduce año: ");
         int año = input.nextInt();

         System.out.print("Introduce mes: ");
         int mes = input.nextInt();

         System.out.print("Introduce día: ");
         int dia = input.nextInt();

         System.out.println();

         if (validezFecha(mes, dia) == 1) {
            System.out.println("La fecha es correcta.");
         } else {
            System.out.println("La fecha es incorrecta.");
         }


        }
     
 }
 