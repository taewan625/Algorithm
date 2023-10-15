class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length()-4;
        
        for(int i=0; i<length; i++)answer += "*";
        return answer + phone_number.substring(length);

    }
}