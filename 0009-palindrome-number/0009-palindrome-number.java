class Solution {
    public boolean isPalindrome(int x) 
    {
       if(x == 0) return true;
       if(x< 0) return false;
       else
       {
        int rev=0;
        int y=x;
          while(x!=0)
          {
            rev = rev*10 + (x % 10);
             x = x/10;
          }
          if(y == rev)
          {
             return true;
          }
       }
       return false;
    }
}