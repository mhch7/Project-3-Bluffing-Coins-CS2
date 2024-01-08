import java.util.Scanner;
import java.util.Random;

public class Human implements PlayerInterface {
  private Scanner sc;
  private Bid currentBid;
  private CoinFlip flipCoin;

  public Human(Scanner scan) {
    sc = scan;
  }

  public CoinFlip makeCoinFlip(int numCoins) {
    CoinFlip coinFlip = new CoinFlip(numCoins);
    int headsCount = coinFlip.getHeadsCount();
    int tailsCount = coinFlip.getTailsCount();

    System.out.println("Human Player's Heads: " + headsCount);
    System.out.println("Human Player's Tails: " + tailsCount);

    return coinFlip;
  }

  public Bid makeBid(int numCoins, boolean faceValue) {
    System.out.println("Input number of coins to bid on and input true for heads and false for tails");
    numCoins = sc.nextInt();
    faceValue = sc.nextBoolean();
    currentBid = new Bid(numCoins, faceValue);
    return currentBid;
  }

  public Bid raiseBid(Bid currentBid) {
    System.out.println("Input what you would like to raise the bid to");
    int newNumCoins = sc.nextInt();
    currentBid = new Bid(newNumCoins, currentBid.getFaceValue());
    return currentBid;
  }

  public boolean challengeBid() {
    return true;
  }
}