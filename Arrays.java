import java.util.*;

class Solution{
    public int largestElement(int[] nums) {
       int larg=nums[0];
       int n=nums.length;
       for(int i=1;i<n;i++){
        if(nums[i]> larg){
            larg=nums[i];  // finding the largest element from the array
        }
       }
       return larg;
    }
}

class Solution1{
    public int secondLargestElement(int[] nums) {
       int larg=nums[0];
       int n=nums.length;
       for(int i=1;i<n;i++){
        if(nums[i]> larg){
            larg=nums[i];
        }
       }
      int slarg=-1;
      for(int i=0;i<n;i++){
        if(nums[i]> slarg && nums[i]!=larg){
            slarg=nums[i];     // second largest element fromarray
            }
      }
      return slarg;
    }
}

class Solution2{
    public boolean isSorted(ArrayList<Integer> nums) {
        int n=nums.size();
        for(int i=1;i<n;i++){
            if(nums.get(i)> nums.get(i-1)){}
            else return false;
        }
        return true;   // checking whether given array is sorted or not 
    }
}
class Solution3{
    public int removeDuplicates(int[] nums) {
    int n=nums.length;
    int i = 0;
    for(int j = 1; j < n; j++) {
        if(nums[i] != nums[j]) {
            nums[i+1] = nums[j];
            i++;
        }   // removing duplicate values and storing unique values 
    }
    return i+1;
}
    }

class Solution4{
        public void rotateArrayByOne(int[] nums) {
            int n=nums.length;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
        for(int i=0;i<n;i++){
        System.out.println(nums[i]);
        }
        }   // left rotate by 1 ex array 1 2 3 4 as 2 3 4 1
    }
    
    class Solution5{
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
         int[] temp=new int[k];
         for(int i=0;i<k;i++){
            temp[i]=nums[i];
         }
         for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
         }
         int j=0;
         for(int i=n-k;i<n;i++){
            nums[i]=temp[j];
            j++;
         }
         for(int i=0;i<n;i++){
            System.out.println(nums[i]);
         } // left rotation by n places same as above but positions r given 
    }
}

class Solution6{
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            } // moving all zeros to the end of the array by 2 pointer concept reducing time complexity to On
        }
    }
}

class Solution7{
    public int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1; // checking whether the given target is availble in the array r not ,if abailable returning the index value
    }
}

class Solution8 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum-nums[i];
        }
        return sum;  // finding the missing number in the hiven range formula used n*n+1/2
    }
}
class Solution9{
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }else{count=0;}
        }return max; // counting the maximum consecutive ones 
    }
}

class Solution10{
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor; // finding the integer in the array appears twice except one integer. Finding the number that appeared once in the array.
    }
}

public class Arrays{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1. Largest Element");
    System.out.println("2. Second Largest Element");
    System.out.println("3. Check Sorted");
    System.out.println("4. Remove Duplicates");
    System.out.println("5. Rotate Array By One");
    System.out.println("6. Rotate Array By K");
    System.out.println("7. Move Zeroes");
    System.out.println("8. Linear Search");
    System.out.println("9. Missing Number");
    System.out.println("10. Maximum Consecutive Ones");
    System.out.println("11. Single Number");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    System.out.print("Enter array size: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    switch (choice) {
        case 1:
            Solution sol = new Solution();
            System.out.println("Largest Element: " + sol.largestElement(nums));
            break;
        case 2:
            Solution1 sol1 = new Solution1();
            System.out.println("Second Largest Element: " + sol1.secondLargestElement(nums));
            break;
        case 3:
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nums[i]);
            }
            Solution2 sol2 = new Solution2();
            System.out.println("Is Sorted: " + sol2.isSorted(list));
            break;
        case 4:
            Solution3 sol3 = new Solution3();
            int count = sol3.removeDuplicates(nums);
            System.out.println("Number of unique elements: " + count);
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < count; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            break;
        case 5:
            Solution4 sol4 = new Solution4();
            sol4.rotateArrayByOne(nums);
            break;
        case 6:
            System.out.print("Enter k: ");
            int k = sc.nextInt();
            Solution5 sol5 = new Solution5();
            sol5.rotateArray(nums, k);
            break;
        case 7:
            Solution6 sol6 = new Solution6();
            sol6.moveZeroes(nums);
            System.out.println("Array after moving zeroes:");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            break;
        case 8:
            System.out.print("Enter target: ");
            int target = sc.nextInt();
            Solution7 sol7 = new Solution7();
            System.out.println("Index: " + sol7.linearSearch(nums, target));
            break;
        case 9:
            Solution8 sol8 = new Solution8();
            System.out.println("Missing Number: " + sol8.missingNumber(nums));
            break;
        case 10:
            Solution9 sol9 = new Solution9();
            System.out.println("Maximum Consecutive Ones: " + sol9.findMaxConsecutiveOnes(nums));
            break;
        case 11:
            Solution10 sol10 = new Solution10();
            System.out.println("Single Number: " + sol10.singleNumber(nums));
            break;
        default:
            System.out.println("Invalid choice");
    }
}
}