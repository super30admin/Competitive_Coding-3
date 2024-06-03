import java.util.ArrayList;
import java.util.List;

/***
 1. Use a list to keep track of prev row element and use another list to calculate and store the curr row elements
 2. Initialize prevList with value for row=0, i.e list with value 1
 3. Calculate value for row=1 to row=rowIndex using prevList, add 1st and last element as 1 for each row, calculate the intermediate elements from j=1 to j<currentRow using prevList[j]+prevList[j-1]
 TC - O(n^2), SC - O(n)
 */

class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        //Keep track of the previous row elements in a list
        List<Integer> prevList = new ArrayList<>();
        prevList.add(1);

        //List to calculate and store the current row
        List<Integer> curList;

        for(int i =1; i <= rowIndex; i++) {
            curList = new ArrayList<>();
            //1st element will always be 1
            curList.add(1);
            for(int j =1; j<i; j++) {
                curList.add(prevList.get(j) + prevList.get(j-1));
            }
            //last element will always be 1
            curList.add(1);

            //Update prev list
            prevList = curList;
        }

        return prevList;

    }
}