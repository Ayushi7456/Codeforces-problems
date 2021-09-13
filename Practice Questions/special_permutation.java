import java.util.*;

public class special_permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            int[] ans = new int[n];
            for (int i = 0; i < ans.length - 1; i++) {
                ans[i] = arr[i + 1];
                System.out.print(ans[i] + " ");
            }
            ans[ans.length - 1] = arr[0];
            System.out.print(ans[ans.length - 1]);
            System.out.println();
        }
    }
}