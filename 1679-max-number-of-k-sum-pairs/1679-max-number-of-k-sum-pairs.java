class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        int ans = 0;
        
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k){
                ans += 1;
                left++;
                right--;
            }
            else if(sum < k) {
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}

// 3 1 3 5
// 1 3 3 4