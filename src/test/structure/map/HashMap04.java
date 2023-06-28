package test.structure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    모든 아나그램 찾기
    sliding window
 */
public class HashMap04 {
    public static int solution(String s1, String s2) {
        int answer = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(char c:s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        int len = s2.length()-1;
        for(int i=0; i<len; i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
        }

        int lt = 0;
        for(int rt=len; rt<s1.length(); rt++) {
            map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0)+1);
            if(map1.equals(map2)) {
                answer++;
            }

            map1.put(s1.charAt(lt), map1.get(s1.charAt(lt))-1);
            if(map1.get(s1.charAt(lt))==0) map1.remove(s1.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(solution(s1, s2));
    }
}
