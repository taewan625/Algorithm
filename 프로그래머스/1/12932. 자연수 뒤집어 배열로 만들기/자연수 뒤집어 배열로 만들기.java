// 다시 볼 문제
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        if(0 <n && n <= 10_000_000_000L) {
            int numLength = (n + "").length();
            int[] arr = new int[numLength];
            
            for(int i = 0; i < numLength; i++){
                arr[i] = (int)(n%10);
                n /=10L;
            }
            answer = arr;
        }
        return answer;
    }
}