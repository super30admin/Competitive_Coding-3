// Time Complexity : O(nk)->for rows and cols
// Space Complexity : O(k)->for columns
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if(numRows <= 0)
            return pascalTriangle;
        //adding 1 to the first row of pascal triangle
        List<Integer> first = new ArrayList<>();
        first.add(1);
        //adding 1 to the triangle
        pascalTriangle.add(first);
        //i->rows, j->columns
        for (int i = 2; i <=numRows ; i++)
        {
            //to storing the values of present row
            List<Integer> presentRow = new ArrayList<>();
            //adding 1 to the presentrow in the first and last position
            presentRow.add(1);
            //as we are adding 1 at 0 and last position, we go with j-1 and i<i
            for (int j = 0 ; j < first.size()-1 ; j++)
            {
                //to the present row, adding some of previous rows
                presentRow.add(first.get(j)+first.get(j+1));
            }
            //after iterating upto i-1 times
            //we add 1 in the last position
            presentRow.add(1);
            //and we add the present row to the pascal triangle
            pascalTriangle.add(presentRow);
            first = presentRow;
        }

        return pascalTriangle;

    }
        
}