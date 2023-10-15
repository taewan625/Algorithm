import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        // int indexNum = seoul.length;
        // for (int i = 0; i < indexNum; i++) {
        //     if (seoul[i].equals("Kim")) return "김서방은 " + i + "에 있다";
        // }
        int i = Arrays.asList(seoul).indexOf("Kim");   
        return "김서방은 " + i + "에 있다";
    }
}