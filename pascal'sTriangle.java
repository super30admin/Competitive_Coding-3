// Time Complexity : O(n**2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if(numRows==1){
            return list;
        }
        
        List<Integer> list2 = new ArrayList<>(List.of(1,1));
        list.add(list2);
        if(numRows==2){
            return list;
        }
       
        for(int i=2;i<numRows;i++){
            List<Integer> lists = new ArrayList<>();
            List<Integer> prelist = list.get(i-1);
            lists.add(1);
            for(int j=0;j<prelist.size()-1;j++){
                int element = prelist.get(j)+prelist.get(j+1);
                lists.add(element);
            }
            lists.add(1);
            list.add(lists);      
        }


    return list;
    }
}