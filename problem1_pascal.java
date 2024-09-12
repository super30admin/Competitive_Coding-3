//T.C- O(N^2)- N is numRows- The outer loop obviously runs numRows times, but for each iteration of the outer loop, the inner loop runs rowNum times.
//S.C-O(1), output does not ocount towards the space complexity
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> output= new ArrayList<>(); //output
      List<Integer> prev= new ArrayList<>(); //to store prev
      prev.add(1); //1st row is always going to be 1
      output.add(prev);

      for(int i=2; i<=numRows;i++){
        List<Integer> curr= new ArrayList<>();
        curr.add(1); //first
        for(int j=0; j<prev.size()-1;j++){
          curr.add(prev.get(j)+prev.get(j+1)); //middle addition
        }
        curr.add(1); //last
        output.add(curr);
        prev=curr; //update previous row
      }
      return output;
        
    }
}