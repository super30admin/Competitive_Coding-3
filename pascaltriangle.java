//Time complexity is O(N) N is number of total elements 
//Space complexity is O(N) N is number of total elements 

class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> list = new ArrayList<>();
      
      for(int i = 0; i < numRows; i++){
        List<Integer> newRow = new ArrayList<>();
        
        if(i == 0){
          newRow.add(1);
          list.add(newRow);
          continue;
        }
        
        List lastRow = list.get(i - 1);
        
        for(int j = 0; j < i + 1; j++){
            Integer a = (j - 1) < 0 ? 0 : (Integer)lastRow.get(j - 1);
            Integer b = j > lastRow.size() - 1 ? 0 : (Integer)lastRow.get(j);
            
            
            newRow.add(a + b);
        }
        
        list.add(newRow);
        
      }
      
      
      return list;
    
    }
}