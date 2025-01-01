import java.util.*;

class CountryData {
    private static final Map<String, String> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", "India");
        countryMap.put("US", "United States");
        countryMap.put("NZ", "New Zealand");
    }

    public static String getCountryFullName(String countryCode) {
        return countryMap.get(countryCode);
    }
}