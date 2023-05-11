package test.structure.array;

import java.util.ArrayList;
import java.util.Scanner;

/*
    뒤집은 소수
 */
public class Array06 {
    private static boolean isPrime(int num) {
        for(int i=2; i<num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> solution1(int[] arr, int len) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<len; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp>0) {
                int n = tmp%10;
                res = res * 10 + n;
                tmp = tmp/10;
            }

            if(isPrime(res)) answer.add(res);
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

    }
}
