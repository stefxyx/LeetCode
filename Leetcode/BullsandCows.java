//Secret number:  1807
//Friend's guess: 7810
//1A3B
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class BullsandCows {

  public String getHint(String secret, String guess) {
    int[] digit = new int[10];
    int size = secret.length();
    int bulls = 0;
    int cows = 0;
    for (int i = 0; i < size; i++) {
      int s = Character.getNumericValue(secret.charAt(i));
      int g = Character.getNumericValue(guess.charAt(i));
      if (s == g) {
        bulls++;
      } else {
        if (digit[s] < 0) {
          cows++;
        }
        if (digit[g] > 0) {
          cows++;
        }
        digit[s]++;
        digit[g]--;
      }
    }
    return bulls + "A" + cows + "B";
  }
}
