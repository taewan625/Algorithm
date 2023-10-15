// import static java.util.Arrays.*;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        /*
        return stream(arr)
            .filter(factor -> factor!= stream(arr).min().getAsInt())
            .toArray();
        */
        
        int length = arr.length;
        int minIndex = 0;
        
        for(int i = 1 ; i < length ; i++) 
            minIndex = (arr[minIndex] < arr[i]) ? minIndex : i;
        
        int[] answer = new int[length -1];
        
        for(int i = 0; i < minIndex; i++) answer[i] = arr[i];
        for(int i = minIndex; i < length-1; i++) answer[i] = arr[i+1];
        return answer;
    }
}