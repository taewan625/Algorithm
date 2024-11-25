class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int tLength = t.length();
        int pLength = p.length();

       

        //부분 문자열이 나올만큼 반복
        for (int i = 0; i < tLength - pLength + 1; i++) {
            //부분 문자열 구하기
            String subString = t.substring(i, i + pLength);

            //부분 문자열이 p보다 작거나 같은 경우
            if (subString.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}