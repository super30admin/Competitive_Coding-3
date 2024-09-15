// Time Complexity : O(n) where n is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//if input is 0, return empty list
//always 1 will be the first row, sow e can add it as first list
//loop for the remaining length of nums, initialize an arraylist for each row
//the first and last element will always be 1
//the middle elements will be sum of values at index and index-1
//return list of lists.


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Pascal{
    public static void main(String[] args){
       List<List<Integer>> res=pascalTrian(5);
       for(int i=0;i<res.size();i++){
           for(int j=0;j<=i;j++){
               System.out.print(res.get(i).get(j));
           }
           System.out.println();
       }
    }

    private static List<List<Integer>> pascalTrian(int nums){
        List<List<Integer>> out=new ArrayList<List<Integer>>();
       

        if(nums==0){
            return out;
        }
        out.add(Arrays.asList(1));

        for(int i=1;i<nums;i++){
            List<Integer> row= new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(out.get(i-1).get(j)+out.get(i-1).get(j-1));
            }
            row.add(1);
            out.add(row);
        }
        return out;
    }
}