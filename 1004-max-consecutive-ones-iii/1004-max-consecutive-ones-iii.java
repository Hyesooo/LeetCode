class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, max = 0, countZeros = 0;

        while(right < nums.length) {
            if(nums[right] == 0){
                countZeros++;
            }

            while(countZeros > k) {
                if(nums[left] == 0) {
                    countZeros--;
                }
                left++;
            }
            
            max = Math.max(max, right-left+1);
            right++;           


        }
        return max;
    }
}