import java.text.*;
public class ZeroesNineteen {
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#,00");
      for(double i = -100; i <= 100; i++) {
         if((i*i*i) - (6*(i*i)) + (11*i) - 6 == 0) {
            System.out.println(df.format(i));
         } else { 
         }
      }
   } //8 - 24 + 22 - 6
}