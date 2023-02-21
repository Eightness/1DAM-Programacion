import java.util.Scanner;

public class AppCuentas_Albert {

    //Variables
    public static int cuentasMAX = 100;                     //Número máximo de cuentas
    public static int numCuentas = 0;                       //Número de cuentas actual
    public static String[] cuentas = String[cuentasMAX];    //Vector para cuentas
    public static String[] nombres = String[cuentasMAX];    //Vector para los nombres
    public static Double[] saldos = Double[cuentasMAX];     //Vector para los saldos

    //Método para mostrar menú
    public static void menu () {
        System.out.println();
        System.out.println("1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Agregar cuenta.");
        System.out.println("5. Eliminar cuenta.");
        System.out.println("6. Buscar cuenta.");
        System.out.println("7. Mostrar morosos.");
        System.out.println("8. Salir.");
    }

    //Método para elegir la opción
    public static int eleccion () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Elegimos opción
        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        return eleccion;
    }

    //Método para trabajar con las diferentes opciones
    public static void opcion (int eleccion) {
        //Switch general
        switch (eleccion) {
            //Ver cuentas
            case 1:
            break;

            //Ingresar dinero
            case 2:
            break;

            //Retirar dinero
            case 3:
            break;

            //Agregar cuenta
            case 4: 
            break;

            //Eliminar cuenta
            case 5:
            break;

            //Buscar cuenta
            case 6:
            break;

            //Mostrar morosos
            case 7:
            break;

            //Salir
            case 8:
            salir();
            break;

            default: System.out.println("Opción inválida.");
        }
    }

    //Método para obtener Double
    public static double pedirDouble() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Pedimos cantidad
        System.out.print("Introduce cantidad: ");
        int cantidad = input.nextDouble();

        return cantidad;
    }

    //Método para obtener String
    public static String pedirString() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Pedimos nombre
        System.out.println("Introduce nombre: ");
        String nombre = input.nextLine;

        return nombre;
    }

    //Método 1 Ver cuentas
    public static void verCuentas (String[] cuentas, int numCuentas) {

    }

    //Método 2 Ingresar dinero
    public static void ingresarDinero () {

    }

    //Método 3 Retirar dinero
    public static void reitrarDinero () {

    }

    //Método 4 Agregar cuenta
    public static void agregarCuenta () {

    }

    //Método 5 Eliminar cuenta
    public static void eliminarCuenta () {

    }

    //Método 6 Buscar cuenta
    public static void buscarCuenta () {

    }

    //Método 7 Mostrar morosos
    public static void mostrarMorosos () {

    }

    //Método 8 Salir
    public static void salir () {
        System.out.println("Adiós.");
        System.exit(0);
    }

    //MAIN
    public static void main(String[] args) {
        
    }
}
