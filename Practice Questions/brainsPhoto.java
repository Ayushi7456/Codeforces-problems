import java.util.*;
import java.io.*;

public class brainsPhoto {
        public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                int m = scn.nextInt();
                int n = scn.nextInt();
                char[][] arr = new char[m][n];
                for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                arr[i][j] = scn.next().charAt(0);
                        }
                }
                int colourcount = 0;
                for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                if (arr[i][j] == 'C' || arr[i][j] == 'M' || arr[i][j] == 'Y') {
                                        colourcount = 1;
                                }

                        }
                }
                if (colourcount >= 1) {
                        System.out.print("#Color");
                } else {
                        System.out.print("#Black&White");
                }
        }
}