class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<>();

        if(numRows == 0){
            return pascal;
        }

        for(int i =0 ; i < numRows; i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    int left = pascal.get(i-1).get(j-1);
                    int right = pascal.get(i - 1).get(j);
                    list.add(left + right);
                }
                
            }
            pascal.add(list);
        }
        return pascal;
    }
}