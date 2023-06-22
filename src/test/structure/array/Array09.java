package test.structure.array;

import java.util.Scanner;

/*
    격자판 최대합
 */
public class Array09 {
    private static int solution(int[][] arr, int n) {
        int max = 0;
        int sum1, sum2;
        // 행, 열
        for(int i=0; i<n; i++) {
            sum1 = 0; sum2 = 0;
            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        // 대각선
        sum1 = 0; sum2 = 0;
        for(int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(solution(arr, n));
    }
}
