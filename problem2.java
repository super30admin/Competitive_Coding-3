//Q 118:- Leetcode
public class problem2 {
    // Time Complexity : O(n^2)
    // Space Complexity : O(n^2)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
        public List<List<Integer>> generate(int numRows) {
            
            List<List<Integer>> triangle = new ArrayList<>();
            int num = 1;
            
            for(int i = 0; i < numRows; i++){
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j <= i; j++){
                    if(j == 0 || i == 0){
                        num = 1;
                        list.add(num);
                    }else{
                        num = num * (i - j + 1) / j;
                        list.add(num);
                    }
                }
                triangle.add(list);
            }
            return triangle;   
        }
    }
    
