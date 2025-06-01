// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, in HackerRank
// Any problem you faced while coding this : YES with kadane's algo technique

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
            int currSum = arr.get(0);
            int maxArraySum = arr.get(0);
            int subSequenceSum = arr.get(0);        
        
        for (int i = 1; i < arr.size(); i++){
            int num = arr.get(i);
            
            currSum = Math.max(num, currSum + num);
            maxArraySum = Math.max(maxArraySum, currSum);
            
            if (num > 0) {
                if (subSequenceSum < 0) subSequenceSum = 0;
                subSequenceSum += num;
            } else if (subSequenceSum < 0) {
                subSequenceSum = Math.max(subSequenceSum, num);
            }
        }
        
        return Arrays.asList(maxArraySum, subSequenceSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
