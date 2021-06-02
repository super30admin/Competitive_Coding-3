package CompetitiveCoding3;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleWithRecursion {

    
    List<List<Integer>> main = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>(); 
        
        List<Integer> firstList = new ArrayList<>();
            firstList.add(1);
            main.add(firstList);
            
            return  helper(main,1,numRows);
        
    }
    
    private List<List<Integer>>   helper(List<List<Integer>>  main, int index,int numRows)
    {
     
        if(main.size() == numRows) return main;
        
        List<Integer> previousList = main.get(main.size()-1);
        List<Integer> nextList = new ArrayList<>();
        
        
        nextList.add(1);
            
            for(int j=0;j<previousList.size()-1;j++)
            {
               nextList.add(previousList.get(j)+previousList.get(j+1));  
            }
           
          nextList.add(1);
        
        main.add(nextList);
        helper(main,index++,numRows);
        
        return main;
    }


}
