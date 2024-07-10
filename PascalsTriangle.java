import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle { //O(n*n) T.C, O(1) S.C
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(); //initialize the outer list
        for(int i=0; i<numRows; i++) { //accessing the lists in outer list
            List<Integer> list = new ArrayList<>(); //initialize the inner list each time for given numrows
            for(int j=0; j<=i; j++) { //accessing the values in inner list
                if(j == 0 || j == i) list.add(1); //if the element is either of the corner, just insert 1
                else { //if this is a middle element
                    int leftAbove = res.get(i-1).get(j-1); //left value is at one row above and one colum left
                    int rightAbove = res.get(i-1).get(j); //right value is at one row above and same column
                    list.add(leftAbove + rightAbove); //adding the above two gives current row value
                }
            }
            res.add(list); //add the list at end of each iteration
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("The pascal triangle for rows " + num + " is: ");
        List<List<Integer>> output = generate(num);
        for (List<Integer> integers : output) {
            System.out.println(integers);
        }
    }
}