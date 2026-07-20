class Solution {
        public static int findDuplicate(int[] nums) {
        int[] c = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            c[nums[i]]++;
            if (c[nums[i]] > 1) {
                return nums[i];
            }
        }

        return nums.length;
    }
}