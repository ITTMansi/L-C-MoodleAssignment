import java.util.List;

class OutputHandler {
    public static void displayCountryFullName(String countryCode, List<String> adjacentCountries) {
        if (adjacentCountries == null) {
            System.out.println("Invalid country code or no data available.");
        } else if (adjacentCountries.isEmpty()) {
            System.out.println("The country " + countryCode + " has no adjacent countries.");
        } else {
            System.out.println("Adjacent countries for " + countryCode + ": " + String.join(", ", adjacentCountries));
        }
    }
}