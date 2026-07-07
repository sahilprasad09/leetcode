class Solution {
    public long sumAndMultiply(int n) {

        long sum1 = 0;
        int sum2 = 0;

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {

            int num = s.charAt(i) - '0';

            if (num != 0) {
                sum1 = (sum1 * 10) + num;
                sum2 = sum2 + num;
            }
        }

        return sum1 * sum2;
    }
}