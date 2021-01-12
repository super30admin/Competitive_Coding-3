// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(makePattern(i,list));
            System.out.println(list);
        }
        return list;
    }
    
    public static List<Integer> makePattern(int numRow,List<List<Integer>> list){
        List<Integer> li=new ArrayList<Integer>();
        if(numRow==0){
            li.add(1);
            return li;
        }
        else if(numRow==1){
            li.add(1);
            li.add(1);
            return li;
        }
        else{
            int num=0;
            li.add(1);
            for(int i=1;i<numRow;i++){
                num=list.get(numRow-1).get(i)+list.get(numRow-1).get(i-1);
                li.add(num);
            }
            li.add(1);
            return li;
        }
    }
}