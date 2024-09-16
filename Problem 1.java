//Time Complexity: O(N^2) where N is the number of rows of Pascal Triangle
//Space Complexity: O(N^2)

//Did it run successfully on leetcode: Yes (Runtime: 0ms)

//Approach: Each row of pascal triangle is a new list and initially the first row is created with one element of '1'.
//In Pascal's triangle, the first and last element in every row is '1' so we will initialize that from 2nd row onwards.
//Now to get the elements between first and last elements, we add two elements from the previous row (one in the same column as
//the element that needs to be calculated and one in the same-1 column) 

import java.util.*;
class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();

            //n==0

            if(n == 0)
                return result;

            for(int i = 0; i < n; i++)
            {
                List<Integer> row = new ArrayList<>();

                for(int j = 0; j < i+1; j++)
                {
                    if(j == 0 || j == i)
                    {
                        row.add(1);
                    }
                    else
                    {
                        int a = result.get(i-1).get(j);
                        int b = result.get(i-1).get(j-1);
                        row.add(a+b);
                    }
                }

                result.add(row);
            }
            return result;
    }
}