import java.util.Random;
import java.util.Scanner;

public class Main {

  // Game Menu
  private static PlayerInterface createPlayer(Scanner sc) {
    System.out.println("1. Human");
    System.out.println("2. Random");
    System.out.println("3. Smart");
    int choice = sc.nextInt();
    if (choice == 1) {
      return new Human(sc);
    } else if (choice == 2) {
      return new RandomComputer();
    } else {
      return new SmartComputer();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int input;

    // Creates Two Players
    PlayerInterface one, two;
    System.out.println("Select Players' Type:");
    System.out.println("Player 1:");
    one = createPlayer(sc);
    System.out.println("Player 2:");
    two = createPlayer(sc);

    // Game starts here with coin flips for each player
    one.makeCoinFlip(5);
    two.makeCoinFlip(5);

    // made new coin flips variable to use them in the loop
    CoinFlip coinFlip1 = new CoinFlip(5);
    CoinFlip coinFlip2 = new CoinFlip(5);

    // intilize bid
    Bid currentBid = new Bid(0, true);
    currentBid = one.makeBid(currentBid.getNumCoins(), currentBid.getFaceValue());
    System.out.println("Player 1's bid is " + currentBid.getNumCoins() + " Coins and Side is " + currentBid.toString());

    boolean done = false;

    // Game Loop
    while (!done) {
      System.out.println("Would you like raise or challenge? Press 1 to Raise and Press 2 to Challenge");
      if (two instanceof RandomComputer || two instanceof SmartComputer) {
        input = r.nextInt(2);
        if (input == 0) {
          currentBid = two.raiseBid(currentBid);
          System.out.println("Player 2 raises bid to: " + currentBid.getNumCoins());
        } else {
          two.challengeBid();
        }
      } else {
        input = sc.nextInt();
        if (input == 1) {
          currentBid = two.raiseBid(currentBid);
          System.out.println("Player 2 raises bid to: " + currentBid.getNumCoins());
        } else if (input == 2) {
          two.challengeBid();
        } else {
          System.out.println("Not a valid input");
        }
      }

      if (one instanceof RandomComputer || one instanceof SmartComputer) {
        input = r.nextInt(2);
        if (input == 0) {
          currentBid = one.raiseBid(currentBid);
          System.out.println("Player 1 raises bid to: " + currentBid.getNumCoins());
        } else {
          one.challengeBid();
        }
      } else {
        input = sc.nextInt();
        if (input == 1) {
          currentBid = one.raiseBid(currentBid);
          System.out.println("Player 1 raises bid to: " + currentBid.getNumCoins());
        } else if (input == 2) {
          one.challengeBid();
        } else {
          System.out.println("Not a valid input");
        }
      }

      if (one.challengeBid()) {
        System.out.println("Player 1 Challenges: LIAR!");
        if (currentBid.getFaceValue() == true) {
          if (currentBid.getNumCoins() >= coinFlip2.getHeadsCount()) {
            System.out.println("Player 2 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          } else {
            System.out.println("Player 1 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          }
        } else if (currentBid.getFaceValue() == false) {
          System.out.println("Player 1 Challenges: LIAR!");
          if (currentBid.getNumCoins() >= coinFlip2.getTailsCount()) {
            System.out.println("Player 2 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          } else {
            System.out.println("Player 1 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          }
        }
        done = true;
      } else if (two.challengeBid()) {
        System.out.println("Player 2 Challenges: LIAR!");
        if (currentBid.getFaceValue() == true) {
          if (currentBid.getNumCoins() >= coinFlip1.getHeadsCount()) {
            System.out.println("Player 1 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          } else {
            System.out.println("Player 2 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          }
        } else if (currentBid.getFaceValue() == false) {
          System.out.println("Player 1 Challenges: LIAR!");
          if (currentBid.getNumCoins() >= coinFlip1.getTailsCount()) {
            System.out.println("Player 1 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          } else {
            System.out.println("Player 2 wins");
            System.out.println("Player 1's Coins:");
            System.out.println("Heads: " + coinFlip1.getHeadsCount());
            System.out.println("Tails: " + coinFlip1.getTailsCount());
            System.out.println("Player 2's Coins:");
            System.out.println("Heads: " + coinFlip2.getHeadsCount());
            System.out.println("Tails: " + coinFlip2.getTailsCount());
            done = true;
          }
        }
        done = true;
      }
    }

  }
}
