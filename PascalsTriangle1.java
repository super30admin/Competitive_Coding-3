//https://leetcode.com/problems/pascals-triangle/
/*
Time Complexity: O(n^2)
Space Complexity: O(n^2)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class PascalsTriangle1 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); // first row is always 1
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1); // first element of any row is always 1

            List<Integer> prev = triangle.get(i - 1);

            // compute middle elements only
            for (int j = 1; j < i; j++) {
                cur.add(prev.get(j - 1) + prev.get(j));
            }

            cur.add(1);// last element of any row is always 1
            triangle.add(cur);

        }
        return triangle;
    }

}