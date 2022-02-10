package address.data;

import address.data.AddressEntry;

import java.util.ArrayList;

public class AddressBook {
    //Instance variable to store set of addressbooks objects
    private ArrayList<AddressEntry> addressEntryList=new ArrayList<>();
    //list metod print the details of addressEntryList
    public void list() {
        //cycle through the AddressEntry list and grab each element and use the tostring to print output
        for(AddressEntry addressEntry:addressEntryList) {
            System.out.println(addressEntry);
        }
    }

     //addressEntry add to addressEntryList

    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }
    public void initAddressBookExercise() {
        //Create an object of AddressEntry with prefilled info
        AddressEntry addressEntry1=new AddressEntry("Esad", "Hasanovic", "Darby dr", "California", "9257059534", "EHasanovic@gmail.com" , 94513);
        //sets the city to Brentwood
        addressEntry1.set_City("Brentwood");
        AddressEntry addressEntry2=new AddressEntry("John", "Snow", "Folton ave", "California", "5104789654", "JSnow@gmail.com" , 94596);
        //sets the city to Brentwood
        addressEntry1.set_City("Walnut Creek");
        //Call add method
        add(addressEntry1);
        add(addressEntry2);
        //Call list method
        list();
    }
}

