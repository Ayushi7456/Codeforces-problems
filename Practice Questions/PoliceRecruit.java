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
        int police = 0;
        int crime = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                police+=arr[i];
            }
            else{
                if(police>0){
                    police--;
                }
                else{
                    crime++;
                }
            }
        }
        System.out.println(crime);
    }
}
