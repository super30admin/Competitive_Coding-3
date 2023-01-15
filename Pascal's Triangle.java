//Time Complexity = O(N^2)
// Space Complexity = O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> listIterator = new ArrayList<>();
        
        for (int i = 0; i<numRows; i++){
            List <Integer> currentRow = new ArrayList<>();
            if(i == 0) {
                currentRow.add(1);
            }
            else if(i == 1){
                currentRow.add(1);
                currentRow.add(1);Í
            }
            else{     
                currentRow.add(1);
                for(int j = 1; j<listIterator.get(i-1).size(); j++){
                    int currValue = listIterator.get(i-1).get(j) +listIterator.get(i-1).get(j-1); 
                    currentRow.add(currValue);
                }
                currentRow.add(1);
            }
            
            listIterator.add(currentRow);
        }
    return listIterator;
    }
}