class Solution {
    public int solution(int[][] sizes) {
        //짧은 면 중 가장 긴 길이
        int shortPartLongest = 0;
        //길면 중 가장 긴 길이
        int longPartLongest = 0;

        //한쪽을 최대한 길게
        for (int[] size : sizes) {
            int width = size[0];
            int length = size[1];

            int shortPart;
            int longPart;

            if (width < length) {
                shortPart = width;
                longPart = length;
            } else {
                shortPart = length;
                longPart = width;
            }

            if (shortPartLongest < shortPart) shortPartLongest = shortPart;
            if (longPartLongest < longPart) longPartLongest = longPart;
        }

        return longPartLongest * shortPartLongest;
    }
}