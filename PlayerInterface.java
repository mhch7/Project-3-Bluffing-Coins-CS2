public interface PlayerInterface {

  public CoinFlip makeCoinFlip(int numCoins);

  public Bid makeBid(int numCoins, boolean faceValue);

  public Bid raiseBid(Bid currentBid);

  public boolean challengeBid();

}

// Methods to be used by all player classes