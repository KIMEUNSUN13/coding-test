package test.structure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    아나그램
 */
public class HashMap02 {
    public static String solution(String input1, String input2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for(char c:input1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c:input2.toCharArray()) {
            if(!map.containsKey(c) || map.get(c)==0) {
                return "NO";
            }
            map.put(c, map.get(c)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        System.out.println(solution(input1, input2));
    }
}
