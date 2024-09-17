package s30.arrays.interview;
// Time Complexity O(k^2) k being the number of rows for pascal's triangle
// Space Complexity O(1); As we are using output 2d array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>>  res = new ArrayList<>();

        List<Integer> prev = Arrays.asList(1);


        res.add(prev);
        int rowIndex =1;
        numRows--;

        while(numRows >=1){
            int j=0;
            int currIndex=0;

            List<Integer> curr = new ArrayList();

            while(j <= res.get(rowIndex-1).size()){

                int leftTop =  currIndex == 0 ? 0 : res.get(rowIndex-1).get(currIndex-1);

                int top = currIndex == res.get(rowIndex-1).size() ? 0 : res.get(rowIndex-1).get(currIndex);

                int sum = leftTop + top;

                curr.add(sum);

                currIndex++;
                j++;

            }

            res.add(curr);

            rowIndex++;
            numRows--;

        }

        return res;
    }
    public static void main(String[] args) {

    }
}
