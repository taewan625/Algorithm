class Solution {
    public String solution(String phone_number) {
        /*
        String answer = "";
        int length = phone_number.length()-4;
        
        for(int i=0; i<length; i++)answer += "*";
        return answer + phone_number.substring(length);
        */
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < chars.length-4; i++) chars[i]= '*';
        return String.valueOf(chars);
    }
}