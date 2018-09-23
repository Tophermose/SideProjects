import java.util.*;
public class RPSMethod {
   private String compMove;
   
   public String playerChoice() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter Rock, Paper, or Scissors");
      return keyboard.nextLine();
   }
   
   public String computerChoice() {
      
      Random rand = new Random();
      int random = rand.nextInt(3);
      if(random == 0) {
         compMove = "Rock";
      }
      
      else if(random == 1) {
         compMove = "Paper";
      }
      
      else if (random == 2) {
         compMove = "Scissors";
      }
      
      return compMove;
   }
   
   public void gamePlay(String player, String computer) throws Exception {
      if(player.equalsIgnoreCase("Rock") && computer.equals("Paper")) {
         System.out.println("Computer wins!");
      }
       
      else if(player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) {
         System.out.println("Player wins!");
      }
         
      else if(player.equalsIgnoreCase("Paper") && computer.equals("Scissosr")) {
         System.out.println("Computer wins!");
      }
         
      else if(player.equalsIgnoreCase("Paper") && computer.equals("Rock")) {
         System.out.println("Player wins!");
      }
         
      else if(player.equalsIgnoreCase("Scissors") && computer.equals("Rock")) {
         System.out.println("Computer wins!");
      }
       
      else if(player.equalsIgnoreCase("Scissors") && computer.equals("Paper")) {
         System.out.println("Player wins!");
      }
         
      else if(player.equalsIgnoreCase(computer)) {
         System.out.println("It's a tie!");
      }
         
      else {
         throw new incorrectMoveError();
      }
   }
}