import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму в тенге: ");
        double amount = scanner.nextDouble();

        System.out.println("Выберите валюту для обмена: ");
        System.out.println("1. Рубль");
        System.out.println("2. Доллар");
        System.out.println("3. Евро");
        System.out.println("4. Юань");

        int choice = scanner.nextInt();

        String toCurrency;
        switch (choice) {
            case 1:
                toCurrency = "RUB";
                break;
            case 2:
                toCurrency = "USD";
                break;
            case 3:
                toCurrency = "EUR";
                break;
            case 4:
                toCurrency = "CNY";
                break;
            default:
                throw new IllegalArgumentException("Неизвестная валюта");
        }

        double convertedAmount = CurrencyConverter.convert(amount, "KZT", toCurrency);

        System.out.println("Конвертированная сумма: " + convertedAmount);
    }
}
