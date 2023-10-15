import static java.util.Arrays.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        return stream(arr)
            .filter(factor -> factor!= stream(arr).min().getAsInt())
            .toArray();
    }
}