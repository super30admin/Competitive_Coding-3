// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
import java.util.*;
public class KDIFFPairs {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int count=0;
        for(int a:  nums){
            if(map.get(a) == null){
                if(map.get(a+k) != null){
                    count++;
                }
                if(map.get(a-k) != null){
                    count++;
                }
                map.put(a,0);
            }else{
                if(k==0 && map.get(a)==0)
                    count++;
                map.put(a,map.get(a)+1);
            }
        }
        return count;
    }
}
