package ex.tree.graph.recursive;

/*
    부분집합
 */

public class DFS06 {
    private static int n;
    private static int[] check;

    private static final String delim = " ";

    private static void dfs(int level) {
        if(level==n+1) {
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<=n; i++) {
                if(check[i]==1) sb.append(i).append(delim);
            }

            if(sb.toString().length()>0) System.out.println(sb.toString());
        }
        else {
            check[level] = 1;
            dfs(level+1);

            check[level] = 0;
            dfs(level+1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        check = new int[n+1];
        dfs(1);
    }
}
