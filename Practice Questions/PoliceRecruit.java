import java.util.*;
import java.io.*;

public class PoliceRecruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == -1) {
                if (arr[i - 1] != 1) {
                    count++;
                } else {
                    count = 0;
                }
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
