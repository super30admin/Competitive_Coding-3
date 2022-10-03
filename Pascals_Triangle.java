// TC : O(n^2)
// SC : O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(temp);
        
        if(n == 1)
            return result;
        
        for(int i = 1; i < n; i++) {
            temp = result.get(i - 1);
            List<Integer> temp1 = new ArrayList<>();
            for(int j = 0; j <= temp.size(); j++) {
                if(j == 0 || j == temp.size())
                    temp1.add(1);
                else
                    temp1.add(temp.get(j - 1) + temp.get(j));
            }
            result.add(temp1);
        }
        
        return result;
        
    }
}
