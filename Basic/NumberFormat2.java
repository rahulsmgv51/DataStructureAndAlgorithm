package Basic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class NumberFormat2 {
    public static void main(String[] args)
            throws Exception {

        // Get the currency instance
        NumberFormat nF = NumberFormat.getCurrencyInstance();

        // Sets the currency to Canadian Dollar
        nF.setCurrency(Currency.getInstance(Locale.CANADA));

        // Stores the values
        String values = nF.getCurrency().getDisplayName();

        int amount = 1078;

        // Prints the currency name
        System.out.println(values);

        // Print amount in defined currency
        System.out.println(nF.format(amount));
    }
}
