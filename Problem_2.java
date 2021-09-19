// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// set sub array, then add new elemnt at fist and set rest of all values to sum of preset + previous
// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subArray = new ArrayList<>();
        for( int i = 0; i < numRows ; i++){
            subArray.add(0,1);
            for(int j = 1; j < subArray.size()-1 ; j++){
                subArray.set(j, subArray.get(j) + subArray.get(j+1));
            }
            result.add(new ArrayList<>(subArray));
        }
        return result;
    }
}
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> result = new ArrayList<>();
//         List<Integer> prev = new ArrayList<>();
//         prev.add(1);
//         result.add(new ArrayList<>(prev));
//         if( numRows == 1 ) return result;
//         prev.add(1);
//         result.add(new ArrayList<>(prev));
//         int count = 2;
//         if( numRows < 3){
//             return result;
//         }else{
//             while( count < numRows ){
//                 List<Integer> subResult = new ArrayList<>();
//                 for(int i = 0; i<= count; i++){
//                     if( i == 0 || i == count ){
//                         subResult.add(1);
//                     }else{
//                         subResult.add(prev.get(i-1) + prev.get(i));
//                     }
//                 }
//                 prev.clear();
//                 prev.addAll(subResult);
//                 result.add(new ArrayList<>(subResult));
//                 count++;
//             }
//         }
//         return result;
//     }
// }