class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> dupSets = new HashSet<>();
        for(int num : set1) {
            if(set2.contains(num)) {
                dupSets.add(num);
            }
        }

        set1.removeAll(dupSets);
        set2.removeAll(dupSets);

        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}