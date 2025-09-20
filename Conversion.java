// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Conversion {
   static final double DOLLAR_PER_QUETZAL = 0.1306;
   static final double QUETZAL_PER_DOLLAR = 7.656967840735069;

   public Conversion() {
   }

   public static int menu(Scanner var0) {
      System.out.println("=== Currency Conversion Menu ===");
      System.out.println("1) GTQ -> USD");
      System.out.println("2) USD -> GTQ");
      System.out.println("3)  -> USD");
      System.out.println("4) USD -> ");
      System.out.print("Choose an option (1-4): ");
      return var0.nextInt();
   }

   public static double Quetzal2Dollar(double var0) {
      return var0 * 0.1306;
   }

   public static double Dollar2Quetzal(double var0) {
      return var0 * 7.656967840735069;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = menu(var1);
      System.out.print("Enter the amount to convert: ");
      double var3 = var1.nextDouble();
      double var5;
      switch (var2) {
         case 1:
            var5 = Quetzal2Dollar(var3);
            System.out.printf("Q%.2f = $%.2f%n", var3, var5);
            break;
         case 2:
            var5 = Dollar2Quetzal(var3);
            System.out.printf("$%.2f = Q%.2f%n", var3, var5);
            break;
         case 3:
            System.out.println("Option 3: partner currency -> USD ");
            break;
         case 4:
            System.out.println("Option 4: USD -> partner currency");
            break;
         default:
            System.out.println("Invalid option.");
      }

      var1.close();
   }
}
