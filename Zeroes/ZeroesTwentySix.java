import java.text.*;
public class ZeroesTwentySix {
   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#.00");
      for(double i = -10; i <= 10; df.format(i+=.1)) {
         //System.out.println(df.format(i));
         for(double j = -1; j < 1; df.format(j+=.1)) {
            System.out.println(j);
            if((3*(i*i*i)) - (19*(i*i)) + (33*i) - 9 == j) {
               System.out.println(df.format(i));
            } else { 
            }
         }
      }
   } //8 - 24 + 22 - 6
}