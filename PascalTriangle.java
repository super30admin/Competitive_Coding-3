import java.util.ArrayList;
import java.util.List;

//Time Complexity functions: O(n^2)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/*
We start from the first number 1. Store it in list. Then we create new list based on this previous list by adding its two adjacent indexes
. If i==0 or n-1 then we add with 1 and store in new list. Now we make this new list as prev list. All the lists are added to result list.
*/
 class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        result.add(prev);
        for(int i=1;i<numRows;i++){
            int prevsize=prev.size();
            List<Integer> next=new ArrayList<>();
            for(int j=0;j<prevsize;j++){
                if(j==0){
                    next.add(1);
                }else{
                    next.add(prev.get(j)+prev.get(j-1));
                }
                if(j==prevsize-1){
                    next.add(1);
                }
            }
            result.add(next);
            prev=next;
        }
        return result;
    }
}
