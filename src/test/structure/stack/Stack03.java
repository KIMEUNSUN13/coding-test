package test.structure.stack;

import java.util.Scanner;
import java.util.Stack;

/*
    크레인 인형 뽑기
 */
public class Stack03 {
    public static int solution(int[][] boards, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos:moves) {
            for(int i=0; i<boards.length; i++) {
                if(boards[i][pos-1]!=0) {
                    int temp = boards[i][pos-1];
                    boards[i][pos-1]=0;

                    if(!stack.isEmpty() && temp==stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] boards = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boards[i][j] = scan.nextInt();
            }
        }

        int m = scan.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++) {
            moves[i] = scan.nextInt();
        }

        System.out.println(solution(boards, moves));
    }
}
