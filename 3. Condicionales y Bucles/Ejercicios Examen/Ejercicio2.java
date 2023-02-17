import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /* Programa que pida al usuario el precio sin IVA de varios
        productos (hasta que el usuario introduzca un 0, indicando así
        que no va a introducir más productos). Luego, mostrará por
        pantalla la suma total de todos los productos introducidos,
        el 21% de IVA hay que aplicar y el total con IVA. */

        // Ejemplo: 
        //input: 1, 3, 1, 5, 10 y 0.
        //output: total sin IVA (20), IVA (4,20), total con IVA (24,20).

        Scanner input = new Scanner(System.in);

        double precio = 0;
        double totalSinIVA = 0;
        double IVA = 0;
        double totalConIVA = 0;
        
        do {

            System.out.print("Introduzca un precio (pulse 0 para finalizar): ");
            precio = input.nextDouble();

            totalSinIVA += precio;
            IVA = totalSinIVA * 0.21;
            totalConIVA = totalSinIVA + IVA;

        } while (precio != 0);
        
        System.out.println("Total sin IVA: " + totalSinIVA);
        System.out.println("IVA: " + IVA);
        System.out.println("Total con IVA: " + totalConIVA);

    }
    
}
