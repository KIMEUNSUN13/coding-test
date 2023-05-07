package test.string;

import java.util.Scanner;

/*
    대소문자 변환
    >> String, Character 함수 이용
    >> 아스키 코드 이용하는 방법도 알고있자
    >> a(97) ~ z(122) / A(65) ~ Z(90)
 */
public class String02 {
    public static String solution1(String input) {
        StringBuffer sb = new StringBuffer();
        for(char c:input.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    public static String solution2(String input) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z') {
                sb.append(Character.toUpperCase(c));
            }
            else if(c >= 'A' && c <= 'Z') {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return sb.toString();
    }

    public static String solution3(String input) {
        StringBuffer sb = new StringBuffer();
        for(char c:input.toCharArray()) {
            if(c >= 97 && c <= 122) {
                sb.append(c - 32);
            }
            else {
                sb.append(c + 32);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(solution1(input));
    }
}
