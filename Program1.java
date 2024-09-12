// 118. Pascal's Triangle 

import java.util.ArrayList;
import java.util.List;
 

class pp{
    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i< numRows; i++){
            List<Integer> current = new ArrayList<>();

            for(int j=0; j<i+1; j++){
                if(j==0 || j == i){
                    current.add(1);
                }
                else{
                    current.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(current);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result; 
        result = generate(5);
        System.out.println(result);
    }
}

/*
Time complexity : 
O(n*n)
Although updating each value of triangle happens in constant time, it is performed O(n*n) times.
Space complexity : 
O(n*n) Because we need to store each number that we update in triangle, the space requirement is the same as the time complexity.
*/