class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n != 1) {

            if(set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;
            int n1 = n;

            while(n1 != 0) {
                int digit = n1 % 10;
                sum = sum + digit * digit;
                n1 = n1 / 10;
            }

            n = sum;
        }

        return true;
    }
}