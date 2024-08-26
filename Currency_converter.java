import java.util.Scanner;

public class Currency_converter {

    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        double exchangeRate = 0.0;

        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.85;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            exchangeRate = 1.18;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            exchangeRate = 74.50;
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
            exchangeRate = 0.013;
        } else {
            System.out.println("Exchange rate for the provided currency pair is not available.");
        }

        return exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();


        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();


        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);


        if (exchangeRate != 0.0) {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}
