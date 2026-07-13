import java.util.Scanner;

public class task2 {
   public task2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number of subjects: ");
      int var2 = var1.nextInt();
      int var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         System.out.print("Enter marks for Subject " + var4 + ": ");
         int var5 = var1.nextInt();
         var3 += var5;
      }

      double var7 = (double)var3 / (double)var2;
      char var6;
      if (var7 >= (double)90.0F) {
         var6 = 'A';
      } else if (var7 >= (double)80.0F) {
         var6 = 'B';
      } else if (var7 >= (double)70.0F) {
         var6 = 'C';
      } else if (var7 >= (double)60.0F) {
         var6 = 'D';
      } else {
         var6 = 'F';
      }

      System.out.println("\n----- Result -----");
      System.out.println("Total Marks = " + var3);
      System.out.println("Average Percentage = " + var7 + "%");
      System.out.println("Grade = " + var6);
      var1.close();
   }
}

