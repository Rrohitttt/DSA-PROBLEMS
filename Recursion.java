import java.util.*;

class Solution {
    public void printNumbers( int n) {
        if (n==0) return;
        printNumbers(n-1);
        System.out.print(n);//printing from 1 to n 
    }
}

class Solution1 {
    public void printNumber(int n) {
        if(n==0) return;
        System.out.println(n);
        printNumber(n-1); // printing from n to1
    }
}

class Solution2 {
    public int NnumbersSum(int N) {
        if(N==0) return 0;
        return N+NnumbersSum(N-1); // sum of the n numbers 
    }
}

class Solution3 {
    public int factorial(int n) {
    if(n==0) return 1;
    return n*factorial(n-1); // factorail of the n numbers
    }
}

class Solution4 {
    public void reverse(int[] arr, int l, int r) {
        if (l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1); // this is 2pointer swapping using both l and r toswap 
    }
}

class Solution5 {
    public void rev(int[] arr, int i) {
 if (i >= arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse(arr, i + 1); // this is single pointer swapping using only i and length of array
    }
}

class Solution6{
    public boolean checkPalindrome(String s, int i) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return checkPalindrome(s, i + 1);
    }
}

class Solution7 {
    public boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return check(s, 0);
    }
    private boolean check(String s, int i) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return check(s, i + 1);
    }
}
public class Recursion{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        sol.printNumbers(n);
        Solution1 sol1 = new Solution1();
        sol1.printNumber(n);
        Solution2 sol2 = new Solution2();
        System.out.println(sol2.NnumbersSum(n));
        Solution3 sol3 = new Solution3();
        System.out.println(sol3.factorial(n));
        int[] arr = {1, 2, 3, 4, 5};
        Solution4 sol4 = new Solution4();
        sol4.reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Solution5 sol5 = new Solution5();
        sol5.rev(arr, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println(sol6.isPalindrome("madam", 0));
    }
}


