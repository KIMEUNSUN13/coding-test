package test.string;

import java.util.Scanner;

/*
    유효한 팰린드롬
 */
public class String08 {
    public String solution1(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]]", "");
        String temp = new StringBuilder(input).reverse().toString();
        if(input.equals(temp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
}
