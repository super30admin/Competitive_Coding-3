// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        //Output arraylist
        List<List<Integer>> ans = new ArrayList<>();
        
        if(numRows==0)
            return ans;
        
        ans.add(new ArrayList<>());
      
        //First row will always have a single element as "1" 
        ans.get(0).add(1);
        
        //From 2nd row, the first and last element will be "1" 
        for(int rowNum=1;rowNum<numRows;rowNum++){
            
            //Everytime we will create a new list
            List<Integer> row = new ArrayList<>();
          
            //For the processing of element, we need the lements from the row above, so we will store it in another list
            List<Integer> prevRow = ans.get(rowNum-1);
            
            //First elemnt of every row will be 1
            row.add(1);
            
            //Checking the Jth and (j-1)th element from previous row for the value
            for(int j=1;j<rowNum;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            
            //Last element of every row will be 1
            row.add(1);
            
            //Finally we will add the new row in our output list
            ans.add(row);
        }
        
        return ans;
    }
}



// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Got confused with the case where the k==0


// Your code here along with comments explaining your approach



class Solution {
    public int findPairs(int[] nums, int k) {
     int ans = 0;
     if(k<0)
         return ans;
        //Create hashset, one to keep straight entry and other to reverse entry
        Set<Integer> set1 = new HashSet<Integer> ();
        Set<Integer> set2 = new HashSet<Integer> ();
        //For the special case of k=0
        if(k==0){
                for(int i=0;i<nums.length;i++){
                    //we will check does this element already exists in hashset
                    if(!set1.contains(nums[i])){
                            set1.add(nums[i]);
                        }
                    else{
                        //if contains then we will remove that elemnt from first set
                            set1.remove(nums[i]);
                            if(!set2.contains(nums[i]))
                                ans++;
                            set2.add(nums[i]);
                        }
                }
        }
        else{
            for(int i=0;i<nums.length;i++){
                //Here set will take care of duplicate element on its own
                set1.add(nums[i]);
                set2.add(nums[i]+k);
            }
            //Now this well check for the complement exists or not
            set1.retainAll(set2);
            ans = set1.size();
        }
        return ans;
    }
}
