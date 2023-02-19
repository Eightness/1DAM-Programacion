/* Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y
detectar si existe brecha salarial entre ambos. 
El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado). 
Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. 
Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada género. */

import java.util.Scanner;

public class Matriz5 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Número de trabajadores (número de filas de la matriz)
        System.out.print("Introduce el número de trabajadores de la empresa: ");
        int n = input.nextInt();

        //Creamos la matriz
        double[][] array = new double[n][2];

        //Variables
        int hombres = 0;
        int mujeres = 0;
        double mediaHombres = 0;
        double mediaMujeres = 0;

        //Bucle para asignar el género y salario a los trabajadores
        for (int trabajador = 0; trabajador < array.length; trabajador++) {
            
            //Género
            System.out.println("Introduce el género del trabajador " + (trabajador + 1) + " (0 varón, 1 mujer): ");
            array[trabajador][0] = input.nextDouble();
            
            //Salario
            System.out.println("Introduce el salario del trabajador " + (trabajador + 1) + ": ");
            array[trabajador][1] = input.nextInt();

            //Condición hombres
            if (array[trabajador][0] == 0) {
                hombres += 1;
                mediaHombres += array[trabajador][1];
            }
            
            //Condición mujeres
            if (array[trabajador][0] == 1) {
                mujeres += 1;
                mediaMujeres += array[trabajador][1];
            }
        
        }

        System.out.println();
        
        //Bucle para imprimir la matriz
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }
        
            System.out.println();

        }

        System.out.println();

        //Resultados
        System.out.println("La media del salario de las mujeres es: " + (mediaMujeres / mujeres));
        System.out.println("La media del salario de los hombres es: " + (mediaHombres / hombres));

    }
    
}