import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int edad;

        System.out.print("Introduce tu edad: ");
        edad = input.nextInt();

        if (edad >= 100)
            System.out.println("Centenario.");
    }
}
