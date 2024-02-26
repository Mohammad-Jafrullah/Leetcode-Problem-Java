class Solution {
    public int lengthOfLongestSubstring(String s) {
        String NotRepeatingString = new String();
        int maxLen = 0, start = 0, end = 0;
        while(start < s.length()){
            int index = NotRepeatingString.indexOf(s.charAt(start));
            if(index != -1){
                NotRepeatingString = "";
                NotRepeatingString += s.charAt(++end);
                start=end+1;
                continue;
            }
            NotRepeatingString += s.charAt(start++);
            maxLen = Math.max(NotRepeatingString.length(), maxLen);
        }
        return maxLen;
    }
}
