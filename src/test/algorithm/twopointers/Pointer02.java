package test.algorithm.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    공통원소 구하기
 */
public class Pointer02 {
    public static ArrayList<Integer> solution(int[] arr, int[] brr, int a, int b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);

        int ap = 0, bp = 0;
        while(ap<a && bp<b) {
            if(arr[ap]==brr[bp]) {
                answer.add(arr[ap++]);
                bp++;
            }
            else if(arr[ap]<brr[bp]) {
                ap++;
            }
            else bp++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = scan.nextInt();
        }

        int b = scan.nextInt();
        int[] brr = new int[b];
        for(int j=0; j<b; j++) {
            brr[j] = scan.nextInt();
        }

        System.out.println();
        for(int num:solution(arr, brr, a, b)) {
            System.out.print(num + " ");
        }
    }
}
