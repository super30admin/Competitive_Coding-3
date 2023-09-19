// Time Complexity : O(n * m) where n is the number of rows and m is the number of elements in each row
// Space Complexity : O(1) we don't use any extra space other than the list returning
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Only in the beginning deciding to add j-1th and jth elements or j+1th and jth elements


// Your code here along with comments explaining your approach

class Problem1{
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(1));

        if(numRows == 1){
            return result;
        }

        for(int i = 1; i < numRows; i++){
            List<Integer> list = result.get(i-1);
            List<Integer> newList = new ArrayList<>(list.size() + 1);
            for(int j = 0; j <= list.size(); j++){
                if(j == 0){
                    newList.add(list.get(0));
                }else if(j == list.size()){
                    newList.add(list.get(list.size()-1));
                }else{
                    newList.add(list.get(j-1) + list.get(j));
                }

            }

            result.add(newList);

        }

        return result;
    }
}