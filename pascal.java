class Solution {
    public List<List<Integer>> generate(int numRows) {
      
      //TC:O(mn) SC: O(n)
        List<List<Integer>> result =new ArrayList<>();
        
         for(int row=0;row<numRows;row++){
            List<Integer> temp=new ArrayList<>();
             for(int col=0;col<=row;col++){
              if(col==0 ||col==row)
                temp.add(1);
                 else{
                     temp.add(result.get(row-1).get(col-1)+result.get(row-1).get(col));
                }
             }
             result.add(temp);
         }
        
        return result;
    }
}
