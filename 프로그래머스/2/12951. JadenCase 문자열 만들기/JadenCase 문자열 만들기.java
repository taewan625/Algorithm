class Solution {
    public static String solution(String s) {
        //문자열 담는 변수
        StringBuilder answer = new StringBuilder();

        //첫문자 여부 판독기
        boolean skip = false;

        //전부 소문자로 변환 후 작업 시작
        for (char spell : s.toLowerCase().toCharArray()){
            //숫자 이후 혹은 대문자 이후 문자 로직 처리
            if (skip || spell == ' ') {
                //숫자 이후 처음 공백 만나는 경우
                if(spell == ' ') {
                    skip = false;
                }
            }
            //첫 문자가 숫자인 경우
            else if (Character.getNumericValue(spell) < 10) {
                skip = true;
            }
            //첫 문자가 문자인 경우
            else {
                skip = true;
                //대문자로 변환
                spell = Character.toUpperCase(spell);
            }

            //문자를 담는다.
            answer.append(spell);
        }

        //문자열 반환
        return answer.toString();
    }
}