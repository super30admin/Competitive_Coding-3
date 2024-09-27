class Solution {
    public List<List<Integer>> generate(int numRows) {
        
     if( numRows == 0)
         return new ArrayList<List<Integer>>();
        
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        if(numRows==1){
            temp.add(1);
            result.add(temp);
            return result;
        }
        
        temp.add(1);
        result.add(temp);
        
        while(numRows-1>0){
            //System.out.println(result.size());
            temp=result.get(result.size()-1);
            int m=temp.size();
            
            List<Integer> li= new ArrayList<>();
            li.add(1);
            for(int i=0;i<m-1;i++){
               li.add(temp.get(i)+temp.get(i+1));
            }
            li.add(1);
            
            result.add(result.size(),li);
            
            numRows--;
        }
    return result;
    }
}