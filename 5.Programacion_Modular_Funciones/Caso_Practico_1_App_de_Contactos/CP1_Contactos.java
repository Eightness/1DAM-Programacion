package ud5casospracticos;

import java.util.Arrays;
import java.util.Scanner;

public class CP1_Contactos {

    // VARIABLES GLOBALES
    public static int maxC = 100; // Máximo nº de contactos
    public static int numC = 0;   // Nº de contactos registrados

    // MAIN PRINCIPAL
    public static void main(String[] args) {

        // Vectores con información de contactos
        String[] vn = new String[maxC]; // vector de nombres
        String[] vt = new String[maxC]; // vector de teléfonos
        String[] vc = new String[maxC]; // vector de correos

        // Variables auxiliares
        int opcion;     // opcion del menú
        String n, c, t; // nombre, correo y teléfono
        String buscar;  // término a buscar
        int pos;        // posicion
        int[] vpos;     // vector de posiciones

        // Bucle principal
        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    // Ver contactos
                    verContactosTodos(vn, vt, vc);
                    break;
                case 2:
                    // Añadir contacto
                    System.out.print("¿Nombre? ");
                    n = pedirString();
                    System.out.print("¿Teléfono? ");
                    t = pedirString();
                    System.out.print("¿Correo? ");
                    c = pedirString();
                    agregarContacto(vn, vt, vc, n, t, c);
                    break;
                case 3:
                    // Eliminar contacto
                    System.out.print("¿ID de contacto a eliminar? ");
                    pos = pedirIntEnRango(0, numC-1);
                    eliminarContacto(vn, vt, vc, pos);
                    break;
                case 4:
                    // Buscar por nombre
                    System.out.print("¿Nombre? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vn, buscar);
                    verContactosVector(vn, vt, vc, vpos);
                    break;
                case 5:
                    // Buscar por teléfono
                    System.out.print("¿Teléfono? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vt, buscar);
                    verContactosVector(vn, vt, vc, vpos);
                    break;
                case 6:
                    // Buscar por correo
                    System.out.print("¿Correo? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vc, buscar);
                    verContactosVector(vn, vt, vc, vpos);
                    break;
                case 7:
                    // Búsqueda global
                    System.out.print("¿Término a buscar globalmente? ");
                    buscar = pedirString();
                    vpos = buscarGlobal(vn, vt, vc, buscar);
                    verContactosVector(vn, vt, vc, vpos);
                    break;
                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

            System.out.println("");
        } while (opcion != 8);
    }

    /**
     * FUNCIONES DEL MENÚ Y PEDIR DATOS AL USUARIO
     */
    
    // Muestra el menú y devuelve la opción elegida por el usuario
    public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.print("¿Opción? ");
        
        int opcion = pedirIntEnRango(1, 8);

        return opcion;
    }

    // Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }

    // Pide al usuario un texto y lo devuelve
    public static String pedirString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * FUNCIONES DE MOSTRAR CONTACTOS
     */

    // Muestra la información solo del contacto 'pos' (índice de los vectores) 
    public static void verContactoPos(String[] vn, String[] vt, String[] vc, int pos) {
        System.out.println(pos + ". " + vn[pos] + " - " + vt[pos] + " - " + vc[pos] );
    }
    
    // Muestra la información de todos los contactos
    public static void verContactosTodos(String[] vn, String[] vt, String[] vc) {
        for (int i = 0; i < numC; i++) {
            verContactoPos(vn, vt, vc, i);
        }
    }
    
    // Muestra la información de los contactos indicados en 'vpos' (vector de posiciones)
    public static void verContactosVector(String[] vn, String[] vt, String[] vc, int[] vpos) {
        for (int i = 0; i < vpos.length; i++) {
            verContactoPos(vn, vt, vc, vpos[i]);
        }
    }

    /**
     * FUNCIONES DE AGREGAR Y ELIMINAR CONTACTOS
     */
    
    // Añade a los vectores la información de un contacto nuevo (n, t, c)
    public static void agregarContacto(String[] vn, String[] vt, String[] vc, String n, String t, String c) {
        if (numC < maxC) {
            vn[numC] = n;
            vt[numC] = t;
            vc[numC] = c;
            numC++;
        } else {
            System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
        }
    }

    // Elimina de los vectores el contacto en la posición 'pos'
    public static void eliminarContacto(String[] vn, String[] vt, String[] vc, int pos) {
        if (pos >= 0 && pos < numC) {
            eliminarPosDeVector(vn, pos);
            eliminarPosDeVector(vt, pos);
            eliminarPosDeVector(vc, pos);
            numC--;
        } else {
            System.out.println("ERROR: No se puede eliminar contacto. Posición fuera de rango.");
        }
    }

    // Elimina la posición 'pos' de 'vector' (mueve todos los elementos >pos una posición a la izquierda)
    public static void eliminarPosDeVector(String[] vector, int pos) {
        for (int i = pos; i < (numC-1); i++) {
            vector[i] = vector[i+1];
        }
    }

    /**
     * FUNCIONES DE BUSCAR CONTACTOS
     */
    
    // Busca en 'vector' los String que contienen 'buscar'
    // Devuelve un vector con las posiciones en las que se ha encontrado
    public static int[] buscarContactos(String[] vector, String buscar) {
        
        // Vector donde guardaremos las posiciones encontradas
        int[] vpos = new int[maxC];
        // Nº de posiciones encontradas
        int npos = 0;
        
        // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
        // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
        for (int i = 0; i < numC; i++) {
            if (vector[i].toUpperCase().contains(buscar.toUpperCase())) {
                vpos[npos] = i;
                npos++;
            }
        }
        
        // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
        vpos = Arrays.copyOf(vpos, npos);
        
        return vpos;
    }

    // Busca en 'vn', 'vt' y 'vc' los String que contienen 'buscar'
    // Devuelve las posiciones en las que se ha encontrado
    public static int[] buscarGlobal(String[] vn, String[] vt, String[] vc, String buscar) {
        
        // NOTA: Sería más modular si reutilizamos buscarContactos(), pero
        // tendríamos 3 vectores de posiciones con números repetidos. Habría
        // que unirlos en un solo vector, ordenarlo y eliminar repetidos :S
        // Se puede hacer usando una colección Set, pero aún no lo hemos visto.
        
        //int[] vposn = buscarContactos(vn, buscar);
        //int[] vpost = buscarContactos(vt, buscar);
        //int[] vposc = buscarContactos(vc, buscar);
        
        // Vector donde guardaremos las posiciones encontradas
        int[] vpos = new int[maxC];
        // Nº de posiciones encontradas
        int npos = 0;
        
        // Recorremos los vectores buscando el texto 'buscar' en sus posiciones
        // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
        for (int i = 0; i < numC; i++) {
            // Comprobamos
            boolean encontradoN = vn[i].toUpperCase().contains(buscar.toUpperCase());
            boolean encontradoT = vt[i].toUpperCase().contains(buscar.toUpperCase());
            boolean encontradoC = vc[i].toUpperCase().contains(buscar.toUpperCase());
            if (encontradoN || encontradoT || encontradoC) {
                vpos[npos] = i;
                npos++;
            }
        }
        
        // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
        vpos = Arrays.copyOf(vpos, npos);
        return vpos;
        
    }

}
