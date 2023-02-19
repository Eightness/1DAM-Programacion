import java.util.Scanner;

public class EjercicioK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hora, min;
        int hora2, min2;
        int minutosTotales;
        int minutosTotales2;
        int diferencia;

        System.out.print("Introduce una hora: ");
        hora = input.nextInt();
        System.out.print("Introduce minutos: ");
        min = input.nextInt();
        System.out.print("Introduce una segunda hora: ");
        hora2 = input.nextInt();
        System.out.print("Introduce otros minutos: ");
        min2 = input.nextInt();

        hora *= 60;
        hora2 *= 60;

        minutosTotales = hora + min;
        minutosTotales2 = hora2 + min2;

        diferencia = minutosTotales - minutosTotales2;

        System.out.println("Hay " + Math.abs(diferencia) + " minutos de diferencia entre las dos horas introducidas.");
    }
}
