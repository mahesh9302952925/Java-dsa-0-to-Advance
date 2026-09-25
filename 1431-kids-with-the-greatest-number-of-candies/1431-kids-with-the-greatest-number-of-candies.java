class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum  = 0;
        for(int i  = 0; i< candies.length; i++){
             if(sum<candies[i]){
                sum = candies[i];
             }
        }
        List <Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(sum > (candies[i]+extraCandies)){
                list.add(false);
            }else {
                list.add(true);
            }
        }
        return list;
    }
}