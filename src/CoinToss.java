import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Coin Toss Game!");
        int wins = 0, losses = 0;

        System.out.println("Would you like to play? (yes/no)");
        String choice = in.nextLine().toLowerCase();

        while (choice.equals("yes")) {
            System.out.print("Choose Heads or Tails: ");
            String userChoice = in.nextLine().toLowerCase();

            int coinToss = (int) (Math.random() * 2);

            String coinResult = (coinToss == 0) ? "heads" : "tails";
            System.out.println("The coin landed on: " + coinResult);

            if (userChoice.equals(coinResult)) {
                System.out.println("You win!");
                wins++;
            } else {
                System.out.println("You lose!");
                losses++;
            }

            System.out.println("Play again? (yes/no)");
            choice = in.nextLine();
        }

        System.out.println("Game Over. Wins: " + wins + ", Losses: " + losses);
    }
}
