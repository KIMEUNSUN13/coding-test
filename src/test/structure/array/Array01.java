package test.structure.array;

import java.util.ArrayList;
import java.util.Scanner;

/*
    큰 수 출력하기
 */
public class Array01 {
    public static ArrayList<Integer> solution1(int[] arr, int len) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<len; i++) {
            if(arr[i]>arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution1(arr, len));
    }
}
