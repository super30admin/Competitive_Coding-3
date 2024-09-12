//This is from hackerrank contest s30nautanix.
//https://www.hackerrank.com/contests/s30nutanix/challenges/maxsubarray/submissions/code/1341875858
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes (Hackerrank)
// Any problem you faced while coding this : No
//Create two funtions for sub array and subsequence
//Pass the array loop through the array to find sub array and subseq.


// Your code here along with comments explaining your approach
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int maxSubArr(List<Integer> arr) {
        int maxCur = arr.get(0);
        int maxOv = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            maxCur = Math.max(arr.get(i), maxCur + arr.get(i));
            maxOv = Math.max(maxOv, maxCur);
        }
        return maxOv;
    }
    public static int maxSubSeq(List<Integer> arr) {
        int max = arr.get(0);
         for(int i = 1;i < arr.size(); i++){
            if(max < arr.get(i))
                max = arr.get(i);
        }
        int no = max;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0)
                max+=arr.get(i);
        }
        
        if(max < 0)
            return max;
        else
            return max - no;
    }
    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
        // int [] nums = new int[arr.size()];
        // arr.toArray(nums);
        List<Integer> res = new ArrayList<>();
        //subarray
        res.add(maxSubArr(arr));
        //subsequence
        res.add(maxSubSeq(arr));
        
        return res;
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