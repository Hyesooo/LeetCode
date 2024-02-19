class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl = 0;
        int sr = s.length()-1;
        
        int tl = 0;
        int tr = t.length()-1;
        
        if(s.length() == 0) return true;
        
        while(tl <= tr) {
            // left
            if(t.charAt(tl) == s.charAt(sl)) {
                sl++;
            }
            tl++;
            
            if(sl > sr) return true;
            
            //right
            if(t.charAt(tr) == s.charAt(sr)) {
                sr--;
            }
            tr--;
            
        }
        
        return false;
    }
}