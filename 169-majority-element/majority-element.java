class Solution {
    public int majorityElement(int[] nums) {
        int i=0,curmaj=nums[0],c=1;
        for(i=1;i<nums.length;i++)
        {
            if(curmaj==nums[i])
            {
                c++;
            }
            else
            {
                c--;

            }
            if(c==0)
            {
                curmaj=nums[i];
                c=1;
            }
        }
        return curmaj;
    }
}