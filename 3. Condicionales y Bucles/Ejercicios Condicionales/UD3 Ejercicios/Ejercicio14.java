import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        /* Pedir número de mujeres y hombres en un aula y mostrar el porcentaje de mujeres y hombres. Decir si hay más mujeres, hombres o si hay los mismos. */
        
        int hombres, mujeres;
        double porcentajeHombres, porcentajeMujeres;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzca el número de hombres: ");
        hombres = lector.nextInt();
        System.out.print("Introduzca el número de mujeres: ");
        mujeres = lector.nextInt();

        porcentajeHombres = (double)hombres / (double)mujeres * 100;
        porcentajeMujeres = (double)mujeres / (double)hombres * 100;

        if (hombres == mujeres) {
            System.out.println("Hay el mismo número de hombres que de mujeres");
            System.out.println("Hay un " + (porcentajeHombres) + "% de hombres y un " + (porcentajeMujeres) + "% de mujeres");

        }
            else if (hombres > mujeres) {
                System.out.println("Hay más hombres que mujeres");
                System.out.println("Hay un " + (porcentajeHombres) + "% de hombres y un " + (porcentajeMujeres) + "% de mujeres");

            }
            else if ( hombres < mujeres) {
                System.out.println("Hay más mujeres que hombres");
                System.out.println("Hay un " + (porcentajeHombres) + "% de hombres y un " + (porcentajeMujeres) + "% de mujeres");

            }
    }    
}