//Timecomplexity :o(n2)
//spacecomplexity: o(n2)
//Pascal triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int index=0;
        if(numRows==1){
            result.add(Arrays.asList(1));
        }else{
            result.add(0,Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> rows = new ArrayList<>(i);
            rows.add(1);
            List<Integer> prev = result.get(i-1);
            for(int j=0;j<prev.size()-1;j++){
               rows.add(prev.get(j)+prev.get(j+1));
            }
            rows.add(1);
            result.add(rows);
            } 
            }
        return result;
       
    }
}