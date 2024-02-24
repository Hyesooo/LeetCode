class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefixSums = new int[gain.length];

        prefixSums[0] = gain[0];
        for(int i=1 ; i<gain.length ; i++) {
            prefixSums[i] = prefixSums[i-1] + gain[i];
        }

        return Math.max(Arrays.stream(prefixSums).max().getAsInt(), 0);
    }
}