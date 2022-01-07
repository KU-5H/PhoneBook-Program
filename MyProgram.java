/****************************************************************
Name: Kush Patel
Due Date: 2022/01/20

Description: TBD
****************************************************************/

//Importing java tools
import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Create Phonebook object
        Phonebook contacts = new Phonebook();

        //Variable to get inputs from the user
        int choice = 0;

        //While loop to get inputs from user
        while(choice != 8) {

            //Give the users their options
            System.out.println("========================================================");
            System.out.println("Please enter a number for the following options:");
            System.out.println("1. Add a new Contact");
            System.out.println("2. Display all Contacts");
            System.out.println("3. Modify a Contact");
            System.out.println("4. Search for a Contact");
            System.out.println("5. Sort Contacts");
            System.out.println("6. Export Contacts");
            System.out.println("7. Import Contacts");
            System.out.println("8. Exit");
            System.out.println("========================================================");

            //Getting the users choice
            System.out.print("Enter Number Here: ");
            choice = input.nextInt();
            System.out.println("");

            //Temporary line to get rid of extra input
            String temp = input.nextLine();

            //If / elseif statements to determine what to do based on the users input
            if(choice == 1) {

                //Messages asking for contact infromation
                System.out.println("Please enter a first name");
                String firstName = input.nextLine();

                System.out.println("Please enter a last name");
                String lastName = input.nextLine();

                System.out.println("Please enter a phone number (For the formatting, include hyphens. Ex 441-765-2345)");
                String phoneNumber = input.nextLine();

                System.out.println("Please enter the contacts email");
                String email = input.nextLine();

                System.out.println("Please enter the birthday (Format: MM-DD-YYYY)");
                String birthday = input.nextLine();

                System.out.println("Please enter the address of the contact");
                String address = input.nextLine();

                System.out.println("Please enter the Gender (Type either M,F or O)");
                String gender = input.nextLine();

                //Creating new contact object to store the values
                Contact name = new Contact(firstName, lastName, phoneNumber, email, birthday, address, gender);

                //Storing the new contact in the phonebook object
                contacts.addContact(name);

                //Spacer
                System.out.println("Contact Created! \n");

            } else if(choice == 2) {
                
                //Calling method to get all names
                System.out.println(contacts.printList());
                System.out.println("\n");

            } else if(choice == 3) {

                //Asking for the contacts first name
                System.out.println("Please enter the contacts first name");
                String firstName = input.nextLine();

                //Asking for the contacts last name
                System.out.println("Please enter the contacts last name");
                String lastName = input.nextLine();
                System.out.println("\n");

                //Finding the specific contact
                int contact = contacts.numOfContacts() -1 ;

                Contact temps = contacts.getContact(firstName, lastName, contact);
                
                //Menu asking user what to change based on the contact
                System.out.println("Choose which information to modify");

                //Used for the while loop
                int checker = 0;

                //While looop to modify values
                while(checker != 8) {

                    //DIsplaying the options for the user to modify
                    System.out.println("1. Modify the first name");
                    System.out.println("2. Modify the last name");
                    System.out.println("3. Modify the phone number");
                    System.out.println("4. Modify the email");
                    System.out.println("5. Modify the birthday");
                    System.out.println("6. Modify the home address");
                    System.out.println("7. Modify the gender");
                    System.out.println("8. Exit");

                    //Getting input from the user
                    System.out.print("Enter Number Here: ");
                    checker = input.nextInt();
                    System.out.println("");

                    //temp line to prevent ghost inputs
                    temp = input.nextLine();

                    //If statement to change each specific value
                    if(checker == 1) {
                        System.out.println("Enter the new first name");
                        String fname = input.nextLine();
                        temps.setFirstName(fname);
                        System.out.println("First name changed! \n");

                    } else if(checker == 2) {
                        System.out.println("Enter the new last name");
                        String lname = input.nextLine();
                        temps.setLastName(lname);
                        System.out.println("Last name changed! \n");

                    } else if(checker == 3) {
                        System.out.println("Enter the new phone number");
                        String number = input.nextLine();
                        temps.setPhoneNumber(number);
                        System.out.println("Number changed! \n");

                    } else if(checker == 4) {
                        System.out.println("Enter the new email");
                        String email = input.nextLine();
                        temps.setEmail(email);
                        System.out.println("First name changed! \n");

                    } else if(checker == 5) {
                        System.out.println("Enter the new birthday");
                        String date = input.nextLine();
                        temps.setBirthday(date);
                        System.out.println("Birthday changed! \n");

                    } else if(checker == 6) {
                        System.out.println("Enter the new address");
                        String address = input.nextLine();
                        temps.setAddress(address);
                        System.out.println("Address changed! \n");

                    } else if(checker == 7) {
                        System.out.println("Enter the new gender");
                        String gender = input.nextLine();
                        temps.setGender(gender);
                        System.out.println("Gender changed! \n");

                    } else if(checker == 8) {
                        System.out.println("Exiting Modifying process \n");
                    } else {
                        System.out.println("ERROR: INVALID NUMBER. PLEASE TRY AGAIN\n");
                    }
                }


            } else if(choice == 4) {

            } else if(choice == 5) {

            } else if(choice == 6) {

            } else if(choice == 7) {

            } else if(choice == 8) {
                System.out.println("Bye!");
            } else {
                System.out.println("ERROR: INVALID NUMBER. PLEASE TRY AGAIN");
            }
        }




    }
}