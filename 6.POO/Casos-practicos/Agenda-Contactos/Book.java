//Albert Lozano Blasco - Agenda y contactos
//1 DAM - Programación

//Book class
public class Book {
    
    //Class Attributes
    private final int maxContacts = 2;
    public int numContacts = 0;
    private Contact[] contacts = new Contact[maxContacts];

    //----------------------------------------------------------

    //Functions

    //1. Function to show contacts
    public void showContacts() {
        if (isEmpty()) {
            System.out.println();
            System.out.println("No hay contactos.");
            return;
        }
        System.out.println();
        for (int i = 0; i < numContacts; i++) {
            System.out.println(i + ". " + contacts[i].showContact());
            System.out.println();
        }
    }

    //2. Function to add a contact
    public void addContact(String name, String phone, String mail) {
        contacts[numContacts] = new Contact(name, phone, mail);
        numContacts++;
        System.out.println();
        System.out.println("Contacto añadido con éxito.");
    }

    //3. Function to remove a contact
    public void removeContact(int remove) {
        contacts[remove] = null;
        for (int i = remove; i < (numContacts - 1); i++) {
            contacts[i] = contacts[i + 1];
        }
        numContacts--;
        System.out.println();
        System.out.println("Contacto eliminado con éxito.");
    }

    //4. Function to search by name
    public void searchByName(String search) {
        boolean check = false;
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().toLowerCase().contains(search)) {
                System.out.println(i + ". " + contacts[i].showContact());
                System.out.println();
                check = true;
            }
        }
        if (!check) {
            System.out.println("No se han encontrado contactos.");
        }
    }

    //5. Function to search by phone
    public void searchByPhone(String search) {
        boolean check = false;
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getPhone().toLowerCase().contains(search)) {
                System.out.println(i + ". " + contacts[i].showContact());
                System.out.println();
                check = true;
            }
        }
        if (!check) {
            System.out.println("No se han encontrado contactos.");
        }
    }

    //6. Function to search by mail
    public void searchByMail(String search) {
        boolean check = false;
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getMail().toLowerCase().contains(search)) {
                System.out.println(i + ". " + contacts[i].showContact());
                System.out.println();
                check = true;
            }
        }
        if (!check) {
            System.out.println("No se han encontrado contactos.");
        }
    }

    //7. Function to search globally
    public void searchBy(String search) {
        boolean check = false;
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
    }

    //Function to switch between searches
    public void searchContact(int option, String search) {
        System.out.println();
        switch(option) {
            //Search by name
            case 4:
            if (isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                return;
            }
            searchByName(search);
            break;
            
            //Search by phone
            case 5:
            if (isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                return;
            }
            searchByPhone(search);
            break;
            
            //Search by mail
            case 6:
            if (isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                return;
            }
            searchByMail(search);
            break;
            
            //Global search 
            case 7:
            if (isEmpty()) {
                System.out.println();
                System.out.println("No hay contactos.");
                return;
            }
            searchBy(search);
            break;

            default: System.out.println("Opción desconocida.");
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
    public boolean nameExists(String name) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].sameName(name)) {
                return true;
            }
        }
        return false;
    }
    
}
