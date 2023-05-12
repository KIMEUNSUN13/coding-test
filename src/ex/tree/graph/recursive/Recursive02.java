package ex.tree.graph.recursive;

/*
    이진수 출력하기
 */
public class Recursive02 {
    private static void dfs(int num) {
        if(num==0) return;
        else {
            dfs(num/2);
            System.out.print(num%2 + " ");
        }
    }

    public static void main(String[] args) {
        int num = 11;
        dfs(num);
    }
}
