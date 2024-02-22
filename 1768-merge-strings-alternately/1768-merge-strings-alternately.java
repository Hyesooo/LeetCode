class Solution {
    public String mergeAlternately(String word1, String word2) {
        int iterSize = Math.max(word1.length(), word2.length());
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i<iterSize ; i++) {
            if(i < word1.length()) ans.append(word1.substring(i, i+1));
            if(i < word2.length()) ans.append(word2.substring(i, i+1));
        }

        return ans.toString();
    }
}