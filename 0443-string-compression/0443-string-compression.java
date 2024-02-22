class Solution {
    public int compress(char[] chars) {
        char prev = '0';
        int cnt = 1;
        int i = 0;
        for(char c : chars) {
            if(prev != c) {
                if(cnt > 1) {
                    for(char value : Integer.toString(cnt).toCharArray()) {
                        chars[i++] = value;
                    }
                }
                chars[i++] = c;
                prev = c;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        if(cnt > 1) {
             for(char value : Integer.toString(cnt).toCharArray()) {
                chars[i++] = value;
            }
        }

        return i;
    }
}