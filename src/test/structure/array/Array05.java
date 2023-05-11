package test.structure.array;

import java.util.Scanner;

/*
    에라토스테네스 체
 */
public class Array05 {
    public static int solution(int num) {
        int cnt = 0;
        int[] arr = new int[num+1];
        for(int i=2; i<=num; i++) {
            if(arr[i]==0) {
                cnt++;
                for(int j=i; j<=num; j+=i) {
                    arr[j] = 1;
                }
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(solution(num));
    }
}
