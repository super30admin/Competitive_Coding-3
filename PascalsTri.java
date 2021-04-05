/*
 *  Time Complexity: O(N^2) Where N is the size of the pascals triangle.
 *  Space Complexity: O(1) Since we are not suppose to consider the space occupied by the data structure that we return. 
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *
 *  Explanation: We first populate the resulting list with the first tow rows. Then for each we simply add 1 in the first and last of the list. The middle elements we calculate by adding the adjacent elements at that index in the prev row.
 */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        pascalsTri(4);
     }
     private static List<List<Integer>> pascalsTri(int k){
         List<List<Integer>> result = new ArrayList<>();
         
         if(k==0) return result;
         result.add(Arrays.asList(1));
         
         if(k==1) return result;
         result.add(Arrays.asList(1,1));
         
         if(k==2) return result;
         
         for(int i=2;i<k;i++){
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            List<Integer> prevLst = result.get(i-1);
            for(int i=0;i<prevLst.length-1;i++){
                int temp = prevLst.get(i) + prevLst.get(i+1);
                newList.add(temp);
            }
            newList.add(1);
            result.add(new ArrayList<>(newList));
         }
     }
    
}
