import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int result_sum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(result_sum - target)) {
                    result_sum = sum;
                }

                if (sum == target) {
                    return sum;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result_sum;
    }
}