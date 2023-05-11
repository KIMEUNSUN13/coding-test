package test.structure.string;

import java.util.ArrayList;
import java.util.Scanner;

/*
    단어 뒤집기
 */
public class String04 {
    public static String[] solution(String[] inputs, int len) {
        String[] reverse = new String[len];
        for(int i=0; i<len; i++) {
            reverse[i] = new StringBuilder(inputs[i]).reverse().toString();
        }

        return reverse;
    }

    public static ArrayList<String> solution2(String[] inputs) {
        ArrayList<String> reverse = new ArrayList<>();
        for(String input: inputs) {
            int lt = 0;
            int rt = input.length() - 1;
            char[] chars = input.toCharArray();
            while(lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }

            reverse.add(chars.toString());
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String[] inputs = new String[len];
        for(int i=0; i<len; i++) {
            inputs[i] = scan.nextLine();
        }

        for(String result:solution2(inputs)) {
            System.out.println(result);
        }
    }
}
