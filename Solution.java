import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int t[] = new int(5);
        for(int i=0;i<n;i++){
            switch(a[i]){
                case 1 : t[0]++;
                         break;
                case 2 : t[1]++;
                         break;
                case 3 : t[2]++;
                         break;
                case 4 : t[3]++;
                         break;
                case 5 : t[4]++;
                         break;
            }
        }
        if(t[0]>t[1]&&t[0]>t[2]&&t[0]>t[3]&&t[0]>t[4]){
            return 1;
        }else if(t[1]>t[0]&&t[1]>t[2]&&t[1]>t[3]&&t[1]>t[4]){
            return 2;
        }else if(t[2]>t[1]&&t[2]>t[0]&&t[2]>t[3]&&t[2]>t[4]){
            return 3;
        }else if(t[3]>t[1]&&t[3]>t[2]&&t[3]>t[0]&&t[3]>t[4]){
            return 4;
        }else {
            return 5;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
