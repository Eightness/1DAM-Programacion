//Albert Lozano Blasco

import java.util.Scanner;

public class ProgramaPersona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.print("Introduce nombre de la primera persona: ");
        persona1.nombre = input.nextLine();
        System.out.print("Introduce los apellidos de la primera persona: ");
        persona1.apellidos = input.nextLine();
        System.out.print("Introduce el DNI de la primera persona: ");
        persona1.dni = input.nextLine();
        System.out.print("Introduce la edad de la primera persona: ");
        persona1.edad = input.nextInt();

        input.nextLine();

        System.out.print("Introduce nombre de la segunda persona: ");
        persona2.nombre = input.nextLine();
        System.out.print("Introduce los apellidos de la segunda persona: ");
        persona2.apellidos = input.nextLine();
        System.out.print("Introduce el DNI de la segunda persona: ");
        persona2.dni = input.nextLine();
        System.out.print("Introduce la edad de la segunda persona: ");
        persona2.edad = input.nextInt();

        if (persona1.edad >= 18) {
            System.out.println(persona1.nombre + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad.");
        } else {
            System.out.println(persona1.nombre + persona1.apellidos + " con DNI " + persona1.dni + " no es mayor de edad.");
        }

        if (persona2.edad >= 18) {
            System.out.println(persona2.nombre + persona2.apellidos + " con DNI " + persona2.dni + " es mayor de edad.");
        } else {
            System.out.println(persona2.nombre + persona2.apellidos + " con DNI " + persona2.dni + " no es mayor de edad.");
        }
    }
}
