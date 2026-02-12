package Set2_Patterns_Strings.Div1;
import java.util.Scanner;

public class pattern {
   public pattern() {
   }

   public static void rectanglePattern(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         for(int var2 = 0; var2 < var0; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void Right_Angled_Triangle(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         for(int var2 = 0; var2 <= var1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void Right_Angled_Number_Pyramid(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 1; var2 <= var1; ++var2) {
            System.out.print(var2);
         }

         System.out.println();
      }

   }

   public static void Right_Angled_Number_repeat(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 1; var2 <= var1; ++var2) {
            System.out.print(var1);
         }

         System.out.println();
      }

   }

   public static void Inverted_Right_Pyramid(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 0; var2 < var0 - var1 + 1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void Hollow_Square_Pattern(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         for(int var2 = 0; var2 < var0; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 != var0 - 1 && var2 != var0 - 1) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter size of pattern: ");
      int var2 = var1.nextInt();
      System.out.println("Rectangle * Pattern:");
      rectanglePattern(var2);
      System.out.println("\n Right Angled Triangle:");
      Right_Angled_Triangle(var2);
      System.out.println("\nRight Angled Number Pyramid:");
      Right_Angled_Number_Pyramid(var2);
      System.out.println("\nInverted Right Pyramid:");
      Inverted_Right_Pyramid(var2);
      System.out.println("\nHollow Square Pattern:");
      Hollow_Square_Pattern(var2);
      var1.close();
   }
}
