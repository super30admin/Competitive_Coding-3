//Time COmplexity : O(n^2)
// Space :O(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(new ArrayList<Integer>());
            List<Integer> curr = ans.get(ans.size()-1);
            curr.add(1);
            if(i>1){
                List<Integer> prev = ans.get(ans.size()-2);
                for(int j=1;j<i-1;j++){
                  int val = prev.get(j-1) + prev.get(j);
                  curr.add(val);
              }
                curr.add(1);
            }
             
        }
        return ans;
    }
}