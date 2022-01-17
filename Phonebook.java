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

    //Returns the format of all contacts
    public String printList() {

        //String format = "Contact # _: {First Name, Last Name, Phone Number, Email, Birthdate, Home Address, Gender} \n";
        String format = "";

        for(int i = 0; i < this.books.size(); i++) {
            int counter = i+1;
            format += "Contact #" + counter + " \n" + this.books.get(i).getinfo() +"\n\n";
        }

        return format;
    }

    //Returns the size of the array
    public int numOfContacts() {
        return books.size();
    }

    //Send the specific contact based on First and Last name
    public Contact getContact(String fname, String lname, int left, int right) {
        

        //Checking if the rightside number is greater then the leftside to continue searching
        if(right >= left) {

            //Finding the middle value
            int midValue = left + (right-left)/2;

            //Checking if the middle value is equal to the name
            if(this.books.get(midValue).getFirstName().compareToIgnoreCase(fname) == 0 && this.books.get(midValue).getLastName().compareToIgnoreCase(lname) == 0) {
                return this.books.get(midValue);
            }

            //Checking if the name comes before or after the middle value
            if(this.books.get(midValue).getFirstName().compareToIgnoreCase(fname) >= 0 && this.books.get(midValue).getLastName().compareToIgnoreCase(lname) >= 0) {
                return getContact(fname, lname, left, midValue -1);
            } else {
                return getContact(fname, lname, midValue + 1, right);
            }
        }

        //Returning null if message is not found
        return null;
    }

    //Sort the contacts by last name (Selection sort)
    public void sortLast() {

        //For loop for Selection sort
        for(int i = 0; i < this.books.size(); i++) {

            //The smallest index possible
            int minIndex = i;

            //Internal for loop  to find the smallest value
            for(int j = i + 1; j < this.books.size(); j++) {

                //Two variables to get the first names
                String lastName1 = this.books.get(minIndex).getLastName();
                String lastName2 = this.books.get(j).getLastName();

                //Putting both names into lower case
                lastName1.toLowerCase();
                lastName2.toLowerCase();

                //Variable that determines which last name comes before
                if(lastName1.compareToIgnoreCase(lastName2) > 0) {
                    minIndex = j;
                }
            }

            //Change the smallest value into its position
            Collections.swap(this.books, i, minIndex);
        }
    }

    //Sort the contacts by first name (Bubble sort)
    public void sortFirst() {

        //For loop for bubble sort
        for(int i = 0; i < this.books.size(); i++) {

            //Internal for loop  to compare values to each other
            for(int j = 1; j < this.books.size() - i; j++) {

                //Two variables to get the first names
                String firstName1 = this.books.get(j).getFirstName();
                String firstName2 = this.books.get(j-1).getFirstName();

                //Putting both names to lwoer case
                firstName1.toLowerCase();
                firstName2.toLowerCase();

                //Swap elements if the second letter comes before the first
                if(firstName1.compareToIgnoreCase(firstName2) < 0) {
                    Collections.swap(this.books, j, j-1);
                }
            }
        }
    }

    //Remove the contact
    public void removeContact(Contact removal) {
        this.books.remove(removal);
    }


}