class Solution {
    public void moveZeroes(int[] nums) {
        int endPointer = nums.length-1;
        int i = 0;
        
        while(i <= endPointer) {
            if(nums[i] == 0){
                for(int j = i ; j < endPointer; j++) {
                    nums[j] = nums[j+1];
                }
                nums[endPointer] = 0;
                endPointer--;
                continue;
            }
            i++;
        }
    }
}