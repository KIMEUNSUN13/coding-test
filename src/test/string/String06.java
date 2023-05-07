package test.string;

import java.util.HashSet;
import java.util.Scanner;

/*
    중복문자제거
 */
public class String06 {

    public static String solution1(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char c:input.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String solution2(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            if(input.indexOf(input.charAt(i))==i) {
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(solution1(input));
    }
}
