import java.util.Random;

public class CoinFlip {
  private int headsCount = 0;
  private int tailsCount = 0;

  public CoinFlip(int numCoins) {
    Random r = new Random();

    for (int i = 0; i < numCoins; i++) {
      int coin = r.nextInt(2);

      if (coin == 0) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }
  }

  public int getHeadsCount() {
    return headsCount;
  }

  public int getTailsCount() {
    return tailsCount;
  }
}