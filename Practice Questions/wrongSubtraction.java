// wrong subtraction Problem977A 
import java.util.*;
import java.io.*;

public class wrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while (k > 0) {
            int lastDig = n % 10;
            if (lastDig != 0) {
                n--;
            } else {
                n /= 10;
            }
            k--;
        }
        System.out.println(n);
    }
}
