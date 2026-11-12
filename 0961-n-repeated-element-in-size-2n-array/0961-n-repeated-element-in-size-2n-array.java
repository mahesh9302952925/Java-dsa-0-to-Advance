class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int num: nums){
            if(!map.add(num)){
                return num;
            }
        }
        return -1;
    }
}