import java.util.Scanner;

public class AppContactos_Albert {
    
    //Variables
    public static int contactosMAX = 100;                               //Número máximo de contactos
    public static int numContactos = 0;                                 //Número de contactos añadidos
    public static String[] contactos = new String[contactosMAX];        //Vector de los contactos
    public static String[] nombres = new String[contactosMAX];          //Vector de los nombres
    public static String[] telefonos = new String[contactosMAX];        //Vector de los teléfonos
    public static String[] correos = new String[contactosMAX];          //Vector de los correos

    //Método para mostrar el menú
    public static void menu () {
        System.out.println();
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contactos.");
        System.out.println("3. Eliminar contactos.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.println();
    }

    //Método para elegir opción
    public static int eleccion () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Preguntamos por la elección
        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        System.out.println();

        return eleccion;
    }

    //Método para obtener dato
    public static String pedirDato () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Obtenemos el dato
        String dato = input.nextLine();
        
        return dato;
    }

    //Método para obtener posicion para eliminar
    public static int pedirPosicion () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Obtenemos el dato
        System.out.print("Introduce contacto que desea eliminar (número): ");
        int dato = input.nextInt();

        return dato;
    }

    //Método para trabajar con la opción seleccionada
    public static void opcion (int eleccion) {
        //Switch para cada opción
        switch (eleccion) {

            //Ver contactos
            case 1:
            verContactos(contactos);
            break;

            //Agregar contactos
            case 2:
            agregarContacto(contactos, nombres, telefonos, correos, numContactos);
            numContactos++;
            break;

            //Eliminar contactos
            case 3:
            eliminarContacto(contactos, pedirPosicion(), numContactos);
            numContactos--;
            break;

            //Buscar por nombre
            case 4:
            buscarEspecifico(contactos, nombres, numContactos);
            break;

            //Buscar por teléfono
            case 5:
            buscarEspecifico(contactos, telefonos, numContactos);
            break;

            //Buscar por correo
            case 6:
            buscarEspecifico(contactos, correos, numContactos);
            break;

            //Búsqueda global
            case 7:
            buscarGlobal(contactos, numContactos);;
            break;

            //Salir
            case 8:
            salir();
            break;

            default: System.out.println("Opción inválida.");
        }
    }

    //Método 1 Ver Contactos
    public static void verContactos (String[] contactos) {
        //Condicional para comprobar si hay algún contacto
        if (contactos[0] != null) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(i + ". " + contactos[i]);
                    System.out.println();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("No hay ningún contacto.");
        }
    }

    //Método 2 Agregar Contacto
    public static void agregarContacto (String[] contactos, String[] nombres, String[] telefonos, String[] correos, int numContactos) {
        System.out.print("Introduce nombre: ");
        nombres[numContactos] = "Nombre: " + pedirDato();

        System.out.print("Introduce teléfono: ");
        telefonos[numContactos] = "Telf: " + pedirDato();

        System.out.print("Introduce correos: ");
        correos[numContactos] = "Mail: " + pedirDato();

        contactos[numContactos] = nombres[numContactos] + "\t" + telefonos[numContactos] + "\t" + correos[numContactos];
    }

    //Método 3 Eliminar Contacto
    public static void eliminarContacto (String[] contactos, int posicion, int numContactos) {
        //Eliminamos el contacto seleccionado
        contactos[posicion] = null;
        //Desplazamos contactos hacia la izquierda
        for (int i = posicion + 1; i <= numContactos; i++) {
            contactos[posicion] = contactos [i];
            posicion++;
        }
        System.out.println("Contacto seleccionado eliminado.");
    }

    //Método 4, 5, 6 Búsqueda Espefícia 
    public static void buscarEspecifico (String[] contactos, String[] array, int numContactos) {
        //Variables
        int count = 0;
        String busqueda;

        if (contactos[0] != null) {
            //Introduce dato
            System.out.print("Buscar: ");
            busqueda = pedirDato();
            System.out.println();

            System.out.println("Resultado:");
            System.out.println();

            //Bucle para encontrar dato
            for (int i = 0; i < numContactos; i++) {
                if (array[i].toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println(i + ". " + contactos[i]);
                    System.out.println();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No se han encontrado contactos.");
            }
        } else {
            System.out.println("No hay contactos.");
        }
    }

    //Método 7 Búsqueda Global
    public static void buscarGlobal (String[] contactos, int numContactos) {
        //Variables
        int count = 0;
        String busqueda;

        if (contactos[0] != null) {
            //Introduce dato
            System.out.print("Buscar: ");
            busqueda = pedirDato();
            System.out.println();

            System.out.println("Resultado:");
            System.out.println();

            //Bucle para encontrar dato
            for (int i = 0; i < numContactos; i++) {
                if (contactos[i].toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println(i + ". " + contactos[i]);
                    System.out.println();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No se han encontrado contactos.");
            }
        } else {
            System.out.println("No hay contactos.");
        }
    }

    //Método 8 Salir
    public static void salir () {
        System.out.println("Adiós.");
        System.exit(0);
    }

    //MAIN
    public static void main(String[] args) {
        //Bienvenida
        System.out.println();
        System.out.println("Bienvenido/a a la App de Contactos de Albert.");

        //Bucle App Contactos
        while (true) {
            menu();
            opcion(eleccion());
        }  
    }
}
