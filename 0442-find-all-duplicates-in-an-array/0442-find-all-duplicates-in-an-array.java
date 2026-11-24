class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList <>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) ==2) {
                list.add(key);
            }
        }
        return list;
    }
}