class Solution {
    public int romanToInt(String s) 
    {
        {
        int result = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);

        if (s==null) return 0;
        for(int i = 0; i < s.length(); i++)
        {
            int aval = hashmap.get(s.charAt(i));
            if (i+1 < s.length())
            {
                int bval = hashmap.get(s.charAt(i+1));
                if (aval >= bval) result += aval;
                else result -= aval;     
            }
         else result = aval+result;
           
        }
        return result;
    }        
    }
}