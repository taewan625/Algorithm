import java.util.Arrays;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        /*
        int len = right - left + 1;
        
        int[] intArr = new int[len];
        
        for(int i = 0; i < len; i++) {
            int innerLen = i + left;
            intArr[i] = innerLen;
            
            int count = 0;
            for(int j = 1; j <= innerLen; j++) if((innerLen) % j == 0) count++;
            answer += (count % 2 == 0) ? innerLen : -1 *(innerLen);
        }
        */
        
        // 기초 수학
        for (int i=left; i<=right; i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) answer -= i;
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else answer += i;
        }
        return answer;
    }
}