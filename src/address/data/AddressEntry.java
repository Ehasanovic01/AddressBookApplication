package address.data;

public class AddressEntry {
    //instaance variables for persons information
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String telephone;
    private String email;


    public AddressEntry(){
        super();

    }

    public AddressEntry(String firstName, String lastName, String street, String state, String telephone, String email, int zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.street = street;
        this.telephone = telephone;
        this.email = email;
        this.zip = zip;
    }

    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     */
    public String prompt_FirstName() {

        return "First Name:";

    }
    // sets the persons first name
    public void set_FirstName(String FirstName){

        this.firstName = FirstName;
    }
    // prompts user for Last name
    public String prompt_LastName() {

        return "Last Name:";

    }
    // sets the persons last name
    public void set_lastName(String lastName) {

        this.lastName = lastName;
    }
    // prompts user for Street Address
    public String prompt_Street() {

        return "Street Name:";

    }
    // sets the persons street address
    public void set_Street(String street) {

        this.street = street;
    }
    // prompts user for city they are located in
    public String prompt_City() {

        return "City:";

    }
    //sets the persons city
    public void set_City(String city) {

        this.city = city;
    }
    // prompts user for state associated with the city
    public String prompt_State() {

        return "State:";

    }
    //sets the persons state
    public void set_State(String state) {

        this.state = state;
    }
    // prompts user for ZIP Code associated with their address
    public String prompt_Zip() {

        return "Zip Code:";

    }
    // sets the persons zip code
    public void set_Zip(int zip) {

        this.zip = zip;
    }

    public String prompt_Telephone() {

        return "Phone Number:";

    }
    // sets the persons phone number
    public void set_telephone(String telephone) {

        this.telephone = telephone;
    }
    public String prompt_Email() {

        return "Email:";

    }
    //sets the persons email address
    public void set_email(String email) {

        this.email = email;
    }
    //changes info to a string for output
    public String toString() {
        return "\n"+ "Name = " + firstName +" " + lastName + "\n" + "Street = " + street + "\n" +"City = "
                + city + "\n" + "State = " + state + "\n" + "Zip = " + zip + "\n" + "Phone = " + telephone +"\n" + "Email = " + email;
    }

}
