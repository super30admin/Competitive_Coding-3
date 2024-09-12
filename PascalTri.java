/**
// Time Complexity : O(level^2)
// Space Complexity :O(1) (not considering the return list of lists)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  //for level 1, simply create a list with one elem 1.
  for second and rest we know first and last are prev list's 0 th elem.
  for middle we know its sum of elems at
  middle indx + middle-1 index of prev list.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        //if 0 return ret.
        if(numRows == 0){
            return ret;
        }

        //internal first list.
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);

        ret.add(lst1);

        for(int i = 1; i < numRows; i++){
            List<Integer>prevLst = ret.get(i-1);
            lst1 = new ArrayList<>();

            //add firs elem
            lst1.add(prevLst.get(0));

            //add middle elems.
            for(int elem = 1 ; elem < i; elem++){
                lst1.add(prevLst.get(elem)+ prevLst.get(elem-1));
            }

            //add last elem.
            lst1.add(prevLst.get(0));

            //add list1 to ret.
            ret.add(lst1);
        }

        return ret;
    }
}
