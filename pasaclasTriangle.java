// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes I was getting wrong solution. my error was in second for loop

import java.util.*;

class Main {
    public static List<List<Integer>> generate(int numRows) {

        // to store the result
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // to store previous Row in the pascal's triagnle as current rows value are sum
        // of left and right element of the previous row
        List<Integer> prevRow = new ArrayList<>();
        // to store current row
        List<Integer> currRow = new ArrayList<>();

        // for the first row we are adding element in the first row
        currRow.add(1);
        result.add(currRow);
        prevRow = currRow;

        // here i am using for loop to traverse through each row
        for (int i = 1; i < numRows; i++) {
            currRow = new ArrayList<>();
            // at each row I will add a to the row in front
            currRow.add(1);

            // main logic
            // sum from the previous row's left element and right element
            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                // add sum to the current row
                currRow.add(sum);
            }
            // at each row I will add a to the row in end
            currRow.add(1);
            // make currentRow as a previous row
            prevRow = currRow;
            // add currRow in result
            result.add(currRow);
        }
        // return result
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}