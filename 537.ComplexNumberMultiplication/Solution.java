/**
 * 解题思路：
 * 解析出复数的虚部和实部分别计算。
 */
class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] complex1 = parse(a);
        int[] complex2 = parse(b);
        int real = complex1[0] * complex2[0] - complex1[1] * complex2[1];
        int imag = complex1[0] * complex2[1] + complex1[1] * complex2[0];
        return real + "+" + imag + "i";
    }

    private int[] parse(final String str) {
        int[] complex = new int[2];
        String[] tokens = str.split("\\+");
        complex[0] = Integer.valueOf(tokens[0]);
        complex[1] = Integer.valueOf(tokens[1].substring(0, tokens[1].length() - 1));
        return complex;
    }
}
