class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<numRows;i++) {
            List<Integer> eachRow = new ArrayList<>();
            for(int j =0; j<i+1;j++) {

                if(j==0 || j==i){
                    eachRow.add(1);
                } else {
                    int topLeft=answer.get(i-1).get(j-1);
                    int topRight = answer.get(i-1).get(j);
                    eachRow.add(topLeft+topRight);
                }
            }
            answer.add(eachRow);
        }
        return answer;
    }
}