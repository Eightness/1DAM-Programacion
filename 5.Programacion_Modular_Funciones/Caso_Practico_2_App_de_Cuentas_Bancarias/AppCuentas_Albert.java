import java.util.Scanner;

public class AppCuentas_Albert {

    //Variables
    public static int cuentasMAX = 100;                         //Número máximo de cuentas
    public static int numCuentas = 0;                           //Número de cuentas actual
    public static String[] cuentas = new String[cuentasMAX];    //Vector para cuentas
    public static String[] nombres = new String[cuentasMAX];    //Vector para los nombres
    public static Double[] saldos = new Double[cuentasMAX];     //Vector para los saldos

    //Método para mostrar menú
    public static void menu() {
        System.out.println();
        System.out.println("1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Agregar cuenta.");
        System.out.println("5. Eliminar cuenta.");
        System.out.println("6. Buscar cuenta.");
        System.out.println("7. Mostrar morosos.");
        System.out.println("8. Salir.");
        System.out.println();
    }

    //Método para elegir la opción
    public static int eleccion() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Elegimos opción
        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        System.out.println();

        return eleccion;
    }

    //Método para trabajar con las diferentes opciones
    public static void opcion(int eleccion) {
        //Switch general
        switch (eleccion) {
            //Ver cuentas
            case 1:
            verCuentas(cuentas, numCuentas);
            break;

            //Ingresar dinero
            case 2:
            break;

            //Retirar dinero
            case 3:
            break;

            //Agregar cuenta
            case 4: 
            agregarCuenta(cuentas, nombres, saldos, numCuentas);
            numCuentas++;
            break;

            //Eliminar cuenta
            case 5:
            eliminarCuenta(cuentas, numCuentas);
            numCuentas--;
            break;

            //Buscar cuenta
            case 6:
            buscarCuenta(cuentas, numCuentas);
            break;

            //Mostrar morosos
            case 7:
            mostrarMorosos(cuentas, saldos, numCuentas);
            break;

            //Salir
            case 8:
            salir();
            break;

            default: System.out.println("Opción inválida.");
        }
    }

    //Método para obtener Int
    public static int pedirInt() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Pedimos cuenta
        System.out.print("Introduce la cuenta que deseas eliminar (número): ");
        int posicion = input.nextInt();

        return posicion;
    }

    //Método para obtener Double
    public static double pedirDouble() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Pedimos cantidad
        System.out.print("Introduce cantidad: ");
        double cantidad = input.nextDouble();

        return cantidad;
    }

    //Método para obtener String
    public static String pedirString() {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Pedimos nombre
        System.out.print("Introduce nombre: ");
        String nombre = input.nextLine();

        return nombre;
    }

    //Método para comprobar si no hay cuentas
    public static boolean noCuentas(String[] cuentas) {
        return (cuentas[0] == null);
    }

    //Método para comprobar si existe una cuenta
    public static boolean cuentaExiste(String[] cuentas, int posicion) {
        return (cuentas[posicion] != null);
    }

    //Método para verificar si existe ya un nombre de cuenta idéntico
    public static boolean nombreRepetido(String[] cuentas, int numCuentas) {
        boolean repetido = false;
        for (int i = 0; i < numCuentas; i++) {
            if (nombres[i].toLowerCase().equals(nombres[numCuentas].toLowerCase())) {
                repetido = true;
            }
        }
        return repetido;
    }

    //Método 1 Ver cuentas
    public static void verCuentas (String[] cuentas, int numCuentas) {
        //Verificamos si hay cuentas
        if (noCuentas(cuentas)) {
            System.out.println("No hay cuentas.");
        } else {
            for (int i = 0; i < numCuentas; i++) {
                System.out.println(i + ". " + cuentas[i]);
                System.out.println();
            }
        }
    }

    //Método 2 Ingresar dinero
    public static void ingresarDinero() {

    }

    //Método 3 Retirar dinero
    public static void retirarDinero() {

    }

    //Método 4 Agregar cuenta
    public static void agregarCuenta(String[] cuentas, String[] nombres, Double[] saldos, int numCuentas) {
        if (numCuentas < 100) {
            do{
                nombres[numCuentas] = pedirString();
    
                if (nombreRepetido(cuentas, numCuentas)) {
                    System.out.println("Nombre ya existente.");
                }
            } while (nombreRepetido(cuentas, numCuentas));
    
            saldos[numCuentas] = pedirDouble();
            cuentas[numCuentas] = nombres[numCuentas] + "\t" + saldos[numCuentas] + " euros.";
        } else {
            System.out.println("Máximo número de cuentas alcanzado.");
        }
    }

    //Método 5 Eliminar cuenta
    public static void eliminarCuenta(String[] cuentas, int numCuentas) {
        verCuentas(cuentas, numCuentas);
        int posicion;

        //Comprobamos que haya cuentas creadas
        if (!noCuentas(cuentas)) {
            //Pedimos la cuenta que se desea eliminar hasta que sea una posición correcta
            do{
                posicion = pedirInt();
    
                if (!cuentaExiste(cuentas, posicion)) {
                    System.out.println("Cuenta inexistente.");
                }
            } while (!cuentaExiste(cuentas, posicion));
            
            //Condicional para verificar si existe la cuenta
            cuentas[posicion] = null;
            for (int i = posicion + 1; i <= numCuentas; i++) {
                cuentas[posicion] = cuentas[i];
                posicion++;
            }
            System.out.println("Cuenta seleccionada eliminada.");
        }
    }

    //Método 6 Buscar cuenta
    public static void buscarCuenta(String[] cuentas, int numCuentas) {
        int count = 0;
        String busqueda; 
        
        if (noCuentas(cuentas)) {
            System.out.println("No hay cuentas.");
        } 
        if (!noCuentas(cuentas)) {
            System.out.println();
            busqueda = pedirString();
    
            System.out.println("Resultado: ");
            System.out.println();
            for (int i = 0; i < numCuentas; i++) {
                if (cuentas[i].toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println(i + ". " + cuentas[i]);
                    System.out.println();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No se han encontrado cuentas.");
            }
        }
    }

    //Método 7 Mostrar morosos
    public static void mostrarMorosos(String[] cuentas, Double[] saldos, int numCuentas) {
        int count = 0;

        //Condicional para comprobar si hay cuentas
        if (!noCuentas(cuentas)) {
            //Bucle para iterar sobre las cuentas con saldo negativo
            for (int i = 0; i < numCuentas; i++) {
                if (saldos[i] < 0) {
                    System.out.println(i + ". " + cuentas[i]);
                    System.out.println();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No hay morosos.");
            }
        } else {
            System.out.println("No hay cuentas.");
        }
    }

    //Método 8 Salir
    public static void salir() {
        System.out.println();
        System.out.println("Adiós.");
        System.exit(0);
    }

    //MAIN
    public static void main(String[] args) {

        //Bienvenida
        System.out.println();
        System.out.println("Bienvenido/a a la App de cuentas de Albert.");

        //Bucle App Cuentas
        while (true) {
            menu();
            opcion(eleccion());
        }
        
    }
}
