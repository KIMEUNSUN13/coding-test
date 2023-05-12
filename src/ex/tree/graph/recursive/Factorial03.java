package ex.tree.graph.recursive;

public class Factorial03 {
    private static int factorial1(int num) {
        if(num==1) return 1;
        else return num*factorial1(num-1);
    }

    public static void main(String[] args) {
        int num = 5;
        factorial1(num);
    }
}
