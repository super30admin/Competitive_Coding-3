// Recursive Solution
// Time Complexity: O(n) - I am not sure
// Space Complexity: O(1) if we consider resultant list does not occupy space
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows < 1) {
            return res;
        }
        if(numRows == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(list);
            return res;
        }

        if(numRows == 2) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            res.add(list1);
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            res.add(list2);
            return res;
        }

        List<List<Integer>> allButLast = generate(numRows - 1);
        List<Integer> last = new ArrayList<>();
        last.add(1);

        for(int i=0; i<allButLast.size() - 1; i++) {
            last.add(allButLast.get(allButLast.size()-1).get(i) + allButLast.get(allButLast.size()-1).get(i+1));
        }
        last.add(1);
        allButLast.add(last);
        return allButLast;

    }
}
// Time Complexity: O(numRows^2)
// Space Complexity: O(1)
 class Solution {
     public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res = new ArrayList<>();

         if(numRows == 0){
             return res;
         }
         res.add(Arrays.asList(1));
         if(numRows == 1) {
             return res;
         }

         res.add(Arrays.asList(1,1));
         if(numRows == 2) {
             return res;
         }

         for(int i=2; i<numRows; i++) {
             List<Integer> list = new ArrayList<>();
             int index=0;
             for(int j=0; j<=i; j++) {
                 if(j==0 || j==i) {
                     list.add(1);
                 } else {
                     int sum = res.get(i-1).get(index) + res.get(i-1).get(index+1);
                     index++;
                     list.add(sum);
                 }
             }
             res.add(list);
         }

         return res;
     }
 }