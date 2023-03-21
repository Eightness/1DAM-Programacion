//Albert Lozano Blasco - Agenda y contactos
//1 DAM - Programación

import java.util.Scanner;

//App Class
public class AppContactBook {

    //Class Attributes
    public Book contactBook = new Book();
    public Scanner input = new Scanner(System.in);

    //----------------------------------------------------------

    //Inputs

    //Function to get the input (option)
    public int option() {
        System.out.print("Elige una opción: ");
        int option = input.nextInt();
        input.nextLine();   //Cleaning buffer due to problems trying to get Strings after this method
        return option;
    }

    //Function to get the input (contact name)
    public String inputName() {
        String inputName;
        //do-while to get a name that doesn't exist already
        do {
            System.out.println();
            System.out.print("Introduce nombre: ");
            inputName = input.nextLine();
            if (contactBook.nameExists(inputName)) {
                System.out.println();
                System.out.println("Nombre ya existente.");
            }
        } while (contactBook.nameExists(inputName)); 
        return inputName;
    }

    //Function to get the input (contact phone)
    public String inputPhone() {
        System.out.println();
        System.out.print("Introduce teléfono: ");
        String inputPhone = input.nextLine();
        return inputPhone;
    }

    //Function to get the input (contact mail)
    public String inputMail() {
        System.out.println();
        System.out.print("Introduce correo: ");
        String inputMail = input.nextLine();
        return inputMail;
    }

    //Function to get the input (search)
    public String inputSearch() {
        System.out.println();
        System.out.print("Buscar: ");
        String inputSearch = input.nextLine();
        return inputSearch;
    }

    //Function to get the input for the remove option
    public int inputRemove() {
        int inputRemove;
        //do-while to make sure the user chooses a valid contact to remove
        do {
            System.out.print("¿Qué contacto desea eliminar? ");
            inputRemove = input.nextInt();
            if (inputRemove < 0 || inputRemove >= contactBook.numContacts) {
                System.out.println();
                System.out.println("El contacto seleccionado no existe.");
                System.out.println();
            }
        } while (inputRemove < 0 || inputRemove >= contactBook.numContacts);
        return inputRemove;
    }

    //Functions

    //Function to show the menu
    public void showMenu() {
        System.out.println();
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Buscar por global.");
        System.out.println("8. Salir.");
        System.out.println();
    }

    //Function to exit
    public void exit() {
        System.out.println();
        System.out.println("Gracias por utilizar la aplicación, ¡adiós!");
        System.out.println();
        System.exit(0);
    }

    //Function to work with the chosen option
    public void switchMenu(int option) {
        switch(option) {
            //Show contacts
            case 1:
            contactBook.showContacts();
            break;

            //Add contact
            case 2:
            if (contactBook.isFull()) {
                System.out.println();
                System.out.println("La agenda está llena.");
                break;
            }
            contactBook.addContact(inputName(), inputPhone(), inputMail());
            break;

            //Remove contact
            case 3:
            if (contactBook.isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                break;
            }
            contactBook.showContacts();
            contactBook.removeContact(inputRemove());
            break;

            //Search contacts
            case 4: 
            case 5: 
            case 6: 
            case 7:
            if (contactBook.isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                break;
            }
            contactBook.searchContact(option, inputSearch().toLowerCase());
            break;

            //Exit
            case 8:
            exit();
            break;

            default: System.out.println("Opción inválida.");
        }
    }

    //Function to show the output
    public void output() {
        while (true) {
            showMenu();
            switchMenu(option());
        }
    }  
    
}
