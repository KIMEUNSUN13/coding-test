package test.structure.stack;

import java.util.Scanner;
import java.util.Stack;

/*
    괄호 문자 제거
 */
public class Stack02 {
    private static final Character open = '(';
    private static final Character close = ')';

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c:input.toCharArray()) {
            if(c==close) {
                while(stack.pop()!=open);
            }
            else {
                stack.push(c);
            }
        }

        for(int i=0; i<stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(solution(input));
    }
}
