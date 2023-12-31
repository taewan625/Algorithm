class Solution {
    public int solution(int n) {
        int answer = 0;
        if ( !(0 <= n && n <= 3000)) {
            return -99999;
        }
        /* 결론 : 1부터 나누는 수까지 나누었을 경우 나머지가 0인 몫 만 더하기
        5 / 1 = 5 , 0;
        5 / 2 = 2 , 1;
        5 / 3 = 1 , 2;
        5 / 4 = 1 , 1;
        5 / 5 = 1 , 0;
            
        12 / 1  = 12 , 0;
        12 / 2  = 6 , 0;
        12 / 3  = 4 , 0;
        12 / 4  = 3 , 0;
        12 / 5  = 2 , 2;
        12 / 6  = 2 , 0;
        12 / 7  = 1 , 5;
        12 / 8  = 1 , 4;
        12 / 9  = 1 , 3;
        12 / 10 = 1 , 2;
        12 / 11 = 1 , 1;
        12 / 12 = 1 , 0;
        */
        for(int i = 1; i <= n; i++) if (n%i == 0) answer += (n/i);

        return answer;
    }
}

