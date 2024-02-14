//Time Complexity = O(numsRow)
//Space Complexity = O(numsRow * numsRow+1) // Creating array/list inside to add to final result set.
// Does it run on LeetCode successfully? : Yes
// Any difficulties: Handling it with HashSet. Num+Target and Num-Target

/*
Row is i+1 ==> row(i)(j-1) + row(i)(j)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<List<Integer>>(numRows);
        if(numRows == 1){
            results.add(Arrays.asList(1));
            return results;
        }
        if(numRows == 2) {
            results.add(Arrays.asList(1));
            results.add(Arrays.asList(1,1));
            return results;
        }

        results.add(Arrays.asList(1));
        results.add(Arrays.asList(1,1));

        for(int i=2;i<numRows; i++){
            Integer[] arr = new Integer[i+1];
            arr[0]=1; arr[arr.length-1] = 1;
            for(int j=1;j<arr.length-1; j++){
                arr[j] = results.get(i-1).get(j) + results.get(i-1).get(j-1);
            }
            results.add(new ArrayList<Integer>(Arrays.asList(arr)));
                        // Arr can not be primitive array.
                        // It has to be object Integer in order to work with Arrays.asList.
                        // It doesn't automatically Typecast.
        }
        return results;
    }

    public static void main(String[] args){
        PascalTriangle obj = new PascalTriangle();
        obj.generate(4);
    }
}