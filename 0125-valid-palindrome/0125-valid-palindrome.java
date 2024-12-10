class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().trim()
                    .replaceAll("[^a-z0-9]", "")
                    .toCharArray();

                
        int i = 0;
        int j = charArray.length-1;

        if(charArray.length < 2) return true;
        while(i < j) {
            if(charArray[i] != charArray[j]) {
                System.out.println("i : " + i + "j : " + j);
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}