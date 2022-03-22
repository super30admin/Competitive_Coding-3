//Time Complexity O(n^2)
//Space Complexity O(1)
//Leetcode tested

import java.util.ArrayList;
import java.util.List;

public class PasalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        result.add(row1);
        if(numRows == 1) return result;
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        result.add(row2);
        if(numRows == 2) return result;
        ArrayList<Integer> prevRow = row2;
        for(int i=0;i<numRows-2;i++){
            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j=0;j<prevRow.size()-1;j++){
                newRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            newRow.add(1);
            prevRow=newRow;
            result.add(prevRow);
        }
        return result;
    }
}
