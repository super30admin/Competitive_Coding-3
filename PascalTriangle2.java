/**
 * Time Complexity : O(n^2) 
 * Space Complexity : O(k) where k = number of rows
 */

import java.util.*;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> prev = new ArrayList<>();
        for(int i = 0; i < rowIndex ; i ++)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0 ; i <= i ;i ++)
            {
                if(j == 0 || j == i)
                {
                    list.add(1);
                }
                else
                {
                    list.add(prev.get(j-1) + prev.get(j));
                }
                prev = list;
            }
        }
        return prev;
    }

    public List<Integer> getRowOptimized(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
        }
        return list;
    }

    public static void main(String args[]){
        PascalTriangle2 obj = new PascalTriangle2();
        System.out.println(obj.getRowOptimized(3));
        
    }
}