class Solution {
    public int solution(int n) {
        int answer = 0;
        if(3 <= n && n <=1_000_000){
            while(n%(answer+1) != 1) answer++;
        }
        answer++;
        return answer;
    }
}