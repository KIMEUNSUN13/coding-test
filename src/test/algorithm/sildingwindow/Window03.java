package test.algorithm.sildingwindow;

import java.util.Scanner;

/*
    최대 매출
 */
public class Window03 {
    public static int solution(int[] arr, int n, int k) {
        int max = 0, sum = 0;
        for(int i=0; i<k; i++) {
            max += arr[i];
        }

        sum = max;
        for(int i=k; i<n; i++) {
            sum += (arr[i]-arr[i-k]);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("\n" + solution(arr, n, k));
    }
}
