import java.util.Scanner;

public class EjercicioC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int precio;

        System.out.print("Introduce un precio: ");
        precio = input.nextInt();

        if (precio < 1000)
            System.out.println("El precio introducido más IVA es: " + precio * 1.21);
            else
                System.out.println("El precio introducido más IVA es: " + precio * 1.5);
    }
}
