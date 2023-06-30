package test.structure.stack;

import java.util.Scanner;
import java.util.Stack;

/*
    후위식 연산
 */

public class Stack04 {
    public static int solution(String input) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c:input.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(c-48);
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if(c=='+') {
                    stack.push(lt+rt);
                }
                else if(c=='-') {

                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

    }
}
