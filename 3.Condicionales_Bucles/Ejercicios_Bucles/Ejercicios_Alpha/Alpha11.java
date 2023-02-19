import java.util.Scanner;

public class Alpha11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int precio = 0;
        int precioTotal = 0;

        System.out.println("Vaya introduciendo precios (introduzca negativo para parar): ");
        do {
            precio = input.nextInt();
            precioTotal += precio;
        }
        while (precio > 0);
        System.out.println("La suma total de los precios introducidos es: " + precioTotal);
        
    }
}