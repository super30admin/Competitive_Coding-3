/**
 * Time Complexity - O(n^2)
 * Space Complexity - O(1) other than the result List we are not using any extra space and as the "result" is the return statement, so it's not considered as a Space.
 */

import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>(i + 1));
            for(int j = 0; j <= i; j++) {
                result.get(i).add(0);

            }
        }

        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    result.get(i).set(j, 1);
                else {
                    result.get(i).set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }

            }

        }
        return result;
    }
}