package test.structure.array;

import java.util.Scanner;

/*
    등수 구하기
 */
public class Array08 {
    private static int[] solution(int[] arr, int num) {
        int[] scores = new int[num];
        for(int i=0; i<num; i++) {
            int score = 1;
            for(int j=0; j<num; j++) {
                if(arr[i]<arr[j]) score++;
            }
            scores[i] = score;
        }

        return scores;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = scan.nextInt();
        }

        for(int score : solution(arr, num)) {
            System.out.print(score + " ");
        }
    }
}
