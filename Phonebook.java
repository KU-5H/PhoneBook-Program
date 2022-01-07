import java.util.*;

//Object to hold all contacts
public class Phonebook {

    //Arraylist for contacts
    ArrayList<Contact> books = new ArrayList<Contact>();

    public Phonebook() {
        ArrayList<Contact> newBook = new ArrayList<Contact>();

        this.books = newBook;
    }

    //Add a contact
    public void addContact(Contact newContact) {

        books.add(newContact);

    }

    public String printList() {

        String format = "Contact # _: {First Name, Last Name, Phone Number, Email, Birthdate, Home Address, Gender \n";

        for(int i = 0; i < this.books.size(); i++) {
            int counter = i+1;
            format += "Contact # " + counter + ": " + this.books.get(i).getinfo() + "\n";
        }

        return format;

    }

    public int numOfContacts() {
        return books.size();
    }

    //Send the specific contact based on First and Last name
    public Contact getContact(String fname, String lname, int num) {

        if(num <= 0) {
            return this.books.get(num);
        }

        if(fname.equals(this.books.get(num).getFirstName()) && lname.equals(this.books.get(num).getLastName())) {
            return this.books.get(num);
        } else {
            return getContact(fname, lname, num-1);
        }
    }


}