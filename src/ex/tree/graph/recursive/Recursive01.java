package ex.tree.graph.recursive;

public class Recursive01 {
    private static void dfs(int num) {
        if(num==0) return;
        else {
            dfs(num-1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int num = 3;
        dfs(num);
    }
}
