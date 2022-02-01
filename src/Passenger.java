public class Passenger {
    private static int id;

    static {
        id = 0;
    }
    //address class
    private static class Address {
        String street;
        String city;
        String state;

        // address class constructor
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    //address class object
    private Address address;

    //contact class
    private static class Contact {
        String name;
        String phone;
        String email;

        //contact class constructor
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    //contact class object
    private Contact contact;

    //Passenger class constructor
    public Passenger(String street, String city,
                           String state, String name, String phone,
                           String email) {
        this.id = ++id;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);

    }


    public int getId() {
        return this.id;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }


}
