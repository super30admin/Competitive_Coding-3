// Time Complexity :O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
import java.util.*;
public class PascalTraingle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }
        // result
        List<List<Integer>> res=new ArrayList<>();

       for(int i=0;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();
           if(i==0){
               l1.add(1);
               res.add(l1);
           }
           else if(i==1){
               l1.add(1);
               l1.add(1);
               res.add(l1);
           }
           else{
               for(int j=0;j<=i;j++){
                   if(j==0 || j==i){
                       l1.add(1);
                   }
                   else{
                       List<Integer> temp=res.get(i-1);
                       int sum=temp.get(j-1)+temp.get(j);
                       l1.add(sum);
                       
                   }
               }
               res.add(l1);
           }
       }
        return res;
    }
}
