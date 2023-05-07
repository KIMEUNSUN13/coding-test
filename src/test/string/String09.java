package test.string;

import java.util.Scanner;

/*
    숫자만 추출
 */
public class String09 {
    public static int solution(String input) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(char c:input.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        answer = Integer.parseInt(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
    }
}
