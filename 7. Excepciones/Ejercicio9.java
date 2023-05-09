import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio9 {

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
            //Trying to execute the following block
            try {
                //Executes these lines and tries to catch an exception
                res = input.nextInt();
                check = true;            
            } catch (InputMismatchException e) {
                //If exception catched, show this message: 
                System.out.println("Tipo de dato introducido incorrecto.");
                input. nextLine();
            }
        } while (!check);
        //Return user input
        return res;
    }

    //This method prevents getting ArithmeticException when dividing two numbers
    static boolean getValidDivision(int a, int b) {
        //Trying to execute the following block
        try {
            double result = a/b;
            return true;
        } catch (ArithmeticException e) {
            System.out.println("Error de cálculo aritmético.");
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        do {
            //Calling method to get int twice
            a = getValidIntegerInput("Introduce un número entero: ");
            b = getValidIntegerInput("Introduce un número entero: ");
        } while (!getValidDivision(a, b));
        //Show result
        double result = a/b;
        System.out.println("El resultado de la división entre ambos números es: " + result);
    }
    
}
