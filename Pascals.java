//Time Complexity: O(n^2) n=numRows
//Space Complexity: O(n)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList();
        if(numRows==0){
            return res;
        }
        res.add(new ArrayList());
        res.get(0).add(1);
        if(numRows==1){
            return res;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> prev=res.get(i-1);
            List<Integer> li=new ArrayList();
            //res.add(new ArrayList());
            li.add(1);
            for(int j=1;j<prev.size();j++){
                li.add(prev.get(j)+prev.get(j-1));
            }
            li.add(1);
            res.add(li);
        }
        return res;
        
    }
}