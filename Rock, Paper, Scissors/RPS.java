public class RPS {
   public static void main(String[] args) throws Exception {
      RPSMethod rps = new RPSMethod();
      
      rps.gamePlay(rps.playerChoice(), rps.computerChoice());
   }
}