package test.structure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    학급회장
 */
public class HashMap01 {
    public static char solution(String line) {
        char captain = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(char c:line.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int max = 0;
        for(char key:map.keySet()) {
            if(map.get(key)>max) {
                max = map.get(key);
                captain = key;
            }
        }

        return captain;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        System.out.println(solution(line));
    }
}
