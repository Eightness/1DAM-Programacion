import java.util.Scanner;

public class TienDAM {

    //Atributos
    static Scanner input = new Scanner(System.in);
    static Almacen almacen = new Almacen(50);
    static Pedido pedido;
    static boolean submenu;

    //Métodos
    //Método para cargar lista de artículos
    static Articulo[] cargarArticulos() {
        //Declaramos el array articulos
        Articulo[] articulos = new Articulo[5];

        //Iteramos por el array añadiendo articulos con el método crearArticulo
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = crearArticulo();
        }

        //Devolvemos el array articulos
        return articulos;
    }

    //Método para cargar almacén
    

    //Método para crear pedido

    
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

        //Creamos el artículo con los parámetros introducidos por el usuario
        Articulo a = new Articulo(nombre, precio, tipoIVA, cantidad);

        //Devolvemos el artículo
        return a;
    }


    //Método para mostrar el menú principal
    static int menu() {
        System.out.println();
        System.out.println("1 Almacen");
        System.out.println("2 Pedido");
        System.out.println("3 Salir");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el submenú Almacén
    static int submenuAlmacen() {
        System.out.println();
        System.out.println("1 Ver");
        System.out.println("2 Buscar");
        System.out.println("3 Añadir");
        System.out.println("4 Quitar");
        System.out.println("5 Recibir");
        System.out.println("6 Devolver");
        System.out.println("7 Atrás");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el submenú Pedido
    static int submenuPedido() {
        System.out.println();
        System.out.println("1 Crear pedido");
        System.out.println("2 Añadir");
        System.out.println("3 Quitar");
        System.out.println("4 Modificar");
        System.out.println("5 Ver ticket");
        System.out.println("6 Atrás");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método switch menú principal
    static void switchMenu(int opcion) {
        switch(opcion) {
            //Caso 1 Almacen
            case 1:
            System.out.println();
            System.out.println("Has accedido al almacén.");
            break;

            //Caso 2 Pedido
            case 2:
            System.out.println();
            System.out.println("Preparar un pedido.");
            break;

            //Caso 3 Salir
            case 3:
            System.out.println();
            System.out.println("¡Gracias por usar TienDAM!");
            System.exit(0);
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
            break;

            //Caso 2 Buscar
            case 2:
            break;

            //Caso 3 Añadir
            case 3:
            break;

            //Caso 4 Quitar
            case 4:
            break;

            //Caso 5 Recibir
            case 5:
            break;

            //Caso 6 Devolver
            case 6:
            break;

            //Caso 7 Atrás
            case 7:
            submenu = false;
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

            //Caso 5 Ver ticket
            case 5:
            break;

            //Caso 6 Atrás
            case 6:
            submenu = false;
            break;

            default:
            System.out.println("Opción inválida.");
            break;
        }
    }
    
}
