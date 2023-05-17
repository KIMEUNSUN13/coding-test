package test.structure.array;

import java.util.Scanner;

/*
    점수 계산
 */
public class Array07 {
    private static int solution(int[] arr, int num) {
        int score = 0;
        int temp = 0;
        for(int i=0; i<num; i++) {
            if(arr[i]==1) {
                temp++;
            }
            else {
                temp = 0;
            }
            score += temp;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] tests = new int[num];
        for(int i=0; i<num; i++) {
            tests[i] = scan.nextInt();
        }

        System.out.println(solution(tests, num));
    }
}
