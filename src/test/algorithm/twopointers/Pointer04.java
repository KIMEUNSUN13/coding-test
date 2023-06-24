package test.algorithm.twopointers;

import java.util.Scanner;

/*
    연속 부분 수열
 */
public class Pointer04 {
    public static int solution(int[] arr, int n, int m) {
        int result  = 0, sum = 0;
        int lt = 0;
        for(int rt=0; rt<n; rt++) {
            sum += arr[rt];
            if(sum==m) result++;

            while(sum>=m) {
                sum -= arr[lt++];
                if(sum==m) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("\n" + solution(arr, n, m));
    }
}
