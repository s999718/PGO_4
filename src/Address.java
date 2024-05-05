public class Address {
    private final String country;
    private final String city;
    private final String postalCode;
    private final String streetName;
    private final String apartmentNumber;

    // Constructor
    public Address(String country, String city, String postalCode, String streetName, String apartmentNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
    }

    // Overloaded createAddress method
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode, String streetName, String apartmentNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, Apartment: %s",
                country, city, postalCode, streetName, apartmentNumber);
    }

    public static void main(String[] args) {
        Address address = new Address("Poland", "Warsaw", "00-123", "Main Street", "5A");
        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-123"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-123", "Main Street"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-123", "Main Street", "5A"));
    }
}
