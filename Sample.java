import java.util.List;

public class Sample {

    public static void main(String[] args) {

        FindPairsClass sample = new FindPairsClass();

        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;

        int result = sample.findPairs(nums, k);

        System.out.println("Result: " + result);


        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> triangle = pascalTriangle.generate(5);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

    }
}

