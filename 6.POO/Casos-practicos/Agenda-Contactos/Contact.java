//Albert Lozano Blasco - Agenda y contactos
//1 DAM - Programación

//Contact class
public class Contact {

    //Class Attributes
    private String name;
    private String phone;
    private String mail;

    //----------------------------------------------------------

    //Constructors

    //Empty constructor
    public Contact() {

    }

    //Full constructor
    public Contact(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    //----------------------------------------------------------

    //Functions

    //Function to show contact information
    public String showContact() {
        String contact = getName() + "\t" + getPhone() + "\t" + getMail();
        return contact;
    }

    //Function to see if a name already exists in the contact
    public boolean sameName(String name) {
        if (getName().equalsIgnoreCase(name)) {
            return true;
        } else {
            return false;
        }
    }

    //----------------------------------------------------------

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

}
