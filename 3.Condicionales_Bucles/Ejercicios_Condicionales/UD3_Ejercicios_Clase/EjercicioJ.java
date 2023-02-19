import java.util.Scanner;

public class EjercicioJ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dia, mes, año;

        System.out.print("Introduce día (en número): ");
        dia = input.nextInt();
        System.out.print("Introduce mes (en número): ");
        mes = input.nextInt();
        System.out.print("Introduce año (en número): ");
        año = input.nextInt();

        if (dia < 1 || dia > 30 || mes < 1 || mes > 12)
            System.out.println("La fecha no es válida.");

            else {
                dia += 1;

                if (dia > 30) {
                    dia = 1;
                    mes += 1;

                }

                if (mes > 12) {
                    mes = 1;
                    año += 1;

                }

                System.out.println("La fecha al día siguiente es: " + dia + "/" + mes + "/" + "/" + año);
            }
    }
}
