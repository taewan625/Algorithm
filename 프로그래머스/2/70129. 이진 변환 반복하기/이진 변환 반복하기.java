class Solution {
   public int[] solution(String s) {
        //제거된 O의 수
        int removeZeroCount = 0;
        //변경 횟수
        int tryCount = 0;

        //길이 유효성
        if (s.isEmpty() || 150000 < s.length()) {
            return null;
        }

        //최종 문자열이 1이 아닌 경우 반복 loop 돌기
        while (!"1".equals(s)) {
            //0을 제거한 후 길이
            int afterRemoveZeroLength = 0;

            //0 제거 및 2진법 처리
            for (String str : s.split("")) {
                //제거된 0의 개수 구하기
                if ("0".equals(str)) {
                    removeZeroCount++;
                    continue;
                }

                //0을 제거한 후 길이 추가
                afterRemoveZeroLength += 1;
            }

            //변경 횟수 추가
            tryCount++;

            //2진법 처리
            s = Integer.toBinaryString(afterRemoveZeroLength);
        }

        //[1이 될때까지 회차, 제거된 0의 개수]
        return new int[]{tryCount, removeZeroCount};
    }
}