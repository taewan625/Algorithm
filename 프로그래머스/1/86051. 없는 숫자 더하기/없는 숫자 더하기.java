import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        /*
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
            return Arrays.stream(numArr)
                    .filter(factor -> Arrays.stream(numbers)
                            .noneMatch(number -> number == factor))
                    .sum();
        */    
        return 45 - Arrays.stream(numbers).sum();
    }
}