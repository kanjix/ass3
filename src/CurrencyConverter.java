import java.util.Arrays;

public class CurrencyConverter {

    private static final double RUB_TO_KZT_RATE = 4.75;
    private static final double USD_TO_KZT_RATE = 0.0021;
    private static final double EUR_TO_KZT_RATE = 0.002;
    private static final double CNY_TO_KZT_RATE = 0.016;

    public static double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency != "KZT") {
            throw new IllegalArgumentException("Исходная валюта должна быть тенге");
        }

        if (!Arrays.asList("RUB", "USD", "EUR", "CNY").contains(toCurrency)) {
            throw new IllegalArgumentException("Целевая валюта должна быть одной из допустимых валют");
        }

        double rate = getRate(toCurrency);
        return amount * rate;
    }

    private static double getRate(String toCurrency) {
        switch (toCurrency) {
            case "RUB":
                return RUB_TO_KZT_RATE;
            case "USD":
                return USD_TO_KZT_RATE;
            case "EUR":
                return EUR_TO_KZT_RATE;
            case "CNY":
                return CNY_TO_KZT_RATE;
            default:
                throw new IllegalArgumentException("Неизвестная валюта");
        }
    }
}
