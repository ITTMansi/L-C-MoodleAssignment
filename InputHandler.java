import java.util.Scanner;

class InputHandler {
    public static String getCountryCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Country Code (e.g., IN, US, NZ):");
        String countryCode = scanner.nextLine().toUpperCase();
        scanner.close();
        return countryCode;
    }
}