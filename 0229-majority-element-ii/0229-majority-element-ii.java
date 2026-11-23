class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> list = new ArrayList<>();
      HashMap<Integer, Integer> map = new HashMap<>();
        int n  = nums.length/3;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n) {
                list.add(key);
            }
        }

        return list;
    }
}