import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us.toString());
        System.out.println("India: " + india.toString());
        System.out.println("China: " + china.toString());
        System.out.println("France: " + france.toString());
    }
}