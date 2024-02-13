class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= a) {
                a = num; // a = 0;
            } else if (num <= b) {
                b = num; // b = 5;
            } else {
                return true;
            }
        }
        
        return false;
    }
}