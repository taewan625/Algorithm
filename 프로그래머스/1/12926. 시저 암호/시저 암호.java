class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            //공백일 경우
            if (Character.isSpaceChar(c)) {
                answer.append(c);
                continue;
            }

            //시저 암호한 값
            int caesarCipher = (int) c + n;

            //대문자이고 Z보다 크거나 소문자이고 z보다 큰 경우
            if ((Character.isUpperCase(c) && (int) 'Z' < caesarCipher) || (Character.isLowerCase(c) && (int) 'z' < caesarCipher)) {
                caesarCipher -= 26;
            }
            
            //시저 암호 데이터 넣기
            answer.append((char) caesarCipher);
        }

        return answer.toString();
    }
}