package test.string;

import java.util.Scanner;

/*
    문장 속 단어
    >> 문자열 함수 이용
 */
public class String03 {
    public static String solution1(String input) {
        String answer = "";
        int max = -1;
        String[] inputs = input.split(" ");
        for(String s:inputs) {
            if(max < s.length()) {
                max = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public static String solution2(String input) {
        String answer = "";
        int max = -1;
        int pos = 0;
        while((pos=input.indexOf(' ')) != -1) {
            String tmep = input.substring(0, pos);
            if(max < tmep.length()) {
                max = tmep.length();
                answer = tmep;
            }

            input = input.substring(pos + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
    }
}
