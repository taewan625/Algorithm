import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int arrLength = arr.length;
        
        if(arrLength < 1 || arrLength >100) return -999;
        
        for(int i : arr) if(i <-10_000 || i > 10_000) return -999;
        
        // for(int i : arr ) answer += i;
        // answer = answer/arrLength ;
        
        // OptionalDouble average = Arrays.stream(arr).average();
        answer = Arrays.stream(arr).average().getAsDouble();
        
        return answer;
    }
}