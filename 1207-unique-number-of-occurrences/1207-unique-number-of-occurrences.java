class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurMap = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num : arr){
            occurMap.merge(num, 1, Integer::sum);
        }

        for(int occ : occurMap.values()) {
            countMap.merge(occ, 1, Integer::sum);
        }

        for(int cnt : countMap.values()) {
            if(cnt > 1) return false;
        }

        return true;
    }
}