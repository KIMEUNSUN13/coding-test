package ex.tree.graph.recursive;

/*
    피보나치 수열, 메모이제이션
 */
public class Fibonacci04 {
    private static int[] fibo;

    private static int dfs(int num) {
        if(fibo[num]>0) return fibo[num];

        if(num==1) return fibo[num] = 1;
        else if(num==2) {
            return fibo[num] = 1;
        }
        else {
            return fibo[num] = dfs(num-2) + dfs(num-1);
        }
    }

    public static void main(String[] args) {
        int num = 7;
        fibo = new int[num+1];
        dfs(num);
        for(int i=1; i<=num; i++) {
            // System.out.print(dfs(i) + " ");
            System.out.print(fibo[i] + " ");
        }
    }
}
