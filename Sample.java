//https://leetcode.com/problems/pascals-triangle-ii
// Time Complexity : 
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> row = new ArrayList<>();
        row.add(1); // adding 1 as initial row
        List<Integer> temp = new ArrayList<>();
        
        for(int i=1;i<rowIndex+1;i++) // traversing till the row index we want
        {
            temp.addAll(0,row); // add the last row to temp
            row.clear(); // clear the current row
            
            row.add(1); // add 1 to the row list
            
            for(int j=1; j<i; j++) // traverse till the rowindex as that many pairs are possible
            {
                row.add(temp.get(j-1) + temp.get(j)); // add sum of pairs to row list
            }
            
            row.add(1); // add one
            temp.clear(); // clear the temp( prev row list)
        }
        
        return row; // return the row formed at rowIndex
    }
}


class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<>();
        
        row.add(1); 
      
        if(rowIndex==0) 
            return row;
       
      return helper(1, rowIndex, row, new ArrayList<Integer>()); // call function
    }
    
    private List<Integer> helper(int i, int rowIndex, List<Integer> row,
                                List<Integer> temp)
    {
       
        if(i>rowIndex) // invalid
            return new ArrayList<Integer>();
        
        temp.addAll(0,row);
        row.clear();
        row.add(1);
        for(int j=1;j<i;j++)
            row.add(temp.get(j-1)+temp.get(j));
        
        row.add(1);
        temp.clear();
        
        helper(i+1, rowIndex, row, temp);
        
        return row;
    }
}

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) // creating a hashmap with the count of each unique value in array
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        
        int count = 0;
        
        for(int i: map.keySet()) // traverse the hasmap keys
        {
            if(k>0)
            {
            int sum = i + k; // if the sum is found in hashmap, we found a pair
            
            if(map.containsKey(sum))
                count++; // increase count
            }
            else if(k==0) // if k=0 special case
            {
                if(map.get(i) > 1) // then consider the values that appear more than once
                    count++;
            }
            
        }
        return count;
    }
}

class Solution {
    public int findPairs(int[] nums, int k) {
         Arrays.sort(nums);
        
         int i = 0;
         int j = 0;
         int n = nums.length;
         int count = 0;
        while(i<n && j<n)
        {
            if(nums[j] - nums[i] < k || i == j)
                j++;
            else if(nums[j] - nums[i] > k)
                i++;
            else if (nums[j] - nums[i] == k)
            {
               count++;
                i++;
                j++;
                while(j<n && nums[j] == nums[j-1])
                    j++;
                
            }
            
        }
        return count;
    }
}