import java.util.Scanner;
import java.util.InputMismatchException;

public class TienDAM {

    //Atributos
    static Scanner input = new Scanner(System.in);
    static Almacen almacen = new Almacen();
    static Pedido pedido = null;
    static boolean tiendam = true;
    static boolean submenu = true;

    //---------------------------------------------------------------------

    //Métodos

    //---------------------------------------------------------------------

    //MAIN

    public static void main(String[] args) {
        
        //Bienvenida
        System.out.println();
        System.out.println("¡Bienvenido a TienDAM! - Aplicación desarrollada por Albert.");

        //Bucle principal
        while(tiendam) {
            switchMenu(menu());
        }
    }

    //---------------------------------------------------------------------
    
    //INSTANCIAS

    //Método para crear un artículo
    static Articulo crearArticulo() {
        Articulo articulo = null;
        //Obtenemos el nombre
        String nombre = obtenerStringValido("Dime el nombre del artículo: ");
        //Obtenemos el precio
        double precio = obtenerDoubleValido("Dime el precio del artículo: ");
        //Obtenemos la opción del tipo de IVA
        int opcion = obtenerEnteroValido("Dime el tipo de IVA (1 Normal, 2 Reducido, 3 Superreducido): ");
        Articulo.IVA tipoIVA = Articulo.IVA.NORMAL;
        switch(opcion) {
            //Caso IVA Normal
            case 1:
                tipoIVA = Articulo.IVA.NORMAL;
            break;
            //Caso IVA Reducido
            case 2:
                tipoIVA = Articulo.IVA.REDUCIDO;
            break;
            //Caso IVA Superreducido
            case 3:
                tipoIVA = Articulo.IVA.SUPERREDUCIDO;
            break;
            //Caso input inválido, se define el IVA Normal por defecto.
            default:
                System.out.println();
                System.out.println("Opción inválida, se queda el IVA normal.");
            break;
        }
        //Obtenemos la cantidad
        int cantidad = obtenerEnteroValido("Dime la cantidad: ");
        try {
            //Creamos el artículo con los parámetros introducidos por el usuario
            articulo = new Articulo(nombre, precio, tipoIVA, cantidad);
        } catch (Exception e) {
            System.out.println();
            System.out.println("El artículo no se ha podido crear.");
        }
        //Devolvemos el artículo
        return articulo;
    }

    //Método para crear un pedido
    static Pedido crearPedido() {
        //Obtenemos el nombre
        String nombre = obtenerStringValido("Introduce el nombre del cliente: ");
        //Obtenemos el porcentaje del descuento que se le quiere aplicar al pedido
        double porcentDescuento = obtenerEnteroValido("Introduce el porcentaje de descuento a aplicar (0 si no se quiere aplicar ningún descuento): ");
        //Instanciamos objeto pedido con los datos del usuario
        Pedido p = new Pedido(nombre, porcentDescuento);
        //Devolvemos el pedido instanciado
        return p;
    }

    //---------------------------------------------------------------------

    //INPUT

    //Método para pedir un entero al usuario
    static int obtenerEnteroValido(String mensaje) {
        //Declarando e inicializando variables
        int res = 0;
        boolean check = false;
        //do-while para preguntar al usuario hasta que sea correcto
        do {
            System.out.println();
            System.out.print(mensaje);
            //Try catch
            try {
                res = input.nextInt();
                input.nextLine();
                check = true;            
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Tipo de dato introducido incorrecto.");
                input.nextLine();
            }
        } while (!check);
        //Devuelve el input del usuario
        return res;
    }

    //Método para pedir una String al usuario
    static String obtenerStringValido(String mensaje) {
        //Declarando e inicializando variables
        String res = "";
        boolean check = false;
        //do-while para preguntar al usuario hasta que sea correcto
        do {
            System.out.println();
            System.out.print(mensaje);
            //Try catch
            try {
                res = input.nextLine();
                check = true;            
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Tipo de dato introducido incorrecto.");
            }
        } while (!check);
        //Devuelve el input del usuario
        return res;
    }

    //Método para pedir un double al usuario
    static double obtenerDoubleValido(String mensaje) {
        //Declarando e inicializando variables
        double res = 0;
        boolean check = false;
        //do-while para preguntar al usuario hasta que sea correcto
        do {
            System.out.println();
            System.out.print(mensaje);
            //Try catch
            try {
                res = input.nextDouble();
                input.nextLine();
                check = true;            
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Tipo de dato introducido incorrecto.");
                input.nextLine();
            }
        } while (!check);
        //Devuelve el input del usuario
        return res;
    }

    //---------------------------------------------------------------------

    //MENÚS

    //Método parar mostrar el menú principal y preguntarle al usuario la opción elegida
    static int menu() {
        System.out.println();
        System.out.println("1. Almacén.");
        System.out.println("2. Pedido.");
        System.out.println("3. Salir.");
        int opcion = obtenerEnteroValido("Elige una opción: ");
        return opcion;
    }

    //Método para mostrar el submenú Almacén y preguntarle al usuario la opción elegida
    static int menuAlmacen() {
        System.out.println();
        System.out.println("1. Ver almacén.");
        System.out.println("2. Buscar artículo.");
        System.out.println("3. Añadir artículo.");
        System.out.println("4. Quitar artículo.");
        System.out.println("5. Modificar precio.");
        System.out.println("6. Recibir.");
        System.out.println("7. Devolver.");
        System.out.println("8. Atrás.");
        int opcion = obtenerEnteroValido("Elige una opción: ");
        return opcion;
    }

    //Método para mostrar el submenú Pedido y preguntarle al usuario la opción elegida
    static int menuPedido() {
        System.out.println();
        System.out.println("1. Crear pedido.");
        System.out.println("2. Añadir artículo.");
        System.out.println("3. Quitar artículo.");
        System.out.println("4. Modificar artículo.");
        System.out.println("5. Ver pedido.");
        System.out.println("6. Realizar pedido.");
        System.out.println("7. Atrás.");
        int opcion = obtenerEnteroValido("Elige una opción: ");
        return opcion;
    }

    //---------------------------------------------------------------------

    //SWITCHES

    //Método para el switch del menú principal
    static void switchMenu(int opcion) {
        switch(opcion) {
            //Caso 1 Almacén
            case 1:
                submenu = true;
                while (submenu) {
                    switchAlmacen(menuAlmacen());
                }
            break;

            //Caso 2 Pedido
            case 2:
                submenu = true;
                while (submenu) {
                    switchPedido(menuPedido());
                }
            break;

            //Caso 3 Salir
            case 3:
                System.out.println();
                System.out.println("¡Gracias por usar TienDAM!");
                System.out.println();
                tiendam = false;
            break;

            //Por defecto
            default:
                System.out.println();
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Método para el switch del submenú Almacén
    static void switchAlmacen(int opcion) {
        switch(opcion) {
            //Ver
            case 1:
                almacen.verAlmacen();
            break;

            //Buscar
            case 2:
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                String busqueda = obtenerStringValido("Introduce búsqueda: ");
                almacen.buscarArticulo(busqueda);
            break;

            //Añadir
            case 3:
                try {
                    almacen.añadirArticulo(crearArticulo());
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;
            
            //Quitar
            case 4:
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                almacen.verAlmacen();
                int quitar = obtenerEnteroValido("Selecciona artículo: ");
                try {
                    almacen.quitarArticulo(quitar - 1);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Modificar precio
            case 5:
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                almacen.verAlmacen();
                int modificar = obtenerEnteroValido("Selecciona artículo: ");
                double nuevoPrecio = obtenerDoubleValido("Introduce nuevo precio: ");
                try {
                    almacen.modificarPrecio(modificar - 1, nuevoPrecio);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Recibir
            case 6:
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                almacen.verAlmacen();
                int recibir = obtenerEnteroValido("Selecciona artículo: ");
                int cantidadRecibir = obtenerEnteroValido("Introducir cantidad a recibir: ");
                try {
                    almacen.recibir(recibir - 1, cantidadRecibir);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Devolver
            case 7:
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                almacen.verAlmacen();
                int devolver = obtenerEnteroValido("Selecciona artículo: ");
                int cantidadDevolver = obtenerEnteroValido("Introducir cantidad a devolver: ");
                try {
                    almacen.devolver(devolver - 1, cantidadDevolver);
                } catch (Exception e)  {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Atrás
            case 8:
                submenu = false;
            break;
            
            //Por defecto
            default:
                System.out.println();
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Método para el switch del submenú Pedido
    static void switchPedido(int opcion) {
        switch(opcion) {
            //Crear
            case 1: 
                if (pedido == null) {
                    pedido = crearPedido();
                } else {
                    int eleccion = obtenerEnteroValido("Ya hay un pedido en curso, ¿quieres reemplazarlo? (1 Sí, 2 No) ");
                    switch(eleccion) {
                        //Sí
                        case 1:
                            devolverArticulosPedido();
                            pedido = crearPedido();
                            System.out.println();
                            System.out.println("Pedido creado con éxito.");
                        break;
                        //No
                        case 2:
                            //No pasa nada.
                        break;
                        //Por defecto
                        default:
                            System.out.println();
                            System.out.println("Opción inválida.");
                        break;
                    }
                }
            break;

            //Añadir artículo
            case 2:
                if (pedido == null) {
                    System.out.println();
                    System.out.println("No hay ningún pedido en marcha.");
                    break;
                }
                if (almacen.getArticulos().isEmpty()) {
                    System.out.println();
                    System.out.println("El almacén está vacío.");
                    break;
                }
                almacen.verAlmacen();
                int añadir = obtenerEnteroValido("Selecciona un artículo: ");
                int cantidadInicial = 0;
                try {
                    cantidadInicial = almacen.getArticulo(añadir - 1).getCantidad();
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
                int cantidad = 0;
                do {
                    cantidad = obtenerEnteroValido("Introduce una cantidad: ");
                    if (cantidad > cantidadInicial) {
                        System.out.println();
                        System.out.println("No se pueden añadir al carrito más unidades de las que hay disponibles en el almacén.");
                    }
                } while (cantidad > cantidadInicial);
                Articulo a = null;
                try {
                    a = almacen.getArticulo(añadir - 1);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
                try {
                    pedido.añadirArticulo(a, cantidad);
                    almacen.devolver(añadir - 1, cantidad);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Quitar artículo
            case 3:
                if (pedido == null) {
                    System.out.println();
                    System.out.println("No hay ningún pedido en marcha.");
                    break;
                }
                if (pedido.getCarrito().isEmpty()) {
                    System.out.println();
                    System.out.println("El carrito está vacío.");
                    break;
                }
                pedido.verCarrito();
                int quitar = obtenerEnteroValido("Selecciona un artículo: ");
                int indexAlmacen = almacen.getIndex(pedido.getCarrito().get(quitar - 1).getNombre());
                int recibirCantidad = pedido.getCantidades().get(quitar - 1);
                try {
                    pedido.quitarArticulo(quitar - 1);
                    almacen.recibir(indexAlmacen, recibirCantidad);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;
            
            //Modificar artículo
            case 4:
                if (pedido == null) {
                    System.out.println();
                    System.out.println("No hay ningún pedido en marcha.");
                    break;
                }
                if (pedido.getCarrito().isEmpty()) {
                    System.out.println();
                    System.out.println("El carrito está vacío.");
                    break;
                }
                pedido.verCarrito();
                int modificar = obtenerEnteroValido("Selecciona un artículo: ");
                int modCantidad = obtenerEnteroValido("Introduce nueva cantidad: ");
                int indexAlmacenMod = almacen.getIndex(pedido.getCarrito().get(modificar - 1).getNombre());
                int recibirCantidadMod = pedido.getCantidades().get(modificar - 1);
                try {
                    almacen.recibir(indexAlmacenMod, recibirCantidadMod);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
                try {
                    pedido.modificarCarrito(modificar - 1, modCantidad);
                    almacen.devolver(indexAlmacenMod, modCantidad);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                }
            break;

            //Ver
            case 5:
                if (pedido == null) {
                    System.out.println();
                    System.out.println("No hay ningún pedido en marcha.");
                    break;
                }
                pedido.verPedido();
            break;

            //Realizar
            case 6:
                if (pedido == null) {
                    System.out.println();
                    System.out.println("No hay ningún pedido en marcha.");
                    break;
                }
                if (pedido.getCarrito().isEmpty()) {
                    System.out.println();
                    System.out.println("El carrito está vacío.");
                    break;
                }
                int eleccion = obtenerEnteroValido("¿Estás seguro de querer realizar el pedido? (1 Sí, 2 No) ");
                switch(eleccion) {
                    //Sí
                    case 1:
                        pedido = pedido.realizarPedido();
                    break;
                    //No
                    case 2:
                        //No pasa nada.
                    break;
                    //Por defecto
                    default:
                        System.out.println();
                        System.out.println("Opción inválida.");
                    break;
                }
            break;

            //Atrás
            case 7:
                submenu = false;
            break;
            
            //Por defecto
            default:
                System.out.println();
                System.out.println("Opción inválida.");
            break;
        }
    }

    //Método específico para devolver todos los artículos de un pedido al almacén (en caso de anular pedido)
    static void devolverArticulosPedido() {
        for (int i = 0; i < pedido.getCarrito().size(); i++) {
            int almacenIndex = almacen.getIndex(pedido.getCarrito().get(i).getNombre());
            try {
                almacen.recibir(almacenIndex, pedido.getCantidades().get(i));
            } catch (Exception e) {
                System.out.println();
                System.out.println(e.getMessage());
            }
        }
    }

}
