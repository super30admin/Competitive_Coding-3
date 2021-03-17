/**
**/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> rowList=new ArrayList<>();
            
            if(i==0){
                rowList.add(i+1);
            }
            else{
                List<Integer> temp=result.get(i-1);
                System.out.println(temp);
                rowList.add(1);
                if(i!=1){
                    for(int j=0;j<temp.size()-1;++j)
                    {
                    rowList.add(temp.get(j)+temp.get(j+1));
                    }
                }
                rowList.add(1);
            }
            
            result.add(rowList);
        }
        
        return result;
    }
}
