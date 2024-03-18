// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// "static void main" must be defined in a public class.
import java.util.*;

public class Pascal {
    public static void main(String[] args) {
        print(pascal(1000));
    }
    
    public static List<List<Integer>> pascal(int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (n == 0 || n < 0) return result;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        
        for (int i = 1; i < n; i++) {
            List<Integer> prev = result.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
    
    public static void print(List<List<Integer>> result) {
        for (List<Integer> l1 : result) {
            for (Integer n : l1) {
                 System.out.print(n + " "); 
            }
            System.out.println();
        }
    }
}