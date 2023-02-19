import java.util.Scanner;

public class EjercicioL {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, segundos;       //Declaro variables para las horas, minutos, segndos que va a introducir el usuario.
        int segundosTotales;                //Declaro variable para guardar la hora que ha introducido el usuario convertida a segundos totales.
        int x;                              //Valor en segundos que el programa sumará a la hora introducida.
        int sumaSegundos;                   //Valor en segundos de la suma entre los segundos totales y los segundos que el programa añadirá (x).
        int horas2, minutos2, segundos2;    //Declaro variables que me servirán como resultado e imprimirlas en pantalla.
        
        //Pedimos al usuario que introduzca horas, minutos y segundos.
        System.out.print("Introduce horas: ");
        horas = input.nextInt();
        System.out.print("Introduce minutos: ");
        minutos = input.nextInt();
        System.out.print("Introduce segundos: ");
        segundos = input.nextInt();

        //Si el usuario introduce una hora no válida, el programa no se inicia.
        if (horas > 24 || horas < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0)
            System.out.println("La hora introducida no es válida.");

            else {
                //Le pedimos al usuario que introduzca los segundos que quiere que el programa sume.
                System.out.println("Introduce los segundos que quieres sumar: ");
                x = input.nextInt();

                //Convertimos las horas y minutos que ha introducido el usuario a segundos.
                horas *= 3600;
                minutos *= 60;
        
                segundosTotales = horas + minutos + segundos;   //Obtenemos la hora introducida en segundos.
                sumaSegundos = segundosTotales + x;             //Sumamos los segundos.

                //Volvemos a convertir el total de segundos a horas, minutos y segundos.
                segundos2 = sumaSegundos % 60;
                minutos2 = sumaSegundos / 60;
                horas2 = minutos2 / 60;
                minutos2 %= 60;

                //Imprimimos la suma realizada por el programa.
                System.out.println("La hora introducida, pasados " + x + " segundos, será: " + horas2 + ":" + minutos2 + ":" + segundos2);

                /* El programa funciona, pero, las horas no tienen "límite",
                pueden ser más de 24 (las que marca un reloj).
                ¿Hay alguna forma de "capar" las horas a 24? */
            }
    }
}
