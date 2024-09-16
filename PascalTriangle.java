// Time Complexity: O(numRows^2) // since we are iterating through each number in every row.
// Space Complexity: O(1) since we are not using any extra space other than output
// Leetcode: 118. Pascal's Triangle (Easy)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // In pacal triangle each row has values of form nCr where n=row-number and r ranges from 0 to n
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=Arrays.asList(1);
        lists.add(list);
        if(numRows==1)
            return lists;
        
        for(int i=1;i< numRows;i++)
        {
            list=new ArrayList<Integer>();
            // Always first element in a row is 1
            list.add(1);
            for(int j=1;j<i;j++)
            {
                // go to to above row and add elements at j-1 and jth index to get current row's element at jth index
                list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
            }
            // Always last element in a row is 1
             list.add(1);  
            
            lists.add(list);
             //System.out.println(list);
        }
        //System.out.println(lists);
        return lists;
    }
}