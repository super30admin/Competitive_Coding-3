
//Time : O(n*n)
//Space:O(1) as we are returing the same arraylist of list

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result =new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List <Integer>temp=new ArrayList<Integer>();
            if(i==0){
                temp.add(1);
                result.add(temp);
            }else if(i==1){
                temp.add(1);
                temp.add(1);
                result.add(temp);
            }
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){
                        temp.add(1);
                    }else{
                        temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                    }
                }
                result.add(temp);
            }
        }
        return result;
    }
}