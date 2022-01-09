// Time Complexity : O(N^2) where N is numRows given input
// Space Complexity : O(1) as we are returning the list and not using extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

// I used the dp solution to get each row by adding 1 at the starting and end 
// of each row and then calculating the elements in between by using element from
// previous row previous column and previous row and same col



class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

        if(numRows == 0) return returnList;

        returnList.add(new ArrayList<>(Arrays.asList(1)));

        for(int i = 1; i < numRows; i++)
        {
            List<Integer> temp = new ArrayList<>();

            temp.add(0,1);

            for(int j = 1; j < i; j++){
                temp.add(j,returnList.get(i-1).get(j-1)
                             + returnList.get(i-1).get(j));
            }

            temp.add(1);

            returnList.add(temp);
        }

        return returnList;
    }
}
