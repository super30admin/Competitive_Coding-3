// Time Complexity : O(n^2)
// Space Complexity : O(1)
    // n is the given array.

// Your code here along with comments explaining your approach
    //We initialize the first row with just one number "1". Then, for all other rows, we put the sum of the 2 numbers("left" and "right") from the previous row.
    //For every iteration, we initalize left and right variables with "0". If arr[i-1][j-1] and arr[i-1][j] are in bounds, we reassign them to left and right respectively.
    //In each row, the number of integers depend on the row index itself(i+1). Every row just has one more integer than the previous row in it.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);
        for (int i=1; i<numRows; i++)
        {
            list = new ArrayList<>();
            for (int j=0; j<=i; j++)
            {
                int left = 0;
                int right = 0;
                if (j-1>=0)
                {
                    left = ans.get(i-1).get(j-1);
                }
                if (j<=i-1)
                {
                    right = ans.get(i-1).get(j);
                }
                list.add(left+right);
            }
            ans.add(list);
        }
        return ans;
    }
}