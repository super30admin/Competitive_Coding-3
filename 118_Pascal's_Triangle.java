
/*
118. Pascal's Triangle

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class Solution {
        public List<List<Integer>> generate(int k) {
             List<List<Integer>> result = new ArrayList<>();
             if(k <= 0)
                return result;
             List<Integer> temp = new ArrayList<>();
             temp.add(1);
             result.add(temp);

             for (int i = 1; i < k; i++){

                 int prevRow = i -1;
                 List<Integer> prevList = result.get(prevRow);
                 temp  = new ArrayList<Integer>();
                 temp.add(1);

                 for( int j = 0; j < prevList.size() -1;++j){

                     int sum = prevList.get(j) + prevList.get(j+1);
                     temp.add(sum);    
                 }
                 temp.add(1);

                result.add(temp);

             }
             return result;
        }
    }
