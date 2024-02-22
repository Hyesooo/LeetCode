class Solution {
    public String reverseWords(String s) {
        String[] targetS = Arrays.stream(s.trim().split(" "))
                            .filter(str -> !str.isBlank())
                            .toArray(String[]::new);

                        
        StringBuilder ans = new StringBuilder();
        for(int i = targetS.length-1 ; i >= 0; i--) {
            ans.append(targetS[i]);
            ans.append(" ");
        }

        if(ans.length() > 0) ans.deleteCharAt(ans.length()-1);

        return ans.toString();
    }
}