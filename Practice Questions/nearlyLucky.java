
// problem 110A Nearly lucky number
import java.util.*;
import java.io.*;

public class nearlyLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int n = number.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                count++;
            }
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
// In this question we have to take input as String. otherwise long number testcase won't pass. 