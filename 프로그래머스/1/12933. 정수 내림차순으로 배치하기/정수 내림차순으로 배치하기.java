import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        if (n < 1 || n > 8000000000L) return -99999L;
        List<Long> list = new ArrayList<>();

        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());
        
        Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            answer = answer * 10 + iterator.next();
        }
        return answer;
    }
}