import java.text.*;
public class ZeroesForty {
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#.00");
      for(double i = -100; i <= 100; i++) {
         if((i*i*i*i) + (2 * (i*i*i)) + (10 * (i*i)) + (18 * i) + 9 == 0) {
            System.out.println(df.format(i));
         } else { 
         }
      }
   } //8 - 24 + 22 - 6
}