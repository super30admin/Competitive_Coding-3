// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;

public class PascalTraingle {

            public List<List<Integer>> generate(int numRows) {
                List<List<Integer>> result = new ArrayList<>();
                List<Integer> ll = Arrays.asList(1);
                List<Integer> prev = ll;
                result.add(ll);
                for (int i = 2; i <=numRows; i++){
                    ll = new ArrayList<>();
                    for (int j=0; j<i; j++){
                        int a;
                        if ((j-1) < 0) a = 0; 
                        else a = prev.get(j-1);
        
                        int b;
                        if (j > prev.size()-1) b=0; 
                        else b=prev.get(j);
                        
                        ll.add(a+b);
                    }
                    result.add(ll);
                    prev = ll;
                }
                return result;
        }
    
    
}
