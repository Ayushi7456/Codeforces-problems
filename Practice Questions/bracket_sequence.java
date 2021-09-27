import java.util.*;

public class bracket_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "";
            for (int j = 0; j < n; j++) {
                bracket1(j, s);
                bracket2(j, s);
                bracket1(n - j, s);
                bracket2(n - j, s);
                System.out.println();
            }

        }
    }

    public static void bracket1(int x, String s) {
        for (int i = 0; i < x; i++) {
            s += '(';
        }
        System.out.print(s);
    }

    public static void bracket2(int x, String s) {
        for (int i = 0; i < x; i++) {
            s += ')';
        }
        System.out.print(s);
    }
}
