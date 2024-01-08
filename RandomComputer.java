import java.util.Random;

public class RandomComputer implements PlayerInterface {
  private Random r;
  private Bid currentBid;
  private CoinFlip flipCoin;

  public RandomComputer() {
    r = new Random();
  }

  public CoinFlip makeCoinFlip(int numCoins) {
    CoinFlip coinFlip = new CoinFlip(numCoins);
    int headsCount = coinFlip.getHeadsCount();
    int tailsCount = coinFlip.getTailsCount();
    return coinFlip;
  }

  public Bid makeBid(int numCoins, boolean faceValue) {
    numCoins = r.nextInt(6);
    faceValue = r.nextBoolean();
    currentBid = new Bid(numCoins, faceValue);
    System.out.println(currentBid);
    return currentBid;
  }

  public Bid raiseBid(Bid currentBid) {
    int newNumCoins = currentBid.getNumCoins() + r.nextInt(6);
    currentBid = new Bid(newNumCoins, currentBid.getFaceValue());
    return currentBid;
  }

  public boolean challengeBid() {
    return true;
  }
}