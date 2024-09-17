// Time Complexity : O(n^2)
// Space Complexity :O(n)

/*
 * create new arraylist for each level and add the elements from
 * previous row. at the end of each row add the array list to 
 * result.
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {   
            
            li.add(0, 1);
            for(int j=1;j<li.size()-1;j++)
                li.set(j, li.get(j)+li.get(j+1));
            res.add(new ArrayList<Integer>(li));
        }
        return res;
        
    }
}