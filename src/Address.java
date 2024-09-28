public class Address implements Addressable {
    private String streetAddress;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address(String streetAddress, String apartmentNumber, String city, String state, String zipCode,
            String country) {
        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String getStreetAddress() {
        return streetAddress;
    }

    @Override
    public String getApartmentNumber() {
        return apartmentNumber;
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

    @Override
    public String getCountry() {
        return country;
    }
}