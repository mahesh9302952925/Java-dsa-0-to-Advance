class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right = 0;
        int []arr = new int [nums.length];
        int left = 0; 
        for(int i : nums){
            right = right + i;
        }
        for(int i = 0; i < nums.length; i++){
            right = right -nums[i];
            arr[i] = Math.abs(left-right);
            left = left+nums[i];
        }
        return arr;
    }
}