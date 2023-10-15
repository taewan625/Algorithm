import java.util.Arrays;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int len = right - left + 1;
        
        int[] intArr = new int[len];
        
        for(int i = 0; i < len; i++) {
            int innerLen = i + left;
            intArr[i] = innerLen;
            
            int count = 0;
            for(int j = 1; j <= innerLen; j++) if((innerLen) % j == 0) count++;
            answer += (count % 2 == 0) ? innerLen : -1 *(innerLen);
        }

        return answer;
    }
}