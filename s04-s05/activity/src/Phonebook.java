import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Phonebook() {
    }

    public Phonebook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Contact contacts) {
        this.contacts.add(contacts);
    }
}
