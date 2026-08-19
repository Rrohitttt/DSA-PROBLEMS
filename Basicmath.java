import java.util.*;
public class Basicmath{

    /* public static int countDigit(long a) {
          int count=0;
          while(n>0){
             count++;
             n/=10;
          }
         return count;
    }

    public static int reverseNumber(int  n) {
    int dupli=n;
    int rev=0;
     while(n>0){
      int ld=n%10;
         rev=(rev*10)+ld;
         n/=10;
     }
     return rev;
    }

    public static boolean isPalindrome(int n) {
    int dupli=n;
    int rev=0;
     while(n>0){
      int ld=n%10;
         rev=(rev*10)+ld;
      n/=10;
     }
     return dupli==rev;
    }

  public static boolean isArmstrong(int n) {
        int dup=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld*ld*ld;
            n/=10;
        }
        return dup==sum;
    }
    
public static int[] divisors(int n) {
    int[] temp = new int[n];
    int k = 0;
    for(int i = 1; i*i <= n; i++) {
        if(n % i == 0) {
            temp[k] = i;
            k++;

            if((n/i) != i) {
                temp[k] = n/i;
                k++;
            }
        }
    }
    for(int i = 0; i < k-1; i++) {
        for(int j = i+1; j < k; j++) {
            if(temp[i] > temp[j]) {
                int t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
        }
    }
    int[] ans = new int[k];
    for(int i = 0; i < k; i++) {
        ans[i] = temp[i];
    }
    return ans;
}
public static boolean isPrime(int n) {
          int count=0;
          for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                count++;
            if((n/i)!=i)    count++;
            }
          }
          if(count==2) 
              return true;
          else 
             return false;
    }*/
     public static int GCD(int n1, int n2) {
      while(n1>0 && n2>0){
        if(n1>n2) n1=n1%n2;
        else n2=n2%n1;
      }
        if(n1==0) 
           return n2;
        else 
          return n1;
      
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
      //  boolean  res =  isArmstrong(n);
      //int[] res=divisors(n);
     // for(int i=0;i<res.length;i++){
     //   System.out.print(res[i]);
   // }
   // boolean resu=isPrime(n);
   // System.out.println(resu);
    int gcd=GCD(n1,n2 );
    System.out.println(gcd);
    }
}