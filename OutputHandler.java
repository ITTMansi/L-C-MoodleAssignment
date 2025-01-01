import java.util.List;

class OutputHandler {
    public static void displayCountryFullName(String countryCode, String countryFullName) {
        if (countryFullName != null) {
            System.out.println("The full name of the country for " + countryCode + " is: " + countryFullName);
        } else {
            System.out.println("No data available for the given country code or invalid code entered.");
        }
    }
}