// Time O(n^2)
//space: O(n^2)
class Solution {
    public List<List<Integer>> generate(int n) {
      List<Integer> row = new ArrayList<Integer>();
      List<List<Integer>> tri = new ArrayList<>(); // triangle
      
      if( n == 1){
         row.add(1);
        tri.add(row);
        return tri;
      }
      
      for(int i=0;i<n;i++){
         row = new ArrayList<Integer>();
        for(int j=0;j<=i;j++){
          //left end or right end of the row, add 1
          if(j==0 || j== i)
            row.add(1);
          else{
            //fill with the sums in-between the 1s
            int left = tri.get(i-1).get(j-1);
            int right = tri.get(i-1).get(j);
            row.add(left+right);
          }
          
        }
        tri.add(row);
        
      }
      
      // System.out.print(tri);
      
        return tri;
    }
}
