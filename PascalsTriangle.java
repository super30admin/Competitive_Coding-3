/**
 * # Time Complexity : O(n^2) - Runs for n * (n+1) / 2 ~ n^2
 * # Space Complexity : O(k) - temp array to store intermediate results
 * # Idea: 
 * 1. Edges are 1 for each row.
 * 2. Non edge values are sum of previous row's jth index and (j-1)th index values where j is current position.
 * 3. Push to result list
 */

import java.util.*;
class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int i=0;
        while(i < numRows){
            int currSize = i+1;
            int j = 0;
            List<Integer> temp = new ArrayList<>();
            while(j < currSize){             
                int data = 1;
                if(result.size() > 1){
                    if(j == 0 || j == result.get(i-1).size()){
                        data = 1;
                    }
                    else{
                        int x = result.get(i-1).get(j-1);
                        int y = result.get(i-1).get(j);
                        data = x + y;
                    }
                    
                }                
                
                temp.add(data);
                j++;
            }                      
            result.add(temp);        
            System.out.println(result);    
            i++;
        }                
        return result;   
    }
    public static void main(String[] args){
        System.out.println("PascalsTriangle");
        PascalsTriangle obj = new PascalsTriangle();
        int numRows = 5;
        obj.generate(numRows);
    }
}