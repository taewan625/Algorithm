// stream으로 풀어보기
class Solution {
    boolean solution(String s) {
        int sl = s.length();
        if(sl < 0 || sl > 50) return false;
        
        String ls = s.toLowerCase();
        int count = 0;
        
        for(int i = 0; i < sl; i++){
            count += (ls.charAt(i) == 'p') ? 1 : 0;
            count -= (ls.charAt(i) == 'y') ? 1 : 0;
        }

        return count == 0 ;
    }
}