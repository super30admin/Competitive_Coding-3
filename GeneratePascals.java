import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePascals {
  // Time O(N^2)
  // Space O(1)
  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> resultList = new ArrayList<List<Integer>>();
    resultList.add(Arrays.asList(1));
    if (numRows == 1) {
      return resultList;
    }
    resultList.add(Arrays.asList(1, 1));
    for (int i = 2; i < numRows; i++) {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      for (int j = 1; j < i; j++) {
        int sum = resultList.get(i - 1).get(j - 1) + resultList.get(i - 1).get(j);
        list.add(sum);
      }
      list.add(1);
      resultList.add(list);
    }
    return resultList;
  }

  public static void main(String[] args) {
    GeneratePascals solution = new GeneratePascals();

    for (List<Integer> row1 : GeneratePascals.generate(5)) {
      System.out.print("[");
      for (int val : row1) {
        System.out.print(val + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }
}
