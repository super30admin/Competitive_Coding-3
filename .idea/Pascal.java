import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Pascal {
    private static List<List<Integer>> pascalCal(int n)
    {
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        li.add(1);
        list.add(li);
        for(int i=1;i<=n-1;i++)
        { List<Integer> temp = new ArrayList<>();
            List<Integer> prev = new ArrayList<>();
            prev = list.get(i-1);
            temp.add(1);
            for(int j=1;j<=i-1;j++)
            {
                temp.add(prev.get(j-1)+prev.get(j));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
    public static void main(String args[])
    {   int n= 5;
        System.out.println(pascalCal(5));
    }
}    // time complexity is O(n^2)
//space complexity is O(N)

//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> res = new ArrayList<>();
//        for(int i=0;i< numRows;i++)
//        {
//            List<Integer> row = new ArrayList<>();
//            for(int j=0;j<=i;j++)
//            {
//                if(j==0 || j== i)
//                {
//                    row.add(1);
//                }
//                else
//                {
//                    int left = res.get(i-1).get(j-1);
//                    int right a= res.get(i-1).get(j);
//                    row.add(left+right);
//                }
//            }
//            res.add(row);
//        }
//        return res;
//    }
//}

// time complexity is O(n^2)
//space complexity is O(1)