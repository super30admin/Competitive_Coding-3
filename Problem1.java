
// Time Complexity : O(N)
// Space Complexity : O(1), only uisng the output space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * In this pascal traingle problem, there is a pattern that in each row our value starts and end with 1 and
 * the other values at index in the list are equal to sum of two values (one of index -1 and other of index) from our
 * previous row.
 */

class Problem1 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> num = new ArrayList<>();


        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();

            //length of our list is equal to the index of row
            for(int j=0; j<=i; j++){

                //starting and ending index of each list is 1
                if(j==0 || j==i) {
                    list.add(1);
                }
                else
                {
                    int left = num.get(i-1).get(j-1);
                    int right = num.get(i-1).get(j);
                    list.add(left+right);
                }


            }

            num.add(list);
        }

        return num;
    }
}