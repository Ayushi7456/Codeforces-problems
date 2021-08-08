//  Next Round
import java.util.*;
import java.io.*;

public class nextRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (p[k - 1] <= p[j] && (p[k - 1] != 0 || p[j] != 0)) {
                count++;
            } else
                break;
        }
        System.out.println(count);
    }
}
