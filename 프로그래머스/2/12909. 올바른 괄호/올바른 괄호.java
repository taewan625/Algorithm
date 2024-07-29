class Solution {
        boolean solution(String s) {
        //결과값
        boolean answer = true;

        //유효성 검사 통과 실패 시
        if(100000 < s.length()) {
            answer = false;

        }
        //유효성 검사 통과 시
        else {
            int cnt = 0;

             /* 다른 방식
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ')' ){}
            }
             */
            
            //문자열1개씩 분리
            for (String part : s.split("") ) {
                //-부호가 나오면 바로 false
                if (cnt < 0) {
                    answer = false;
                    break;
                }
                
                //끝까지 갔는데 0이 아니면 false
                if("(".equals(part)){
                    cnt++;
                }
                else if(")".equals(part)){
                    cnt--;
                }
            }
            answer = (cnt ==0);
        }

        return answer;
    }
}