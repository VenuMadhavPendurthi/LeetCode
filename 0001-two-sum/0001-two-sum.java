class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j = i;j<nums.length-1;j++)
            {
              if(nums[i] + nums[j+1] == target)
            {
                answer[0]=i;
                answer[1]=j+1;
                return answer;
            }
            }
            
        }
       return answer; 
    }
}