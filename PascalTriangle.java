// Time Complexity : O(numRows^2) 
// Space Complexity : O(numRows^2) 
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Start with the first row as `[1]` and iteratively build each subsequent row using the previous row.
// 2. Each row starts and ends with `1`, while the middle elements are the sum of two adjacent elements from the previous row.
// 3. Store each generated row in a list and return the complete Pascal’s Triangle.


import java.util.*;

public class PascalTriangle  
{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> op = new ArrayList<>();
        if(numRows==1)
        {
            List<Integer> opad = new ArrayList<>();
            opad.add(1);
            op.add(opad);
            return op;
        }
        if(numRows==2)
        {
            List<Integer> opad = new ArrayList<>();
            opad.add(1);
            List<Integer> opad1 = new ArrayList<>();
            opad1.add(1);
            opad1.add(1);
            op.add(opad);
            op.add(opad1);
            return op;
        }

        int[][] dp = new int[numRows][numRows];
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;
        List<Integer> opad = new ArrayList<>();
        opad.add(1);
        op.add(opad);

        List<Integer> opad1 = new ArrayList<>();
        opad1.add(1);
        opad1.add(1);
        op.add(opad1);

        for(int i=2;i<dp.length;i++)
        {
            opad = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    dp[i][j] = 1;
                }
                else if(j==i)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                }
                opad.add(dp[i][j]);
            }
            op.add(opad);
        }
        return op;
    }

    // Approach 2 : 
    /*public List<List<Integer>> generate(int numRows) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> op  = new ArrayList<List<Integer>>();
        arr.add(1);
        op.add(new ArrayList<>(arr));
        if(numRows==1)
        {
            return op;
        }
        arr.add(1);
        op.add(new ArrayList<>(arr));
        int j= 0;
        if(numRows==1)
        {
            return op;
        }
        else
        {
            while(j!=numRows-2)
            {
                List<Integer> dummy = new ArrayList<>();
                for(int i=0;i<arr.size()-1;i++)
                {
                    dummy.add(arr.get(i) + arr.get(i + 1));
                }
                while(arr.size()!=1)
                {
                    arr.remove(1);
                }
                for(int i=0;i<dummy.size();i++)
                {
                    arr.add(dummy.get(i));
                }
                arr.add(1);
                op.add(new ArrayList<>(arr));
                j++;
            }
        }
        return op;
    }*/
}