import java.util.ArrayList;
import java.util.List;

/*
Time complexity - O(K) * O(K-1) Current row and previous row  == O(K^2)
Space complexity - O(k) * 2 ~~ O(K)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
*/
public class PascalTriangleII_LC_119 {
    public List<Integer> getRow(int rowIndex) {
        //int firstIndex = 1;
        List<Integer> prevList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        prevList.add(1);

        //1 - prev
        //1 - current

        for(int row = 1; row< rowIndex+1; row++){ //4
            current.add(1);
            for(int i = 0 ; i<prevList.size()-1; i++) {
                int nextElement = prevList.get(i) + prevList.get(i+1);
                current.add(nextElement);
            }
            current.add(1);
            prevList = current;  //1  1
            //make curent as empty
            current = new ArrayList<>();

        }
        return prevList;
    }
}