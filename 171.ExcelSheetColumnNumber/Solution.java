/**
 * 解题思路：
 *
 */
public class Solution {

    public int titleToNumber(String s) {
        int res = 0;
        for(int i = 0; i<s.length();i++)
            res = res* 26 +(s.charAt(i)-'A'+1);
        return res;
    }

//    public int titleToNumber(String s) {
//        int bound = 26;
//        int[] table = new int[bound];
//        for (int i = 0; i < bound; i++) table[i] = i + 1;
//        int n = 1;
//        int sum = 0;
//        for (int i = s.length()-1; i >= 0; i--) {
//            sum += table[s.charAt(i) - 'A'] * n;
//            n *= bound;
//        }
//        return sum;
//    }
}