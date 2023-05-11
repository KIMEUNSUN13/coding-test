package test.structure.array;

import java.util.Scanner;

/*
    피보나치 수열
 */
public class Array04 {
    private static final String delim = " ";

    public static int[] solution1(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<num; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr;
    }

    public static void solution2(int num) {
        int a = 1;
        int b = 1;
        System.out.print(a + delim + b + delim);

        for(int i=2; i<num; i++) {
            int c = a + b;
            System.out.print(c + delim);

            a = b;
            b = c;
            //System.out.print(a + delim + b + delim);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int n:solution1(num)) {
            System.out.print(n + " ");
        }

        System.out.println();
        solution2(num);
    }
}
