package test.structure.string;

import java.util.Scanner;

public class String11 {
    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        input = input + " ";
        int len = input.length();
        for(int i=0; i<len-1; i++) {
            if(input.charAt(i)==input.charAt(i+1)) cnt++;
            else {
                sb.append(input.charAt(i));
                if(cnt>1) sb.append(Integer.toString(cnt));  //String.valueOf(cnt)
                cnt = 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(solution(input));
    }
}
