package test.string;

import java.util.Scanner;

/*
    회문 문자열
 */
public class String07 {
    public static String solution1(String input) {
        int len = input.length();
        for(int i=0; i<len/2; i++) {
            if(input.charAt(i) != input.charAt(len-i-1)); {
                return "NO";
            }
        }

        return "YES";
    }

    public static String solution2(String input) {
        String temp = new StringBuilder(input).reverse().toString();
        if(input.equalsIgnoreCase(temp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(solution1(input));
    }
}
