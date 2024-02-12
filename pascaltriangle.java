// Time Complexity :O(m*n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// except for the for the first and last element of evry row the the number is the sum of exact top element and one left for that. 1st 2 rows all elements are 1.


// Your code here along with comments explaining your approachclass Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> a = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value = a.get(i - 1).get(j - 1) + a.get(i - 1).get(j);
                    row.add(value);
                }
            }

            a.add(row);
        }

        return a;
    }
}