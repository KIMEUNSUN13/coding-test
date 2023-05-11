package test.structure.string;

import java.util.Scanner;

public class String10 {
    private static final int max = 1000;

    public static int[] solution(String input, char target) {
        int len = input.length();
        int[] answer = new int[len];

        int pos = max;
        answer[0] = pos;
        for(int i=0; i<len; i++) {
            if(input.charAt(i)==target) {
                answer[i] = 0;
                pos = 0;
            }
            else answer[i] = ++pos;
        }

        pos = max;
        for(int i=len-1; i>=0; i--) {
            if(input.charAt(i)==target) pos = 0;
            else {
                answer[i] = Math.min(answer[i], ++pos);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char target = scan.next().charAt(0);
        for(int pos:solution(input, target)) {
            System.out.print(pos + " ");
        }
    }
}
