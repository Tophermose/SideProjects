import java.text.*;
public class ZeroesFifty {
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#.00");
      for(double i = -100; i <= 100; i++) {
         if((i*i*i) - (4*(i*i)) - (25*i) + 100 == 0) {
            System.out.println(df.format(i));
         } else { 
         }
      }
   } //8 - 24 + 22 - 6
}