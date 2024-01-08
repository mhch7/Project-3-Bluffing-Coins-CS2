public class Bid {
  private int numCoins; // number of coins
  private boolean faceValue; // heads/tails

  public Bid(int numCoins, boolean faceValue) {
    this.numCoins = numCoins;
    this.faceValue = faceValue;
  }

  public int getNumCoins() {
    return numCoins;
  }

  public boolean getFaceValue() {
    return faceValue;
  }

  // return faceValue boolean as a string
  public String toString() {
    if (faceValue) {
      return "Heads";
    } else {
      return "Tails";
    }
  }
}