// Time complexity is O(n) where n is the numRows and space complexity is O(1)
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> al = new ArrayList<>();
    for(int i=0;i<numRows;i++){
      List<Integer> al1 = new ArrayList<>();
      if(al.isEmpty()){
        al1.add(1);
        al.add(al1);
      }
      else{
        for(int j=0;j<=i;j++){
          if(j==0)
            al1.add(1);
          else if(j==i)
            al1.add(1);
          else{
            List<Integer> al2 = al.get(i-1);
            al1.add(al2.get(j-1) +  al2.get(j));
          }
        }
        al.add(al1);
      }
    }
    return al;

  }
}
