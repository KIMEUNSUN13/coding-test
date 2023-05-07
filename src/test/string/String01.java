package test.string;

import java.util.Scanner;

/*
    문자찾기
    >> String, Character 다양한 함수 이용
 */
public class String01 {
    public static int solution1(char c, String input) {
        int answer = 0;
        input = input.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i=0; i<input.length(); i++) {
            if(c==input.charAt(i)) answer++;
        }

        return answer;
    }

    public static int solution2(char c, String input) {
        int answer = 0;
        input = input.toUpperCase();
        c = Character.toUpperCase(c);

        for(char t:input.toCharArray()) {
            if(c==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char c = scan.next().charAt(0);
        System.out.println(solution1(c, input));
        System.out.println(solution2(c, input));
    }
}
