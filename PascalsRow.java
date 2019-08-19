
public class PascalsRow {
	/**
	 * Hint: Any row in a pascal's triangle is obtained by summing up two elements from the previous row
	 * Eg: k=3 => [1, 2, 1] 
	 * 	   k=4 => [1, 3, 3, 1]
	 * It can be derived that 
	 * 			row4[i] = row3[i] + row3[i-1] where i >= 1
	 * Time: n(n-1)/2 => O(n^2)
	 * Space: O(n) + O(n)
	 * @param k
	 * @return
	 */
	private static int[] pascalsRow(int k) {
		//Initialize two arrays, one two store values of previous row and the other one to store values of current row
		int[] nums1 = new int[k];
		int[] nums2 = new int[k];
		//Fist element is 1 in all the rows of a pascal's triangle
		nums1[0] = 1; //previous row
		nums2[0] = 1; //current row
		
		//As we start with nums1 for 1st row, nums2 for 2nd row, 
		//To calculate 3rd row we only need nums2 (which carries 2nd row elements right now), nums1(which carries 1st row elements) is of no use
		// So use nums1 to store values of nums3
		// and then use nums2 to calculate 4th row from nums1(which carries 3rd row elements right now)
		// and so on...
		for(int i=1; i<=k; i++) {
			// if i is even, we are storing ith row values in nums2 using (i-1)th row values in nums1
			if(i%2 == 0) {
				//Modify nums2 starting 2nd element
				int j = 1;
				while(j<i) {
					nums2[j] =nums1[j] + nums1[j-1];
					j++;
				}
			// if i is odd, we are storing ith row values in nums1 using (i-1)th row values in nums2
			} else {
				//Modify nums1 starting 2nd element
				int j = 1;
				while(j<i) {
					nums1[j] =nums2[j] + nums2[j-1];
					j++;
				}
			}
		}
		// finally depending on k is even or odd, return the corresponding that contains kth row elements
		return (k%2)==0 ? nums2 : nums1;
  	}
	
	/**
	 * Approach: Optimized to use to a single array with the help of two variables
	 * Time: n(n-1)/2 => O(n^2)
	 * Space: O(n)
	 * @param k
	 * @return
	 */
	
	private static int[] optimizedPascalsRow(int k) {
		int[] nums = new int[k];
		//Initialize 1st element to 1
		nums[0] = 1;
		//Start manipulating values from 2nd element
		for(int i=1; i<=k; i++){
			int j = 1, prev = 1, curr; //prev value initially is 1, as the first element is already initialized
			//For any ith row, we only need calculate values until (i-1) index. so j < i
			while(j < i) {
				curr = nums[j]; 
				nums[j] = prev+nums[j];
				prev = curr;
				j++;
			}
		}
		return nums;
  	}
	
	public static void main(String[] args) {
		int[] arr = pascalsRow(4);
		int[] arr1 = optimizedPascalsRow(4);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
