import java.util.ArrayList;
import java.util.List;

//    TC : O(n)
//    Sc : O(h)
class Problem1 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return null;

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> raw = new ArrayList<>();
            raw.add(0, 1);
            for (int j = 1; j < i; j++) {
                raw.add(j, (result.get(i - 1).get(j - 1) + result.get(i - 1).get(j)));
            }
            raw.add(1);
            result.add(raw);
        }
        return result;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        List<List<Integer>> result = problem1.generate(3);
        System.out.println("final result " + result);
    }
}

