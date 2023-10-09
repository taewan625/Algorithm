class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        if(x<-10000000 || x > 10000000) return answer;
        if(n < 1 || n > 1000) return answer;
        
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = (long)x*(i+1);
        answer = arr;
        
        return answer;
    }
}