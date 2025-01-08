import java.util.List;

public class AdjacentCountriesApp{
    public static void main(String[] args) {
        String countryCode = InputHandler.getCountryCode();
        List<String> adjacentCountries = CountryData.getCountryNeighbour(countryCode);
        OutputHandler.displayCountryFullName(countryCode, adjacentCountries);
    }
}