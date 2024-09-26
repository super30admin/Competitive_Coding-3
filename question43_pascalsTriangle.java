package CompetitiveCoding3;

import java.util.ArrayList;
import java.util.List;

public class question43_pascalsTriangle {

    /*
        Time Complexity: O(n ^ 2)
        Space Complexity: O(n ^ 2)
    */
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int i = 1 ; i < numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = list.get(i - 1);

            row.add(1);

            for(int j = 1 ; j < i ; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        int num = 5;
        List<List<Integer>> list = generate(num);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
