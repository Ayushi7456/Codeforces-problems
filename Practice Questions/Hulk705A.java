import java.util.*;
import java.io.*;

public class Hulk705A {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          String oddFeeling = "I hate ";
          String evenFeeling = "I love ";
          String middleWord = "that ";
          String endWord = "it";
          String result = "";
          for (int i = 1; i <= n; i++) {
               if (i % 2 == 0) {
                    result = result + evenFeeling;
               } else {
                    result = result + oddFeeling;
               }
               if (i == n) {
                    result = result + endWord;
               } else {
                    result = result + middleWord;
               }
          }
          System.out.println(result);

     }
}