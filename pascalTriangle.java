//Time Complexity: O(n^2)
//Space Complexity: O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int i=0;
        List<List<Integer>> result = new ArrayList<>();
        
        
        if(numRows == 0) return result;
        
        while(i < numRows){
            int j = 0;
            List<Integer> li = new ArrayList<>();
            while(j <= i){
                if(j == 0 || j == i){
                    li.add(1);
                } else{
                    if(i >= 2){
                        int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                        li.add(sum);
                    }
                }
                j++;
            }
            result.add(li);
            i++;
        }
        
        return result;
    }
}