class Solution {
    public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int output = 0;
    for(int i: nums){
        if(map.containsKey(i)){
            //Handling if k=0
            if(k == 0 && map.get(i) == 1)
                output++;
            map.put(i, map.get(i)+1);
        } else{
            if(map.containsKey(i-k))
                output++;
            if(map.containsKey(i+k))
                output++;
            map.put(i, 1);
        }
    }
    return output;
    }
}







Mark Pillagolla_RN02MAY2021  4:02 PM
For pascal's, I'm not able to come up with a solution better than O(n^2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        if(numRows==0){
            return res;
        }
        row.add(1);
        res.add(row);
        if(numRows==1){
            return res;
        }
        for(int i=2;i<=numRows;i++){
            row = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }else{
                    row.add(res.get(i-2).get(j)+res.get(i-2).get(j-1));
                }
            }
            res.add(row);
        }
        return res;
    }
}