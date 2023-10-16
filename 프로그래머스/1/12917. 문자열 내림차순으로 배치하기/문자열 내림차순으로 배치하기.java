import java.util.Arrays;
import java.util.Collections;

// 무조건 다시 풀기 - Collections랑 Arrays 공부
// 정수 내림차순 정렬도 다시 보기
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String a : str) answer += a;
        return answer;
        /*
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
        */
    }
}