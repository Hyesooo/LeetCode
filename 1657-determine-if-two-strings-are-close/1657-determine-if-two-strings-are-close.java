class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : word1.toCharArray()) {
            map1.merge(c, 1, Integer::sum);
        }
        for(char c : word2.toCharArray()) {
            map2.merge(c, 1, Integer::sum);
        }

        if(!map1.keySet().equals(map2.keySet())) return false;

        Integer[] arr1 = map1.values().toArray(new Integer[0]);
        Arrays.sort(arr1);

        Integer[] arr2 = map2.values().toArray(new Integer[0]);
        Arrays.sort(arr2);

        if(arr1.length != arr2.length) return false;

        for(int i = 0 ; i<arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
// cabbba abbccc
// map[a] = 2   
// map[b] = 3
// map[c] = 1

// map[a] = 1
// map[b] = 2
// map[c] = 3