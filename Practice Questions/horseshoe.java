// Problem228A (Is your horseshoe on the other hoof?)
import java.util.*;
import java.io.*;

public class horseshoe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == temp) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.print(count - 1);
        } else {
            System.out.print("0");
        }
    }
}