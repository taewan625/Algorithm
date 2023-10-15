import java.util.*;

class Solution {
    public boolean solution(int x) {
        if(x < 1 || x > 10_000) return false;
        
        int sumNum = 0;
        
        String[] list = String.valueOf(x).split("");
        for(String num : list) sumNum += Integer.parseInt(num);
        
        // int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        
        return (x % sumNum == 0);
    }
}