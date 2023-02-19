import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        /* Programa que pida al usaurio tres valores numéricos que
        indican la hora de un reloj digital (horas, minutos y segundos)
        y muestre por pantalla la hora que era 1 segundo antes.
        */

        // Ejemplo: 
        //input: 13, 25 y 30 / 0, 0, 0
        //output: 13, 25, 29 / 23, 59, 59

        Scanner input = new Scanner(System.in);

        int horas, minutos, segundos;
    
        System.out.print("Horas: ");
        horas = input.nextInt();
        System.out.print("Minutos: ");
        minutos = input.nextInt();
        System.out.print("Segundos: ");
        segundos = input.nextInt();

        segundos -= 1;

        if (segundos < 0) {
            segundos = 59;
            minutos -= 1;
        }
        
        if (minutos < 0) {
            minutos = 59;
            horas -= 1;
        }
        
        if (horas < 0) {
            horas = 23;
        }

        System.out.println("Un segundo antes, eran las " + horas + ":" + minutos + ":" + segundos);

    }
    
}
