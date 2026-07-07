class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<4)
            return false;
        int k=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(k==0)
            {
                if(nums[i]<nums[i+1])
                {
                }
                else if(i>0&&nums[i]>nums[i+1])
                {
                    k=1;
                }
                else
                    return false;
            }
            else if(k==1)
            {
                if(nums[i]>nums[i+1])
                {

                }
                else if(i>0&&nums[i]<nums[i+1])
                {
                    k=2;
                }
                else
                    return false;
            }
            else if(k==2)
            {
                if(nums[i]<nums[i+1])
                {

                }
                else
                    return false;
            }
        }
        return k==2; 
    }
}