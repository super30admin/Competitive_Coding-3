import java.util.ArrayList;
import java.util.List;

/*
Time Complexity -> O(n*n)
Space Complxity -> O(N)
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> previousArr = new ArrayList<>();
        previousArr.add(1);
        result.add(previousArr);
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentArr = new ArrayList<>();
            currentArr.add(1);
            for (int j = 1; j < previousArr.size(); j++) {
                currentArr.add(previousArr.get(j - 1) + previousArr.get(j));
            }
            currentArr.add(1);
            result.add(currentArr);
            previousArr = currentArr;
        }

        return result;

    }
}