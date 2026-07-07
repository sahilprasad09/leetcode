class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int i=0,left=0,right=0;int sum=0;
        for(i=0;i<nums.length-2;i++)
        {
         
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                left=i+1;
                right=nums.length-1;
                sum=-1*nums[i];
                while(left<right)
                {
                    int s=nums[left]+nums[right];
                    if(sum==s)
                    {
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<nums.length&&nums[left]==nums[left-1])
                        {
                            left++;
                        }
                        while(right>=0&&nums[right]==nums[right+1])
                        {
                            right--;
                        }
                    }
                    else if(s<sum)
                        left++;
                    else if(s>sum)
                        right--;
                }
            }
        }
        return result;
    }
}