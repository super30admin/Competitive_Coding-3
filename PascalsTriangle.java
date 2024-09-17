// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Syntax for creating arrays/lists dynamically for each row 

// Notes : The first and last element for each row is 1, else it is sum of value in the row above the current value and the value diagonally left to the current value. 

public class PascalsTriangle {

    //Solution 1: computing arrays of required values and adding them to lists
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(n == 0) return result;

        int array[][] = new int[n][];

        result.add(new ArrayList<Integer>(Arrays.asList(1)) );  
        
        for(int i = 1; i < n; i++){
            List<Integer> list = new ArrayList<>();
        
            array[i] = new int[i+1];
            
            for (int j = 0; j <= i; j++){
               
                if(j == 0 || j == i){
                     array[i][j] = 1;
                } else {
                     array[i][j] = array[i-1][j-1] + array[i-1][j];
                } 
                
                list.add(array[i][j]);
                
            }
            
            result.add(list);
        }
        
        return result;
    }

    //Soultion 2 : Directly creating lists of required values and then adding them to the final result list
    // public List<List<Integer>> generate(int n) {
    //     List<List<Integer>> result = new ArrayList<>();
        
    //     if(n == 0) return result;

    //     result.add(new ArrayList<Integer>(Arrays.asList(1)) );  
        
    //     for(int i = 1; i < n; i++){
    //         result.add(new ArrayList<Integer>());
            
    //         for (int j = 0; j <= i; j++){
    //             if(j == 0 || j == i){
    //                  result.get(i).add(1);
    //             } else {
    //                  result.get(i).add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
    //             }     
    //         }
    //     }
        
    //     return result;
    // }
}
