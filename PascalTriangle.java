import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<= i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> aboveRow = triangle.get(i-1);
                    System.out.println("above row" +aboveRow);
                    int element = aboveRow.get(j-1) + aboveRow.get(j);
                    row.add(element);
                }

            }
            triangle.add(row);

        }
        return triangle;
    }
}