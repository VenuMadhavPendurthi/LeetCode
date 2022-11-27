class Solution {
    public int maxSubArray(int[] nums) 
    {
        int final_max=-1000000;
        int max=0;
        int max_value;
        if(nums.length==1)
        {
            final_max=nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            max_value=max+nums[i];
            if(max_value>nums[i])
            {
                max=max_value;
            }
            else
            {
                max=nums[i];
            }
            if(final_max<max)
            {
               final_max=max; 
            }
        }
        return final_max;
    }
}