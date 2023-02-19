//OBJETIVO

/* Debes desarrollar un programa para una oficina bancaria que permita gestionar las cuentas bancarias de los clientes
así como realizar operaciones de ingreso y retirada de dinero. Los requisitos de la aplicación son: */

//REQUISITOS
/*
 * Se deben poder almacenar hasta un máximo de 100 cuentas bancarias. Al iniciar la aplicación esta no tendrá ninguna cuenta registrada.
 * 
 * De cada cuenta bancaria necesitamos poder registrar el nombre del cliente y el saldo (cantidad de euros). 
 * El saldo puede ser tanto positivo como negativo.
 * 
 * El usuario interactuará con la aplicación mediante un menú de texto que le permita elegir entre distintas opciones numeradas. 
 * Tras cada operación volverá a mostrarse el menú, a no ser que el usuario decida salir de la aplicación. Las opciones son:
 * 
 * 1. Ver cuentas.
 * Mostrará las cuentas registradas y toda su información, una por línea, y debe estar numerada (ver ejemplo abajo). 
 * Si no hay cuentas mostrará el mensaje "No hay cuentas".
 *      0. María    Saldo 1.500,25 €
 *      1. Jose     Saldo 512 €
 * 
 * 2. Ingresar dinero.
 * Permitirá ingresar dinero en una cuenta. Preguntará al usuario la cuenta deseada y una cantidad en euros a ingresar, 
 * y actualizará el saldo.
 * 
 * 3. Retirar dinero.
 * Permitirá retirar dinero de una cuenta. Preguntará al usuario la cuenta deseada y una cantidad en euros a retirar, 
 * y actualizará el saldo.
 * 
 * 4. Agregar cuenta.
 * Permitirá añadir una cuenta bancaria a la lista de cuentas siempre y cuando no esté llena. 
 * Pedirá el nombre y el saldo de la nueva cuenta y se registrará en la lista.
 * 
 * 5. Eliminar cuenta.
 * Permitirá eliminar una cuenta bancaria. Se preguntará qué cuenta se desea eliminar y se borrará de la lista.
 * 
 * 6. Buscar cuenta.
 * Permitirá buscar cuentas. Pedirá al usuario un nombre N y luego mostrará, en forma de lista, la información de todas las cuentas 
 * que en su nombre contengan N (sin diferenciar entre mayúsculas y minúsculas). 
 * Si no se encontrara ninguna cuenta se mostrará el texto "No se han encontrado cuentas".
 * 
 * 7. Mostrar morosos.
 * Mostrará la información de las cuentas con saldo negativo.
 * 
 * 8. Salir
 * Terminará el programa.
 */

 import java.util.Scanner;

 public class BankApp {
 
     public static void main(String[] args) {
 
         //Scanner
         Scanner input = new Scanner(System.in);
 
         //Variables
         int opcion;                //opcion del menú (1-8)
         int contador = 0;          //cantidad de cuentas agregadas
         int contadorMorosos = 0;   //cantidad de cuentas con saldo negativo
         int filtro = 0;            //cantidad de coincidencias de búsqueda
         int eliminar;              //posición de la cuenta que se desea eliminar
         int ingresar;              //posición de la cuenta a la que se desea ingresar dinero
         int retirar;               //posición de la cuenta de la que se desea retirar dinero
         String N;                  //valor de la búsqueda (introducido por el usuario)
 
         //Definimos los vectores
         String[] clientes = new String[100];   //array de los nombres de los clientes
         double[] saldos = new double[100];     //array de los saldos de los clientes
 
         //Bienvenida a la app
         System.out.println();
         System.out.println("Bienvenido a la App del Banco de Albert.");
         System.out.println();
 
         //While principal
         while (true) {
 
             //Mostramos el menú
             System.out.println("1. Ver cuentas.");
             System.out.println("2. Ingresar dinero.");
             System.out.println("3. Retirar dinero.");
             System.out.println("4. Agregar cuenta.");
             System.out.println("5. Eliminar cuenta.");
             System.out.println("6. Buscar cuenta.");
             System.out.println("7. Mostrar morosos.");
             System.out.println("8. Salir.");
 
             System.out.println();
 
             System.out.print("Introduce la opción deseada: ");
             opcion = input.nextInt();
 
             System.out.println();
            
             //Switch para definir qué ocurre en cada opción
             switch (opcion) {
 
                 //1. Ver cuentas
                 case 1:
 
                 if (contador == 0) {

                     System.out.println("No hay cuentas.");
 
                 } else {
 
                     for (int i = 0; i < contador; i++) {
 
                         System.out.print(i + ". " + clientes[i] + "\t" + saldos[i] + " euros.");
                         System.out.println();
 
                     }
 
                 }
 
                 System.out.println();
 
                 break;
 
                 //2. Ingresar dinero
                 case 2:

                 System.out.print("Escribe la cuenta a la que deseas ingresar dinero: ");
                 ingresar = input.nextInt();

                 System.out.println();

                 System.out.print("Escribe la cantidad de dinero que deseas ingresar: ");
                 saldos[ingresar] += input.nextDouble();
 
                 if (clientes[ingresar] != null) {

                     System.out.println();
                     System.out.println("Operación realizada con éxito.");
                     System.out.println();

                 } else {

                     System.out.println();
                     System.out.println("La operación no se pudo realizar (cuenta inexistente).");
                     System.out.println();

                 }
 
                 break;
 
                 //3. Retirar dinero
                 case 3:

                 System.out.print("Escribe la cuenta de la que deseas retirar dinero: ");
                 retirar = input.nextInt();

                 System.out.println();

                 System.out.print("Escribe la cantidad de dinero que deseas retirar: ");
                 saldos[retirar] -= input.nextDouble();
 
                 if (clientes[retirar] != null) {

                    System.out.println();
                    System.out.println("Operación realizada con éxito.");
                    System.out.println();

                } else {

                    System.out.println();
                    System.out.println("La operación no se pudo realizar (cuenta inexistente).");
                    System.out.println();

                }
 
                 break;
 
                 //4. Agregar cuenta
                 case 4:
 
                 if (contador < 100) {
 
                    input.nextLine();
                    System.out.print("Escribe el nombre del cliente: ");
                    clientes[contador] = input.nextLine();

                    System.out.println();

                    System.out.print("Escribe el saldo de la cuenta: ");
                    saldos[contador] = input.nextDouble();
                        
                    contador += 1;

                 } else {

                    System.out.println("No hay espacio para agregar más cuentas.");

                 }

                 System.out.println();
 
                 break;
 
                 //5. Eliminar cuenta
                 case 5:
 
                 System.out.print("Introduce el número de cuenta que quieres eliminar: ");
                 eliminar = input.nextInt();
 
                 if (clientes[eliminar] == null) {
 
                     System.out.println("La cuenta que intentas eliminar no existe.");
 
                 } else {
                     
                     for (int i = eliminar; i < contador; i++) {

                        clientes[eliminar] = clientes[eliminar + 1];
                        saldos[eliminar] = saldos[eliminar + 1];
        
                    }

                    contador -= 1;
 
                 }
 
                 System.out.println();
 
                 break;
 
                 //6. Buscar cuenta
                 case 6:

                 input.nextLine();
                 System.out.print("Introduce el nombre que quieres buscar: ");
                 N = input.nextLine();

                 System.out.println();
                 System.out.println("Resultados de la búsqueda:");
                 System.out.println();

                 for (int i = 0; i < contador; i++) {

                    if ((clientes[i].toLowerCase()).contains(N.toLowerCase())) {

                        System.out.print(i + ". " + clientes[i] + "\t" + saldos[i] + " euros.");
                        System.out.println();

                        filtro += 1;

                    }

                }

                 if (filtro == 0) {

                    System.out.println("No se han encontrado cuentas.");
                
                 }
 
                 System.out.println();
 
                 break;

                 //7. Mostrar morosos
                 case 7:

                 for (int i = 0; i < contador; i++) {

                     if (saldos[i] < 0) {

                        System.out.print(i + ". " + clientes[i] + "\t" + saldos[i] + " euros.");
                        System.out.println();

                        contadorMorosos += 1;

                     }

                 }

                 if (contadorMorosos == 0) {

                    System.out.println("No hay morosos.");

                 }

                 System.out.println();

                 break;

                 //8. Salir
                 case 8:

                 System.exit(0);

                 break;
                 
             }
 
         }
 
     }
     
 }