import java.util.Scanner;

public class Ejercicio3Albert 
{
    public static void main(String[]args)   
    {
        double precio;
        double descuento;
        double precioMenosDescuento;
        double iva;
        double precioMasIVA;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introduce el precio del producto 1: ");
        precio = lector.nextDouble();
        System.out.print("Introduce el precio del producto 2: ");
        precio += lector.nextDouble();
        System.out.print("Introduce el precio del producto 3: ");
        precio += lector.nextDouble();
        System.out.print("Introduce el precio del producto 4: ");
        precio += lector.nextDouble();
        System.out.print("Introduce el precio del producto 5: ");
        precio += lector.nextDouble();
        //con el operador de asignación += vamos sumando automáticamente los precios que introduce el usuario.

        descuento = precio * 0.10;                  //descuento que se aplica a la suma total.
        precioMenosDescuento = precio - descuento;  //Suma total de los precios con el descuento aplicado.
        iva = precioMenosDescuento * 0.21;          //IVA que se aplica a la suma total de los precios con el descuento aplicado.
        precioMasIVA = precioMenosDescuento + iva;  //Suma total de los precios con el descuento e IVA aplicados.
       
        System.out.println("La suma total de los cinco precios introducidos es: " + precio);
        System.out.println("El valor en euros del descuento a aplicar es: " + descuento);
        System.out.println("La suma total tras el descuento es: " + precioMenosDescuento);
        System.out.println("El valor en euros del IVA a aplicar es: " + iva);
        System.out.println("El precio final tras aplicar el IVA es: " + precioMasIVA);
    }
}