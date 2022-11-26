class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Integer value=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                value = hm.get(nums[i])+1;
                hm.replace(nums[i],value);               
            }
            if (value>=2)
            {
                return true;
            }

        }
        return false;
    }        
    }