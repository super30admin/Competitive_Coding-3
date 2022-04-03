//Time Complexity : O(N^2)
//Space Complexity : O(N)


class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> arr =  new ArrayList<List<Integer>>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {        
            arr1.add(0,1);
            
            for(int j =1;j<arr1.size()-1;j++)
            {
                arr1.set(j,arr1.get(j)+arr1.get(j+1));
            }
            
            arr.add(new ArrayList<>(arr1));
        }
        
        return arr;
    }
    
}