import java.text.*;
public class ZeroesTwentyFive {
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#.00");
      for(double i = -100; i <= 100; i++) {
         if((double)(2*(i*i*i)) + (3*(i*i)) - 1 == 0) {
            System.out.println(df.format(i));
         } else { 
         }
      }
   } //8 - 24 + 22 - 6
}