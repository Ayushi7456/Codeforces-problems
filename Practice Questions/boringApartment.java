import java.util.*;
import java.io.*;

public class boringApartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int dig = x % 10;
            int digits = (dig - 1) * 10; // number of digits before the answered apartment digits row.
            int len = frequency(x);
            int result = digits;
            if (len == 1) {
                result += 1;
            } else if (len == 2) {
                result += 3;
            } else if (len == 3) {
                result += 6;
            } else if (len == 4) {
                result += 10;
            }
            System.out.println(result);
        }
    }

    public static int frequency(int x) {
        int temp = x;
        int count = 0;
        while (temp != 0) {
            int dig = temp % 10;
            temp /= 10;
            count++;
        }
        return count;
    }
}