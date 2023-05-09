import java.util.Scanner;
import java.util.InputMismatchException;;

public class Ejercicio8 {

    //Attributes
    static Scanner input = new Scanner(System.in);

    //Methods

    //This method serves as a template for getting user input
    static int getValidIntegerInput(String message) {
        //Declaring and initializing variables
        int res = 0;
        boolean check = false;
        //do-while structure to ask the user until its validated
        do {
            System.out.println();
            System.out.print(message);
            try {
                //Executes these lines and tries to catch an exception
                res = input.nextInt();
                check = true;            
            } catch (InputMismatchException e) {
                //If exception catched, show this message: 
                System.out.println("Tipo de dato introducido incorrecto.");
                input.nextLine();
            }
        } while (!check);
        //Return user input
        return res;
    }
    
    public static void main(String[] args) {
        //Calling method
        int a = getValidIntegerInput("Introduce un número entero: ");
        //Show result
        System.out.println("El valor introducido por el usuario es: " + a);
    }
}
