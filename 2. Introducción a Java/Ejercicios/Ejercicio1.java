import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args) {
        int num;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = lector.nextInt();
        System.out.print("El numero introducido es: "+num);
    }
}