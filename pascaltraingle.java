import java.util.ArrayList;
import java.util.List;

//Idea is to create a list based on the previous list and add them to final list
//Time Complexity:O(n*n)
//Space Complexity: O(n*n)
public class pascaltraingle {
        public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> result = new ArrayList<>();
      List<Integer> li = new ArrayList<Integer>();
      li.add(1);
       result.add(li);
        if(numRows==1) return result;
      List<Integer> li2 = new ArrayList<Integer>();
      li2.add(1);
      li2.add(1);
       result.add(li2);
           if(numRows==2) return result;
      for(int i=1;i<numRows-1;i++)
      {
          List<Integer> l = new ArrayList<>();
          List<Integer> prev = result.get(i);
          l.add(1);
          for(int j=0;j<prev.size()-1;j++)
          {
              l.add(prev.get(j)+prev.get(j+1));
          }
          l.add(1);
          result.add(l);
      }
        return result;
    }
}
