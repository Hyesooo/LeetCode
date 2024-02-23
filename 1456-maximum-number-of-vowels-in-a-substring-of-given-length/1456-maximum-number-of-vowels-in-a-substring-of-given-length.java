class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        
        int maxCount = 0;
        int count = 0;
        
        for(int i=0 ; i<k ; i++) {
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        maxCount = count;

        for(int i=1 ; i<=s.length()-k ; i++) {
            if(set.contains(s.charAt(i-1))){
                count--;
            }
            if(set.contains(s.charAt(i+k-1))){
                count++;
            }

            maxCount = Math.max(maxCount, count);
         }
        return maxCount;
    }
}