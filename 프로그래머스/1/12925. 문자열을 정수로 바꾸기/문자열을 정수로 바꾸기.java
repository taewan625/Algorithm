class Solution {
    public int solution(String s) {
        int sLength = s.length();
        if(sLength < 1 || sLength > 5) return -999;
        /*
        int number = Integer.parseInt(numberString);
        
        Integer number = Integer.valueOf(numberString);
        int intValue = number.intValue();
        */
        return Integer.parseInt(s);
    }
}