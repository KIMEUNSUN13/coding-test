package test.structure.array;

import java.util.Scanner;

/*
    가위바위보
 */
public class Array03 {
    public static String[] solution1(int[] a, int[] b, int cnt) {
        String[] winner = new String[cnt];
        for(int i=0; i<cnt; i++) {
            if(a[i]==1 && b[i]==3) {
                winner[i] = "A";
            }
            else if (a[i]==2 && b[i]==1) {
                winner[i] = "A";
            }
            else if (a[i]==3 && b[i]==2) {
                winner[i] = "A";
            }
            else if(a[i]==b[i]) {
                winner[i] = "D";
            }
            else winner[i] = "B";

        }

        return winner;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] a = new int[cnt];
        for(int i=0; i<cnt; i++) {
            a[i] = scan.nextInt();
        }

        int[] b = new int[cnt];
        for(int i=0; i<cnt; i++) {
            b[i] = scan.nextInt();
        }

        for(String winner:solution1(a, b, cnt)) {
            System.out.println(winner);
        }
    }
}
