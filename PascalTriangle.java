//Time complexity:O(n^2)
//Space Complexity:O(1)
/*Approach
-doing a loop from 1 to number of rows and again for a particular row creating a loop
-the first and last number in each row of pascal triangle is 1 so giving a condition for it
-for the it is sum of previous row's same index and index before it,so applying that and calculating
every row from previous row
 */
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    curr.add(1);
                }
                else{
                curr.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(curr);
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(generate(5));
    }
}