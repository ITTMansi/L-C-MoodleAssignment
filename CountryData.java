import java.util.*;

class CountryData {
    private static final Map<String, List<String>> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", Arrays.asList("Pakistan", "China", "Nepal", "Bhutan", "Bangladesh", "Myanmar"));
        countryMap.put("US", Arrays.asList("Canada", "Mexico"));
        countryMap.put("NZ", Collections.emptyList());
    }

    public static List<String> getCountryNeighbour(String countryCode) {
        return countryMap.get(countryCode);
    }
}