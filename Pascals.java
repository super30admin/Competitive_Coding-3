import java.util.ArrayList;
import java.util.List;

public class Pascals {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		// edge
		if (numRows == 0)
			return result;

		// logic
		for (int i = 0; i < numRows; i++) {
			List<Integer> rowIndex = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) { // checking extreme left and right position
					rowIndex.add(1); // each row with extreme left and extreme right positioned values will be 1
				} else {
					int left = result.get(i - 1).get(j - 1); // getting extreme left value
					int right = result.get(i - 1).get(j); // getting extreme right value
					rowIndex.add(left + right); // middle values

				}
			}

			result.add(rowIndex); // [[1], [1, 1], [1, 2, 1]] add each rows in result

		}

		return result;
	}

	public static void main(String[] args) {
		Pascals pascals = new Pascals();
		pascals.generate(5);
	}
}
