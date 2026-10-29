class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int dup=x;
        int rev=0;
        while(dup!=0){
            int ld=dup%10;
             rev=ld+rev*10;
             dup/=10;
        }
        if(rev==x) return true;
        else
          return false;
    }
}