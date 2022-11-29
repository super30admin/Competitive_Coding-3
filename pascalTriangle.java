// Time Complexity : O(n*n)
// Space Complexity :O(1) 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return res;
        int i=0;
        while(i<numRows){
            if(i==0){
                res.add(Arrays.asList(1));
                i++;
                continue;
            }
            if(i==1){
                res.add(Arrays.asList(1,1));
                i++;
                continue;
            }
           
            List<Integer> list=new ArrayList<>();
            list.add(0,1);
           
            for(int j=1;j<i;j++){
                List<Integer> temp= res.get(i-1);
                int sum= temp.get(j-1) + temp.get(j);
                list.add(j,sum);
            }
            list.add(i,1);
            res.add(list);
            i++;
        }
        return res;
    }
}