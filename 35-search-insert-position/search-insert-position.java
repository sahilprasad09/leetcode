class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;int k=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                k=i;
            else if(target<nums[0])
                k=0;
            else if(target>nums[nums.length-1])
                k=nums.length;
            else if(nums[i]<target&&nums[i+1]>target)
                k=i+1;
        }
        return k;
    }
}