//Albert Lozano Blasco - Agenda y contactos
//1 DAM - Programación

import java.util.Scanner;

//Book class
public class Book {
    
    //Class Attributes
    private static final int maxContacts = 100;
    private static int numContacts = 0;
    private static Contact[] contacts = new Contact[maxContacts];
    private static Scanner input = new Scanner(System.in);

    //----------------------------------------------------------

    //Functions

    //Function to get the input (contact name)
    public static String inputName() {
        String inputName;
        do {
            System.out.print("Introduce nombre: ");
            inputName = input.nextLine();
            if (nameExists(inputName)) {
                System.out.println();
                System.out.println("Nombre ya existente.");
                System.out.println();
            }
        } while (nameExists(inputName)); 
        return inputName;
    }

    //Function to get the input (contact phone)
    public static String inputPhone() {
        System.out.print("Introduce teléfono: ");
        String inputPhone = input.nextLine();
        return inputPhone;
    }

    //Function to get the input (contact mail)
    public static String inputMail() {
        System.out.print("Introduce correo: ");
        String inputMail = input.nextLine();
        return inputMail;
    }

    //Function to get the input (search)
    public static String inputSearch() {
        System.out.print("Buscar: ");
        String inputSearch = input.nextLine();
        return inputSearch;
    }

    //Function to get the input for the remove option
    public static int inputRemove() {
        int inputRemove;
        do {
            System.out.print("¿Qué contacto desea eliminar? ");
            inputRemove = input.nextInt();
            if (inputRemove < 0 || inputRemove >= numContacts) {
                System.out.println();
                System.out.println("El contacto seleccionado no existe.");
                System.out.println();
            }
        } while (inputRemove < 0 || inputRemove >= numContacts);
        return inputRemove;
    }

    //Function to show contacts
    public void showContacts() {
        if (isEmpty()) {
            System.out.println();
            System.out.println("No hay contactos.");
        } else {
            System.out.println();
            for (int i = 0; i < numContacts; i++) {
                System.out.println(i + ". " + contacts[i].showContact());
                System.out.println();
            }
        }
    }

    //Function to add a contact
    public void addContact() {
        if (isFull()) {
            System.out.println();
            System.out.println("La agenda está llena.");
        } else {
            System.out.println();
            input.nextLine();
            contacts[numContacts] = new Contact(inputName(), inputPhone(), inputMail());
            numContacts++;
            System.out.println();
            System.out.println("Contacto añadido con éxito.");
        }
    }

    //Function to remove a contact
    public void removeContact() {
        if (isEmpty()) {
            System.out.println();
            System.out.println("No hay contactos.");
        } else {
            showContacts();
            System.out.println();
            int remove = inputRemove();
            contacts[remove] = null;
            for (int i = remove; i < (numContacts - 1); i++) {
                contacts[i] = contacts[i + 1];
            }
            numContacts--;
            System.out.println();
            System.out.println("Contacto eliminado con éxito.");
        }
    }

    //Function to search for a contact (by name, phone, mail or overall)
    public void searchContact(int option) {
        if (isEmpty()) {
            System.out.println();
            System.out.println("No hay contactos.");
        } else {
            System.out.println();
            String search = inputSearch().toLowerCase();
            boolean check = false;
            switch(option) {
                //Search by name
                case 4:
                for (int i = 0; i < numContacts; i++) {
                    if (contacts[i].getName().toLowerCase().contains(search)) {
                        System.out.println(i + ". " + contacts[i].showContact());
                        System.out.println();
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("No se han encontrado coincidencias.");
                }
                break;
                
                //Search by phone
                case 5:
                for (int i = 0; i < numContacts; i++) {
                    if (contacts[i].getPhone().toLowerCase().contains(search)) {
                        System.out.println(i + ". " + contacts[i].showContact());
                        System.out.println();
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("No se han encontrado coincidencias.");
                }
                break;
                
                //Search by mail
                case 6:
                for (int i = 0; i < numContacts; i++) {
                    if (contacts[i].getMail().toLowerCase().contains(search)) {
                        System.out.println(i + ". " + contacts[i].showContact());
                        System.out.println();
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("No se han encontrado coincidencias.");
                }
                break;
                
                //Global search 
                case 7:
                for (int i = 0; i < numContacts; i++) {
                    if (contacts[i].showContact().toLowerCase().contains(search)) {
                        System.out.println(i + ". " + contacts[i].showContact());
                        System.out.println();
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("No se han encontrado contactos.");
                }
                break;
    
                default: System.out.println("Opción desconocida.");
            }
        }
    }

    //Function to see if the book is empty
    public boolean isEmpty() {
        if (contacts[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    //Function to see if the book is full
    public boolean isFull() {
        if (numContacts == maxContacts) {
            return true;
        } else {
            return false;
        }
    }
    
    //Function to see if a name exists in the book
    public static boolean nameExists(String name) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].sameName(name)) {
                return true;
            }
        }
        return false;
    }
    
}
