package test.structure.set;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
    K번쨰 큰수
 */
public class TreeSet05 {
    public static int solution(int[] arr, int n, int k) {
        int answer = -1;
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int z=j+1; z<n; z++) {
                    set.add(arr[i]+arr[j]+arr[z]);
                }
            }
        }

        int cnt = 0;
        for(int x:set) {
            cnt++;
            if(cnt==k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(arr, n, k));
    }
}
