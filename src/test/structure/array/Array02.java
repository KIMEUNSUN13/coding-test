package test.structure.array;

import java.util.Scanner;

/*
    보이는 학생
 */
public class Array02 {
    public static int solution1(int[] arr, int len) {
        int cnt = 1;
        int max = arr[0];
        for(int i=1; i<len; i++) {
            if(max<arr[i]) {
                cnt++;
                max = arr[i];
            }
        }

        return cnt;
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
