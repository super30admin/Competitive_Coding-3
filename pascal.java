import java.util.ArrayList;
import java.util.List;

//time complexity : O(n) where n is the number of rows
//space complexity: O(1) we are not considering the result list of list and the list current is being used to form the result list of list, so we wont consider it in the space complexity as well
//Did this code successfully run on Leetcode : Yes
//any issues faced: none

public class pascal {

	public  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;++i)
        {
            List<Integer> current = new ArrayList<>();
            for(int j=0;j<=i;++j)
            {
                if(j==0||j==i) current.add(1);
                else current.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            result.add(current);
        }
        return result;

    }
    public static void main(String[] args) {
        pascal ob = new pascal();
        System.out.println(ob.generate(5));
    }
} 