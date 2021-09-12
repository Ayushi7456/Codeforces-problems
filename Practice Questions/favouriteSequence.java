import java.util.*;

public class favouriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int lo = 0;
            int hi = n - 1;
            while (lo < hi) {
                System.out.print(arr[lo] + " ");
                lo++;
                System.out.print(arr[hi] + " ");
                hi--;
            }
            if (n % 2 != 0) {
                System.out.print(arr[n / 2]);
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }
}