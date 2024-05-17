import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        Contact contact1 = new Contact("John Doe", "+639152468596","my home in Quezon City");
        Contact contact2 = new Contact("Jane Doe", "+639162148573","my home in Caloocan City");

        phonebook.setContacts(contact1);
        phonebook.setContacts(contact2);

        if(phonebook.getContacts().isEmpty()) {
            System.out.println("Phonebook is empty");
        } else {
            for (int x =0; x < phonebook.getContacts().size(); x++) {
                System.out.println(phonebook.getContacts().get(x).getName());
                System.out.println("----------------------");
                System.out.println(phonebook.getContacts().get(x).getName() + " has the following registered numbers:");
                System.out.println(phonebook.getContacts().get(x).getContactNumber());
                System.out.println("----------------------");
                System.out.println(phonebook.getContacts().get(x).getName() + " has the following registered addresses:");
                System.out.println(phonebook.getContacts().get(x).getAddress());
                System.out.println("==============================");

            }
        }

    }
}