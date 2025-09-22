import java.util.Scanner;

/**
 * Lab1 Currency Conversion (GTQ <-> USD) & (PHP <-> USD)
 * Description: This program converts Guatemalan Quetzales & Philppine Pesos to US Dollars and vice versa using separate methods and a class constant for the rate.
 * @author Edisson Ajciginac
 * @author Jeron Montecillo
 * @since 2025-09-15
 */

public class Conversion {
   // --------- Conversion constants (mid-market reference) -----
   // 1 GTQ to USD 
   static final double DOLLAR_PER_QUETZAL = 0.1306;  // 1 GTQ ≈ 0.1306 USD
   // Keep the inverse consistent with the constant above:
   static final double QUETZAL_PER_DOLLAR = 1.0 / DOLLAR_PER_QUETZAL; // ≈ 7.6554 GTQ per USD
   static final double USD_PER_PHP = 0.017560471;
   static final double PHP_PER_USD = 56.946082;

   /**
    * Shows the menu and returns the user's choice.
    * @param sc Scanner already created in main
    * @return user's option 1..4
    */
   public static int menu(Scanner sc) {
      System.out.println("=== Currency Conversion Menu ===");
      System.out.println("1) GTQ -> USD");
      System.out.println("2) USD -> GTQ");
      System.out.println("3) PHP -> USD");
      System.out.println("4) USD -> PHP");
      System.out.print("Choose an option (1-4): ");
      return sc.nextInt();
   }

   /**
    * Converts Quetzales to US Dollars.
    * @param amountGTQ amount in Quetzales
    * @return amount in US Dollars
    */
   public static double Quetzal2Dollar(double amountGTQ) {
      return amountGTQ * 0.1306;
   }

   /**
    * Converts US Dollars to Quetzales.
    * @param amountUSD amount in US Dollars
    * @return amount in Quetzales
    */
   public static double Dollar2Quetzal(double sc) {
      return sc * 7.656967840735069;
   }

   /**
    * Converts PHP to USD
    * @param amountPHP amount in PHP
    * @return amount in USD
    */
   static double PHP2USD(double amountPHP) {
      return amountPHP * 0.017560471;
   }

   /**
    * Converts USD to PHP
    * @param amountUSD amount in USD
    * @return amount in PHP
    */
   static double USD2PHP(double amountUSD) {
      return amountUSD * 56.946082;
   }

   /**
    * 
    * 
    * 
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int choice = menu(sc);
      System.out.print("Enter the amount to convert: ");
      double value = sc.nextDouble();
      double convert;
      switch (choice) {
         case 1:
            convert = Quetzal2Dollar(value);
            System.out.printf("Q%.2f = $%.2f%n", value, convert); // 2 decimales
            break;
         case 2:
            convert = Dollar2Quetzal(value);
            System.out.printf("$%.2f = Q%.2f%n", value, convert); // 2 decimales
            break;
         case 3:
            convert = PHP2USD(value);
            System.out.printf("U+20B1\u%.2f = $%.2f%n", value, convert);
            break;
         case 4:
            convert = USD2PHP(value);
            System.out.printf("$%.2f = U+20B1\u%.2f%n", value, convert);
            break;
         default:
            System.out.println("Invalid option.");
      }
      sc.close();
   }
}
