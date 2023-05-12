package ex.tree.graph.recursive;


class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class DFS05 {
    private static Node root;

    public static void dfs(Node node) {
        if(node==null) return;
        else {
            // 전위순회
            // System.out.print(node.data + " ");
            dfs(node.lt);

            // 중위순회
            // System.out.print(node.data + " ");
            dfs(node.rt);

            // 후위순회
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        dfs(root);
    }
}
