package test.string;

import java.util.Scanner;

/*
    암호문제
 */
public class String12 {
    public static String solution1(String input, int len) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++) {
            String temp = input.substring(0, 7);
            temp = temp.replace("#", "1").replace("*", "0");
            sb.append((char) Integer.parseInt(temp, 2));
            input = input.substring(7);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int len = scan.nextInt();
        System.out.println(solution1(input, len));
    }
}
