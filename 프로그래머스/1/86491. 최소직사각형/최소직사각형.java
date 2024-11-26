class Solution {
    public int solution(int[][] sizes) {
        //짧은 면 중 가장 긴 길이
        int shortPartLongest = 0;
        //길면 중 가장 긴 길이
        int longPartLongest = 0;

        //한쪽을 최대한 길게
        for (int[] size : sizes) {
            int shortPart = Math.min(size[0], size[1]);
            int longPart = Math.max(size[0], size[1]);

            if (shortPartLongest < shortPart) shortPartLongest = shortPart;
            if (longPartLongest < longPart) longPartLongest = longPart;
        }

        return longPartLongest * shortPartLongest;
    }
}