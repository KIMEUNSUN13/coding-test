package test.string;

import java.util.Scanner;

/*
    특정 문자 뒤집기
 */

public class String05 {
    public static String solution(String input) {
        char[] chars = input.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) {
                lt++;
            }
            else if(!Character.isAlphabetic(chars[rt])) {
                rt--;
            }
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++; rt--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

    }
}
