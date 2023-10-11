class Solution {
    public long solution(long n) {
        if(n < 1 || n > 50000000000000L) return -99999L;
        
        long num = (long)Math.sqrt(n);
        if(num*num == n) return (num+1)*(num+1);
        return -1;
    }
}