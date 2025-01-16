// 118. Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// 1
// 11
// 121
// 1331

// example:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Solution:
// Time Complexity : O(n2)
// Space Complexity : O(n2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Approach: In this we are creating a new list for each row and then we are adding it in a list of list.
// For numRows 0 & 1 we are creating a list directly and not using a loop because they both will bw 1 and {1,1} always.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Base case condition check
        if(numRows==0){
            return new ArrayList<>();
        }
        //Created a list of list which we have to return
        List<List<Integer>> pascal= new ArrayList<>();
        if(numRows>=1){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            pascal.add(list1);
        }
        if(numRows>=2){
             List<Integer> list2=new ArrayList<>();
            list2.add(1);
            list2.add(1);
            pascal.add(list2);
        }
        //Created a list prev which will store the previous row list so that we can traverse it to make a next list by adding adjacent elements
        List<Integer> prev=new ArrayList<>();
        //As we have already processed 0 & 1 we will start from 2
        for(int i=2;i<numRows;i++){
            //We are creating temp seperate for every iteration
            List<Integer> temp=new ArrayList<>();
            //We are getting the previous row and storing it in prev
            prev=pascal.get(i-1);
            temp.add(1);
            //We are traversing the previous row are calculating it
            for(int j=0;j<prev.size()-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            pascal.add(temp);
        }
        // we are returning the list of list
        return pascal;
    }
}