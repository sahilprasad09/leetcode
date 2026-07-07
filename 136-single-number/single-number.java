class Solution {
    public int singleNumber(int[] nums) {
      int i=0,single=nums[0];
      for(i=1;i<nums.length;i++)
      {
        single=single^nums[i];
      }  
      return single;
    }
}