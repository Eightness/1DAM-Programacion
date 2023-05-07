import java.util.Scanner;

public class TienDAM {

    //Atributos
    static Scanner input = new Scanner(System.in);
    static Almacen almacen = new Almacen(3);
    static Pedido pedido;
    static boolean tiendam = true;
    static boolean submenu = true;

    //Métodos

    //-------------------------------------------------------------------------------

    //MAIN

    public static void main(String[] args) {
        //Cargar Almacén
        System.out.println();
        System.out.println("Primero, vamos a crear un almacén de prueba con 5 artículos.");
        almacen = cargarAlmacen();

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
    static Almacen cargarAlmacen() {
        almacen = new Almacen(3);
        almacen.añadirArticulo(crearArticulo());
        almacen.añadirArticulo(crearArticulo());
        almacen.añadirArticulo(crearArticulo());
        System.out.println();
        System.out.println("Almacén creado con éxito.");
        return almacen;
    }

    //Método para crear pedido
    static Pedido crearPedido() {
        //Vaciamos el buffer
        input.nextLine();
        //Preguntamos por el nombre
        System.out.println();
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = input.nextLine();
        //Preguntamos por el máximo número de artículos
        System.out.println();
        System.out.print("Introduce el número de artículos a comprar: ");
        int maxCarrito = input.nextInt();
        //Preguntamos por el porcentaje del descuento que se le quiere aplicar al pedido
        System.out.println();
        System.out.print("Introduce el porcentaje de descuento a aplicar (0 si no se quiere aplicar ningún descuento): ");
        double porcentDescuento = input.nextDouble();
        //Vaciamos el buffer
        input.nextLine();
        //Instanciamos objeto pedido con los datos del usuario
        Pedido pedido = new Pedido(nombre, maxCarrito, porcentDescuento);
        //Devolvemos el pedido instanciado
        return pedido;
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
        System.out.println("5. Modificar precio");
        System.out.println("6. Recibir");
        System.out.println("7. Devolver");
        System.out.println("8. Atrás");
        System.out.println();
        System.out.print("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el submenú Pedido
    static int submenuPedido() {
        System.out.println();
        System.out.println("1. Crear pedido");
        System.out.println("2. Añadir artículo");
        System.out.println("3. Quitar artículo");
        System.out.println("4. Modificar pedido");
        System.out.println("5. Ver pedido");
        System.out.println("6. Realizar pedido");
        System.out.println("7. Atrás");
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
            submenu = true;
            while(submenu) {
                switchSubmenuAlmacen(submenuAlmacen());
            }
            break;

            //Caso 2 Pedido
            case 2:
            System.out.println();
            System.out.println("Preparar un pedido.");
            submenu = true;
            while(submenu) {
                switchSubmenuPedido(submenuPedido());
            }
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
            //Mostramos almacén
            almacen.verAlmacen();
            break;

            //Caso 2 Buscar
            case 2:
            if (almacen.estaVacio()) {
                System.out.println();
                System.out.println("El almacén está vacío.");
            } else {
                //Vaciamos buffer
                input.nextLine();
                //Preguntamos por el nombre del artículo a buscar
                System.out.println();
                System.out.print("Buscar (nombre artículo): ");
                String buscar = input.nextLine();
                //Buscamos
                almacen.buscarArticulo(buscar);
            }
            break;

            //Caso 3 Añadir
            case 3:
            //Vaciamos buffer
            input.nextLine();
            almacen.añadirArticulo(crearArticulo());
            break;

            //Caso 4 Quitar
            case 4:
            //Mostramos almacén
            almacen.verAlmacen();
            if (!almacen.estaVacio()) {
                //Preguntamos por el artículo del almacén
                System.out.println();
                System.out.print("Selecciona un artículo de la lista para eliminarlo: ");
                int quitar = input.nextInt() - 1;
                almacen.quitarArticulo(quitar);
            }
            break;

            //Caso 5 Modificar precio
            case 5:
            //Mostramos almacén
            if (almacen.estaVacio()) {
                System.out.println();
                System.out.println("El almacén está vacío.");
            } else {
                almacen.verAlmacen();
                //Preguntamos por el artículo del almacén
                System.out.println();
                System.out.print("Selecciona un artículo de la lista a modificar precio: ");
                int modificar = input.nextInt() - 1;
                //Preguntamos por el nuevo precio
                System.out.println();
                System.out.print("Introduce el nuevo precio: ");
                double precio = input.nextDouble();
                //Modificamos el precio del artículo seleccionado
                almacen.modificarPrecio(modificar, precio);
            }
            break;

            //Caso 6 Recibir
            case 6:
            //Mostramos almacén
            if (almacen.estaVacio()) {
                System.out.println();
                System.out.println("El almacén está vacío.");
            } else {
                almacen.verAlmacen();
                //Preguntamos por el artículo del almacén
                System.out.println();
                System.out.print("Selecciona un artículo de la lista a recibir: ");
                int recibir = input.nextInt() - 1;
                //Preguntamos por la cantidad a recibir
                System.out.println();
                System.out.print("Introduce cantidad a recibir: ");
                int cantidad = input.nextInt();
                //Recibimos x cantidad del artículo seleccionado
                almacen.recibir(recibir, cantidad);
            }
            break;

            //Caso 7 Devolver
            case 7:
            if (almacen.estaVacio()) {
                System.out.println();
                System.out.println("El almacén está vacío.");
            } else {
                almacen.verAlmacen();
                //Preguntamos por el artículo del almacén
                System.out.println();
                System.out.print("Selecciona un artículo de la lista a devolver: ");
                int devolver = input.nextInt() - 1;
                //Preguntamos por la cantidad a devolver
                System.out.println();
                System.out.print("Introduce cantidad a devolver: ");
                int cantidad = input.nextInt();
                //Devolvemos x cantidad del artículo seleccionado
                almacen.devolver(devolver, cantidad);
            }
            break;

            //Caso 8 Atrás
            case 8:
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

            //System.out.println("1. Crear pedido");
            //System.out.println("2. Añadir artículo");
            //System.out.println("3. Quitar artículo");
            //System.out.println("4. Modificar pedido");
            //System.out.println("5. Ver pedido");
            //System.out.println("6. Realizar pedido");
            //System.out.println("7. Atrás");

            //Caso 1 Crear pedido
            case 1:
            //En caso de que ya haya un pedido en marcha
            if (pedido != null) {
                System.out.println();
                System.out.println("Hay un pedido en curso, ¿Quieres sobreescribirlo? (1 Sí, 2 No)");
                switch(input.nextInt()) {
                    //En caso de querer sobreescribir
                    case 1:
                    pedido = crearPedido();
                    break;
                    //En caso de no querer sobreescribir
                    case 2:
                    break;
                    //En caso de introducir una opción inválida (diferente a 1 o 2)
                    default:
                    System.out.println("Opción inválida.");
                    break;
                }
            } else {    //En caso de que sea un nuevo pedido
                pedido = crearPedido();
            }
            break;

            //Caso 2 Añadir artículo
            case 2: 
            //Mostramos almacén
            almacen.verAlmacen();
            //Seleccionamos artículo que deseamos añadir al pedido
            if (almacen.verAlmacen()) {
                System.out.println();
                System.out.print("Selecciona un artículo del almacén: ");
                Articulo articulo = almacen.getArticulos()[input.nextInt() - 1];
                //Seleccionamos cantidad que deseamos del artículo seleccionado
                System.out.println();
                System.out.print("Introduce cantidad del artículo: ");
                int cantidad = input.nextInt();
                //Añadimos el artículo y la cantidad al pedido
                pedido.añadirArticulo(articulo, cantidad);
            }
            break;

            //Caso 3 Quitar artículo
            case 3:
            //Mostramos almacén
            almacen.verAlmacen();
            //Seleccionamos artículo que deseamos quitar del pedido
            System.out.println();
            System.out.print("Selecciona un artículo del almacén: ");
            int quitar = input.nextInt();
            //Quitamos el artículo (y cantidad) del pedido
            pedido.quitarArticulo(quitar);
            break;

            //Caso 4 Modificar
            case 4:
            break;

            //Caso 5 Ver pedido
            case 5:
            pedido.verPedido();
            break;

            //Caso 6 Realizar pedido
            case 6:
            pedido.realizarPedido();
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
    
}
