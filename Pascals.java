import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i< numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<=i ;j++){
                if(j==0 || j == i){
                    row.add(1);
                }else{
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
                result.add(row);  
        }
        return result;
    }
}