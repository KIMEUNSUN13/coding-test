package test.algorithm.twopointers;

import java.util.ArrayList;
import java.util.Scanner;

/*
    두 배열 합치기
 */
public class Pointer01 {
    public static ArrayList<Integer> solution(int[] arr, int[] brr, int a, int b) {
        ArrayList<Integer> result = new ArrayList<>();
        int ap = 0, bp = 0;

        while(ap<a && bp<b) {
            if(arr[ap]<brr[bp]) {
                result.add(arr[ap++]);
            }
            else {
                result.add(brr[bp++]);
            }
        }

        while(ap<a) result.add(arr[ap++]);
        while(bp<b) result.add(brr[bp++]);

        return result;
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
