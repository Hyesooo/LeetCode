class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i=0; i<k ;i++) {
            sum += nums[i];
        }
        int max = sum;

        for(int i=0 ; i<nums.length-k ; i++) {
            sum = sum - nums[i] + nums[i+k];
            if(sum > max) max = sum;
        }

        return (double) max/k;
    }
}