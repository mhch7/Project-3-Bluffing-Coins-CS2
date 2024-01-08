import java.util.Random;

public class SmartComputer implements PlayerInterface {
  private Random r;
  private Bid currentBid;
  private CoinFlip flipCoin;

  public SmartComputer() {
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

  // smart computer only raises bid by 1
  public Bid raiseBid(Bid currentBid) {
    int newNumCoins = currentBid.getNumCoins() + 1;
    currentBid = new Bid(newNumCoins, currentBid.getFaceValue());
    return currentBid;
  }

  public boolean challengeBid() {
    return true;
  }
}