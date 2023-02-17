import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int edad;

        System.out.print("Introduce tu edad: ");
        edad = input.nextInt();

        if (edad < 0)
            System.out.println("Imposible.");
            else
                System.out.println("Estás vivo, enhorabuena.");
    }
}
