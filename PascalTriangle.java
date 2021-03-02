import java.util.*;

public class PascalTriangle {
	//TC - o(n^2)
    //SC - o(1)
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows == 0)
            return result;
        
        for(int i =0; i< numRows;i++) {
            List<Integer> list = new ArrayList<>();
            
            //no of col will be same as no of rows
            // 1->1,2->2, 3->3
            for(int j=0; j<i+1;j++) {
                //first and last element add one
                //edge case
                if(j==0 || j==i) {
                    list.add(1);
                } 
                //it will be total of prev row's j-1 col and j col values
                else {
                    int x = result.get(i-1).get(j-1);
                    int y = result.get(i-1).get(j);
                    list.add(x+y);
                }
            }
            result.add(list);
        }
        return result;
    }

}
