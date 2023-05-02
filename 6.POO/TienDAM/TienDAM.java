import java.util.Scanner;

public class TienDAM {

    //Atributos
    static Scanner input = new Scanner(System.in);
    static Almacen almacen;
    static Pedido pedido;

    //Métodos
    //Método para elegir una opción
    static int opcion() {
        System.out.println();
        System.out.println("Elige una opción: ");
        return input.nextInt();
    }

    //Método para mostrar el menú principal
    static void menu() {
        System.out.println();
        System.out.println("1 Almacen");
        System.out.println("2 Pedido");
        System.out.println("3 Salir");
        System.out.println();
    }

    //Método para mostrar el submenú Almacén
    static void submenuAlmacen() {
        System.out.println();
        System.out.println("1 Ver");
        System.out.println("2 Buscar");
        System.out.println("3 Añadir");
        System.out.println("4 Quitar");
        System.out.println("5 Recibir");
        System.out.println("6 Devolver");
        System.out.println("7 Atrás");
        System.out.println();
    }

    //Método para mostrar el submenú Pedido
    static void submenuPedido() {
        System.out.println();
        System.out.println("1 Crear pedido");
        System.out.println("2 Añadir");
        System.out.println("3 Quitar");
        System.out.println("4 Modificar");
        System.out.println("5 Ver ticket");
        System.out.println("6 Atrás");
        System.out.println();
    }
    
}
