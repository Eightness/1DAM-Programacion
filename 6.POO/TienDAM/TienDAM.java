import java.util.Scanner;

public class TienDAM {

    //Atributos
    static Scanner input = new Scanner(System.in);
    static Almacen almacen = new Almacen(3);
    static Pedido pedido;
    static boolean tiendam = true;

    //Métodos

    //-------------------------------------------------------------------------------

    //MAIN

    public static void main(String[] args) {
        //Cargar Almacén
        // System.out.println();
        // System.out.println("Primero, vamos a crear un almacén de prueba con 5 artículos.");
        // cargarAlmacen();

        //Bienvenida
        System.out.println();
        System.out.println("¡Bienvenido a TienDAM!");

        //Bucle principal
        while(tiendam) {
            switchMenu(menu());
        }
    }

    //-------------------------------------------------------------------------------

    //INSTANCIAS

    //Método para crear artículo
    static Articulo crearArticulo() {
        //Preguntamos por el nombre
        System.out.println();
        System.out.print("Dime el nombre del artículo: ");
        String nombre = input.nextLine();
        //Preguntamos por el precio
        System.out.println();
        System.out.print("Dime el precio base del artículo: ");
        double precio = input.nextDouble();
        //Preguntamos por el tipo de IVA
        System.out.println();
        System.out.print("Dime el tipo de IVA (1 Normal, 2 Reducido, 3 Superreducido): ");
        int opcion = input.nextInt();
        Articulo.IVA tipoIVA = Articulo.IVA.NORMAL;
        switch(opcion) {
            case 1:
            tipoIVA = Articulo.IVA.NORMAL;
            break;

            case 2:
            tipoIVA = Articulo.IVA.REDUCIDO;
            break;
            
            case 3:
            tipoIVA = Articulo.IVA.SUPERREDUCIDO;
            break;

            default:
            System.out.println("Opción inválida, se queda el IVA normal.");
            break;
        }
        //Preguntamos por la cantidad
        System.out.println();
        System.out.print("Dime la cantidad inicial: ");
        int cantidad = input.nextInt();

        //Vacíamos el buffer
        input.nextLine();

        //Creamos el artículo con los parámetros introducidos por el usuario
        Articulo a = new Articulo(nombre, precio, tipoIVA, cantidad);

        //Devolvemos el artículo
        return a;
    }

    //Método para crear lista de artículos
    static Articulo[] crearArticulos() {
        //Declaramos el array articulos
        Articulo[] articulos = new Articulo[3];

        //Iteramos por el array añadiendo articulos con el método crearArticulo
        for (int i = 0; i < articulos.length; i++) {
            System.out.println();
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.println("-----------------------");
            articulos[i] = crearArticulo();
        }

        //Devolvemos el array articulos
        return articulos;
    }

    //Método para cargar almacén
    static void cargarAlmacen() {
        almacen = new Almacen(3, crearArticulos());

        System.out.println();
        System.out.println("Almacén creado con éxito.");
    }

    //Método para crear pedido
    static void crearPedido() {

    }

    //-------------------------------------------------------------------------------

    //MENÚS

    //Método para mostrar el menú principal
    static int menu() {
        System.out.println();
        System.out.println("1. Almacen");
        System.out.println("2. Pedido");
        System.out.println("3. Salir");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el submenú Almacén
    static int submenuAlmacen() {
        System.out.println();
        System.out.println("1. Ver");
        System.out.println("2. Buscar");
        System.out.println("3. Añadir");
        System.out.println("4. Quitar");
        System.out.println("5. Recibir");
        System.out.println("6. Devolver");
        System.out.println("7. Atrás");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el submenú Pedido
    static int submenuPedido() {
        System.out.println();
        System.out.println("1. Crear pedido");
        System.out.println("2. Añadir");
        System.out.println("3. Quitar");
        System.out.println("4. Modificar");
        System.out.println("5. Ver pedido");
        System.out.println("6. Atrás");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //-------------------------------------------------------------------------------

    //SWITCHES

    //Método switch menú principal
    static void switchMenu(int opcion) {
        switch(opcion) {
            //Caso 1 Almacen
            case 1:
            System.out.println();
            System.out.println("Has accedido al almacén.");
            switchSubmenuAlmacen(submenuAlmacen());
            break;

            //Caso 2 Pedido
            case 2:
            System.out.println();
            System.out.println("Preparar un pedido.");
            switchSubmenuPedido(submenuPedido());
            break;

            //Caso 3 Salir
            case 3:
            System.out.println();
            System.out.println("¡Gracias por usar TienDAM!");
            System.out.println();
            tiendam = false;
            break;

            default:
            System.out.println("Opción inválida.");
            break;
        }
    }    

    //Método switch para submenú Almacén
    static void switchSubmenuAlmacen(int opcion) {
        switch(opcion) {
            //Caso 1 Ver
            case 1:
            almacen.verAlmacen();
            break;

            //Caso 2 Buscar
            case 2:
            input.nextLine();
            System.out.println();
            System.out.println("Buscar (nombre artículo): ");
            String buscar = input.nextLine();
            almacen.buscarArticulo(buscar);
            break;

            //Caso 3 Añadir
            case 3:
            almacen.añadirArticulo(crearArticulo());
            break;

            //Caso 4 Quitar
            case 4:
            if (almacen.verAlmacen()) {
                almacen.verAlmacen();
                System.out.println();
                System.out.println("Selecciona un artículo de la lista para eliminarlo: ");
                int quitar = input.nextInt();
                almacen.quitarArticulo(quitar);
                input.nextLine();
            }
            break;

            //Caso 5 Recibir
            case 5:
            break;

            //Caso 6 Devolver
            case 6:
            break;

            //Caso 7 Atrás
            case 7:
            break;

            default:
            System.out.println("Opción inválida.");
            break;
        }
    }

    //Método switch para submenú Pedido
    static void switchSubmenuPedido(int opcion) {
        switch(opcion) {
            //Caso 1 Crear pedido
            case 1:
            crearPedido();
            break;

            //Caso 2 Añadir artículo
            case 2:
            break;

            //Caso 3 Quitar artículo
            case 3:
            break;

            //Caso 4 Modificar
            case 4:
            break;

            //Caso 5 Ver pedido
            case 5:
            pedido.verPedido();
            break;

            //Caso 6 Atrás
            case 6:
            break;

            default:
            System.out.println("Opción inválida.");
            break;
        }
    }
    
}
