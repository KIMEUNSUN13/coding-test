package test.structure.stack;

import java.util.Scanner;
import java.util.Stack;

/*
    올바른 괄호
 */
public class Stack01 {
    private static final Character open = '(';
    // private static final Character close = ')';

    public static String solution(String input) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();

        for(Character c:input.toCharArray()) {
            if(c==open) {
                stack.push(c);
            }
            // 닫는 괄호가 더 많은 상황
            else {
                if(stack.isEmpty()) return answer;
                stack.pop();
            }
        }

        // 여는 괄호가 더 많은 상황
        if(!stack.isEmpty()) return answer;

        return "YES";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(solution(input));
    }
}
