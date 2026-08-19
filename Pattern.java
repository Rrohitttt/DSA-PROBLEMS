import java.util.*;
public class Pattern {
    public static void pat1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

     public static void pat2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

       public static void pat3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void pat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pat5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
      public static void pat6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
       public static void pat7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j< n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat8(int n) {
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print("");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
           for(int j=0;j<n-i-1;j++){
            System.out.print("");
        }
        System.out.println();
     }
    }

        
     public static void pattern9(int n) {
    for(int i=0; i<n; i++){
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        for(int j=0; j<2*n-(2*i+1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void patt9(int n){
    for(int i = 1; i <= 2*n-1; i++) {
    for(int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    if(i>5)
    for(int j=1;j<=2*n-i;j++){
        System.out.println("*");
    }
    System.out.println();
}
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         patt9(n);
    }
}