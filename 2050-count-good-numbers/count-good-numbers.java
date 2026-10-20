class Solution {
  static final long MOD=1_000_000_007;
    public int countGoodNumbers(long n) {
       long even=(n+1)/2;
       long odd= n/2;

       long left=power(5,even);
       long right=power(4,odd);

       return (int)((left*right)%MOD);
    }
    public long power(long x,long n){
         long ans = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
                n--;
            } else {
                x = (x * x) % MOD;
                n /= 2;
            }
        }
        return ans;
    }
    }
