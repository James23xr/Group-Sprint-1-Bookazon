public class Address implements Addressable {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zipCode;
<<<<<<< Updated upstream
 
 
    public Address(String line1, String line2, String city, String state, String zipCode) {
        AddressValidator.validateAddress(line1, city, state, zipCode);
 
 
=======
    private String country;

    public Address(String line1, String line2, String city, String state, String zipCode, String country) {
>>>>>>> Stashed changes
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
<<<<<<< Updated upstream
 
 
   
=======

    @Override
>>>>>>> Stashed changes
    public String getLine1() {
        return line1;
    }

    @Override
    public String getLine2() {
        return line2;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
<<<<<<< Updated upstream
 
 
    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + (line2 == null ? "N/A" : line2) + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
 
 
    public static void main(String[] args) {
        try {
           
            Address address1 = new Address("123 Main St", "Apt 4B", "Waterville", "ME", "04901");
            System.out.println("Test case 1 passed: " + address1);
 
 
            Address address2 = new Address("456 Oak Ave", null, "Oakland", "AZ", "62704");
            System.out.println("Test case 2 passed: " + address2);
 
 
            Address address3 = new Address("", null, "Springfield", "IL", "62704");
            System.out.println("Test case 3 failed (Address Line 1 is required).");
 
 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
 
 
        try {
           
            Address address4 = new Address("789 Pine St", null, "Springfield", "Illinois", "62704");
            System.out.println("Test case 4 failed (short form for state).");
 
 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
 
 
        try {
           
            Address address5 = new Address("987 Elm St", null, "Springfield", "IL", "6270");
            System.out.println("Test case 5 failed (zip code is less than 5 digits).");
 
 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
 }
 
=======

    @Override
    public String getCountry() {
        return country;
    }
}
>>>>>>> Stashed changes
