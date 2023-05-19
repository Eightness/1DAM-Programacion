import java.util.Scanner;

public class CuentasBanco {

    //MAIN
    public static void main(String[] args) {

    }

    //Atributos
    private static Scanner input = new Scanner(System.in);
    private static CuentaCorriente cuentaCorriente = new CuentaCorriente();
    private static CuentaAhorro cuentaAhorro = new CuentaAhorro();
    private static CuentaPro cuentaPro = new CuentaPro();
    private static boolean submenu = false;

    //Métodos

    //Método para obtener un double
    private static double getDouble(String mensaje) {
        System.out.println();
        System.out.print(mensaje);
        double num = input.nextDouble();
        input.nextLine();
        return num;
    }

    //Método para obtener un int
    private static int getInt(String mensaje) {
        System.out.println();
        System.out.print(mensaje);
        int num = input.nextInt();
        input.nextLine();
        return num;
    }

    //Menú principal
    private static int menu() {
        System.out.println("1. Cuenta corriente.");
        System.out.println("2. Cuenta Ahorro.");
        System.out.println("3. Cuenta Pro.");
        System.out.println("4. Salir.");
        return getInt("Elige opción: ");
    }
    
    //Menú cuenta
    private static int menuCuenta() {
        System.out.println("1. Ver cuenta.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Atrás.");
        return getInt("Elige opción: ");
    }

    //Switch menú principal
    private static void switchMenu(int opcion) {
        switch(opcion) {
            case 1:
                submenu = true;
                while (submenu) {
                    switchCuentaCorriente(menuCuenta());
                }
            break;

            case 2:
            submenu = true;
                while (submenu) {
                    switchCuentaAhorro(menuCuenta());
                }
            break;

            case 3:
                submenu = true;
                while (submenu) {
                    switchCuentaPro(menuCuenta());
                }
            break;

            case 4:
                System.out.println();
                System.out.println("Adiós.");
                System.out.println();
                System.exit(0);
            break;

            default:
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Switch menú cuenta corriente
    private static void switchCuentaCorriente(int opcion) {
        switch(opcion) {
            case 1:
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
                submenu = false;
            break;

            default:
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Switch menú cuenta ahorro
    private static void switchCuentaAhorro(int opcion) {
        switch(opcion) {
            case 1:
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
                submenu = false;
            break;

            default:
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Switch menú cuenta pro
    private static void switchCuentaPro(int opcion) {
        switch(opcion) {
            case 1:
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
                submenu = false;
            break;

            default:
                System.out.println("Opción inválida.");
            break;
        }
    }
    
}
