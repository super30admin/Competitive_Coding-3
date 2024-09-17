//time complexity: O(n^2)
//space : O(n)
//where n is number of rows

import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows==0)
            return result;
        List<Integer> temp = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        if(numRows==1)
            return result;
        helper(temp, numRows);  
        return result;
    }
    
    public List<Integer> helper(List<Integer> temp,int numRows)
    {
        //base
        if(numRows==2)
        {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            result.add(list);
            return list;
        }
        
        //logic
        List<Integer> a = helper(temp, numRows-1); //121
        List<Integer> l = new ArrayList<>();
        for(int i=0; i < numRows; i++)
        {
            if(i==0|| i==numRows-1)
                l.add(1);
            else
                l.add(a.get(i-1)+a.get(i));
        }
        result.add(l);
        return l;
        
    }
}