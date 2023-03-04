import java.util.Scanner;

public class AppCuentas_Albert {

    //Variables
    public static Scanner input = new Scanner(System.in);
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
            verCuentas();
            break;

            //Ingresar dinero
            case 2:
            ingresarDinero();
            break;

            //Retirar dinero
            case 3:
            retirarDinero();
            break;

            //Agregar cuenta
            case 4: 
            agregarCuenta();
            numCuentas++;
            break;

            //Eliminar cuenta
            case 5:
            eliminarCuenta();
            numCuentas--;
            break;

            //Buscar cuenta
            case 6:
            buscarCuenta();
            break;

            //Mostrar morosos
            case 7:
            mostrarMorosos();
            break;

            //Salir
            case 8:
            salir();
            break;

            //Caso para debuggear y ver el array en cada caso
            case 9:
            for (int i = 0; i < cuentas.length; i++) {
                System.out.println(cuentas[i]);
            }
            break;

            //Caso default (no se elige ninguna opción)
            default: System.out.println("Opción inválida.");
        }
    }

    //Método para obtener Int
    public static int pedirInt() {
        //Pedimos cuenta
        System.out.print("Introduce la cuenta: ");
        int posicion = input.nextInt();

        return posicion;
    }

    //Método para obtener Double
    public static double pedirDouble() {
        //Pedimos cantidad
        System.out.print("Introduce cantidad: ");
        double cantidad = input.nextDouble();

        return cantidad;
    }

    //Método para obtener String
    public static String pedirString() {
        //Pedimos nombre
        input.nextLine();
        System.out.print("Introduce nombre: ");
        String nombre = input.nextLine();

        return nombre;
    }

    //Método para comprobar si no hay cuentas
    public static boolean noCuentas() {
        return (cuentas[0] == null);
    }

    //Método para comprobar si existe una cuenta
    public static boolean cuentaExiste(int posicion) {
        return (cuentas[posicion] != null);
    }

    //Método para verificar si existe ya un nombre de cuenta idéntico
    public static boolean nombreRepetido() {
        boolean repetido = false;
        for (int i = 0; i < numCuentas; i++) {
            if (nombres[i].toLowerCase().equals(nombres[numCuentas].toLowerCase())) {
                repetido = true;
            }
        }
        return repetido;
    }

    //Método 1 Ver cuentas
    public static void verCuentas () {
        //Verificamos si hay cuentas
        if (noCuentas()) {
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
        if (noCuentas()) {
            System.out.println("No hay cuentas.");
        } else {
            verCuentas();
            int busqueda = pedirInt();
            Double incremento;

            if (cuentaExiste(busqueda)) {
                for (int i = 0; i < numCuentas; i++) {
                    if (busqueda == i) {
                        do {
                            incremento = pedirDouble();
                            
                            if (incremento < 0) {
                                System.out.println("No puedes ingresar números negativos.");
                            }
                        } while (incremento < 0);
                        
                        saldos[i] += incremento;
                        cuentas[i] = nombres[i] + "\t" + saldos[i] + " euros.";
                    }
                }
                System.out.println("Ingresado correctamente.");
            } else {
                System.out.println("No existe la cuenta.");
            }
        }
    }

    //Método 3 Retirar dinero
    public static void retirarDinero() {
        if (noCuentas()) {
            System.out.println("No hay cuentas.");
        } else {
            verCuentas();
            int busqueda = pedirInt();
            Double quitar;

            if (cuentaExiste(busqueda)) {
                for (int i = 0; i < numCuentas; i++) {
                    if (busqueda == i) {
                        do {
                            quitar = pedirDouble();
                            
                            if (quitar < 0) {
                                System.out.println("No puedes retirar números negativos.");
                            }
                        } while (quitar < 0);
                        
                        saldos[i] -= quitar;
                        cuentas[i] = nombres[i] + "\t" + saldos[i] + " euros.";
                    }
                }
                System.out.println("Retirado correctamente.");
            } else {
                System.out.println("No existe la cuenta.");
            }
        }
    }

    //Método 4 Agregar cuenta
    public static void agregarCuenta() {
        if (numCuentas < 100) {
            do{
                nombres[numCuentas] = pedirString();
    
                if (nombreRepetido()) {
                    System.out.println("Nombre ya existente.");
                }
            } while (nombreRepetido());
    
            saldos[numCuentas] = pedirDouble();
            cuentas[numCuentas] = nombres[numCuentas] + "\t" + saldos[numCuentas] + " euros.";
        } else {
            System.out.println("Máximo número de cuentas alcanzado.");
        }
    }

    //Método 5 Eliminar cuenta
    public static void eliminarCuenta() {
        verCuentas();
        int posicion;

        //Comprobamos que haya cuentas creadas
        if (!noCuentas()) {
            //Pedimos la cuenta que se desea eliminar hasta que sea una posición correcta
            do{
                posicion = pedirInt();
    
                //Condicional para verificar si existe la cuenta
                if (!cuentaExiste(posicion)) {
                    System.out.println("Cuenta inexistente.");
                }
            } while (!cuentaExiste(posicion));
            
            nombres[posicion] = null;
            saldos[posicion] = 0.0;
            for (int i = posicion + 1; i < numCuentas; i++) {
                nombres[posicion] = nombres[i];
                saldos[posicion] = saldos[i];
                cuentas[posicion] = cuentas[i];
                posicion++;
            }
            
            System.out.println("Cuenta seleccionada eliminada.");
        }
    }

    //Método 6 Buscar cuenta
    public static void buscarCuenta() {
        int count = 0;
        String busqueda; 
        
        if (noCuentas()) {
            System.out.println("No hay cuentas.");
        } 
        if (!noCuentas()) {
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
    public static void mostrarMorosos() {
        int count = 0;

        //Condicional para comprobar si hay cuentas
        if (!noCuentas()) {
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
        System.out.println("Adiós.");
        System.out.println();
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
