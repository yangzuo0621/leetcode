/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

/**
 * 解题思路：
 * 二分搜索。
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            switch (guess(mid)) {
                case 0: return mid;
                case 1: left = mid + 1; break;
                case -1: right = mid - 1;
            }
        }
        return mid;
    }
}