class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i = 1; i < numRows; i++){
            List<Integer> previousRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    currentRow.add(1);
                } else{
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }
            result.add(currentRow);
        }
        return result;
    }
}
