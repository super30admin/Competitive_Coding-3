import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Pascal's Triangle
//Time Complexity : O(N^2)
//Space Complexity : O(N)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            //initialize the list for this row
            List<Integer> row = new ArrayList<>();
            //
            for(int j = 0; j <= i; j++){
            if(j == 0 || j == i )
            {
                //adding 1 
                row.add(1);
             }
            else{
                //adding the number from left up
                int left = list.get(i-1).get(j-1);
                //adding the number from right up
                int right = list.get(i-1).get(j);
                //add both left and right and add to row
                row.add(left+right);
            }
            }
            //add that row to the list
            list.add(row);
        }
        return list;
    }
}

//K-diff Pairs in an Array
//Time Complexity : O(N)
//Space Complexity : O(N)
class Solution1 {
    public int findPairs(int[] nums, int k) {
        //input map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        //Store in counter the number of pairs
        int count=0;
         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
         //store in a variable c the difference between k and the key   
         int c = entry.getKey()-k;
        //map contains key && key is greater than 0 increase count
        if(map.containsKey(c) && k>0){
             count++;   
         }
        //if k==0 and there are elements are repeated count it as 1
       else if(k==0 && entry.getValue()>1 )
           count++;
        }
        return count;
    }
}