class Solution { // O(n) O(n)
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer> key = new ArrayList<>(map.keySet());
        for(int i = 0; i < key.size(); i++){
            int num = key.get(i);
            if (k==0){
                if(map.get(num) > 1){
                    count++;
                }
            }
            else{
                if(map.containsKey(num+k)){
                    count++;
                }
            }
        }





        return count;





    }
}