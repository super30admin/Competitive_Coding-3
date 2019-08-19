
public class PascalsRow {
	/**
	 * Time: n(n-1)/2 => O(n^2)
	 * Space: O(n) + O(n)
	 * @param k
	 * @return
	 */
	private static int[] pascalsRow(int k) {
		int[] nums1 = new int[k];
		int[] nums2 = new int[k];
		//Fist element is 1 in all the rows of a pascal's triangle
		nums1[0] = 1;
		nums2[0] = 1;
		for(int i=1; i<=k; i++) {
			if(i%2 == 0) {
				//Modify nums2 starting 2nd element
				int j = 1;
				while(j<i) {
					nums2[j] =nums1[j] + nums1[j-1];
					j++;
				}
			} else {
				//Modify nums1 starting 2nd element
				int j = 1;
				while(j<i) {
					nums1[j] =nums2[j] + nums2[j-1];
					j++;
				}
			}
		}
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
		nums[0] = 1;
		for(int i=1; i<=k; i++){
			int j = 1, prev = 1, curr;
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
		int[] arr = pascalsRow(5);
		int[] arr1 = optimizedPascalsRow(5);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
