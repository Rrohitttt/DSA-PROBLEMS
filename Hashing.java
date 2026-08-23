import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        int q= sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
public class Hashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int q= sc.nextInt();
        while (q-- > 0) {
            char c= sc.next().charAt(0);
            System.out.println(hash[c]);
        }
        sc.close();
    }
}

public class Hashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number, 0));
        }
    }
}