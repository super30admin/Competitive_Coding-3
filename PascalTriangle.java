//Time complexity: O(n**2)
//Space complexity: O(n)
//Executed on leetcode.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=list.size();j++)
            {
                if(j==0 || j==list.size())          //to build the pascal triangle taking element from the previous row. but adding 1 to first and last element for the present list. rest elements are store by the sum of previous row same column and before column value and adding to the list.
                    temp.add(1);
                else
                    temp.add(list.get(j-1)+list.get(j));
            }
            result.add(temp);
            list = temp;
        }
        
        return result;
    }
}