class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1,i=0,k=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                j++;
                continue;
            }
            else
            {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}