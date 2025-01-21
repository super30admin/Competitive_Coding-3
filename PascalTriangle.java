import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    // Time Complexity: O(N^2)
    // Space Complexity: O(N^2)
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1){
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> temp = new ArrayList<>(Arrays.asList(1));
       res.add(temp);
    return res;
        }
        if (numRows ==2){
             List<List<Integer>> res = new ArrayList<>();
        res.add (new ArrayList<Integer>(Arrays.asList(1))); 
        res.add (new ArrayList<Integer>(Arrays.asList(1,1)));
    return res;
        }
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> temp = new ArrayList<>(Arrays.asList(1));
        res.add(temp);
        res.add (new ArrayList<Integer>(Arrays.asList(1,1)));
       for ( int i =3;i<= numRows;i++){
             ArrayList<Integer> tempArr = new ArrayList<>();
            int pos =0;
            for (int j = 1;j<= i;j++){
           if (j == 1){
            tempArr.add(1);
            continue;
           }
           if ( j == i){
            tempArr.add(1);
            res.add(tempArr);
            break;
            }
            List<Integer> tempArr2 = res.get(res.size()-1);
            tempArr.add(tempArr2.get(pos)+tempArr2.get(pos+1));
            pos++;
        
            }
        }
        return res; 
    }
}