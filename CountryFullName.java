public class CountryFullName {
    public static void main(String[] args) {
        String countryCode = InputHandler.getCountryCode();
        String countryFullName = CountryData.getCountryFullName(countryCode);
        OutputHandler.displayCountryFullName(countryCode, countryFullName);
    }
}