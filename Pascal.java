class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows<= 0) return result;
        if(numRows>= 1) {
            result.add(Arrays.asList(1));    
        }
        if(numRows >=2){
            result.add(Arrays.asList(1,1));
        }
        if(numRows>=3){
            for(int i=2; i<numRows; i++){
                result.add(new ArrayList<>());
                result.get(i).add(1);
                for(int j=1; j<=i-1; j++ ){
                    int temp= result.get(i-1).get(j-1)+ result.get(i-1).get(j); 
                    result.get(i).add(temp);
                }
                result.get(i).add(1);
            }    
        }
        return result;
    }
}
//time complexity- O(n^2)
//space - O(1)