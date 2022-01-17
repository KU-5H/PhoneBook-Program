public class Contact {

    //Variables created to store contact infromation
    private String fname;
    private String lname;
    private String number;
    private String mail;
    private String brithdate;
    private String location;
    private String gender;

    //Creating an object to hold the specific variables
    public Contact(String firstName, String lastName) {

        //Setting all variables into the object
        this.fname = firstName;
        this.lname = lastName;

    }

    //Getters for each value
    public String getFirstName() {
        return this.fname;
    }

    public String getLastName() {
        return this.lname;
    }

    public String getPhoneNumber() {
        return this.number;
    }

    public String getEmail() {
        return this.mail;
    }

    public String getBirthday() {
        return this.brithdate;
    }
    
    public String getAddress() {
        return this.location;
    }

    public String getGender() {
        return this.gender;
    }

    //Setter for each value
    public void setFirstName(String firstName) {
        this.fname = firstName;
    }

    public void setLastName(String lastName) {
        this.lname = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.number = phoneNumber;
    }

    public void setEmail(String email) {
        this.mail = email;
    }

    public void setBirthday(String birthday) {
        this.brithdate = birthday;
    }
    
    public void setAddress(String address) {
        this.location = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Returns a formatted version of the object
    public String getinfo() {

        return "First Name: " + this.fname + "\nLast Name: " + this.lname + "\nPhone Number: " + 
        this.number + "\nEmail: " + this.mail + "\nBirthday: " + this.brithdate + "\nLocation: " 
        + this.location + "\nGender: " + this.gender;
    }
    
}
