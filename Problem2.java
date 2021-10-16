import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) return null;

        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> toAdd = new ArrayList<>();

            toAdd.add(1);
            List<Integer> previous = output.get(i - 1);
            for (int j = 1; j < i; j++) {
                toAdd.add(previous.get(j) + previous.get(j - 1));
            }
            toAdd.add(1);

            output.add(toAdd);
        }


        return output;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

}
