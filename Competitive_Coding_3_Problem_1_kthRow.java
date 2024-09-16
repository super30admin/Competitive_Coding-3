import java.util.ArrayList;
import java.util.List;

//Time complexity: O(n^2)
//Space Complexity : O(k) where k = number of row
//Does'nt run on leetcode - Memory exceeded
//Seems like we need to optimize space even more by using only one lists instead of two


//Just as we maining a list of all the rows in pascal triangle, here we are maintaing only one (The previous one)

public class Competitive_Coding_3_Problem_1_kthRow {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> prev = new ArrayList<>();
        for(int i = 0; i < rowIndex ; i ++)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0 ; i <= i ;i ++)
            {
                if(j == 0 || j == i)
                {
                    arr.add(1);
                }
                else
                {
                    arr.add(prev.get(j-1) + prev.get(j));
                }
                prev = arr;
            }
        }
        return prev;
    }


    //Runs succesfully on leetcode
    //This is space optimized version of above

    public List<Integer> getRowOpti(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i <= rowIndex ; i ++)
        {
            arr.add(0,1);
            for(int j = 1 ; j < arr.size() - 1 ;j ++)
            {
                arr.set(j,arr.get(j) + arr.get(j+1));
            }
        }
        return arr;
    }


}


