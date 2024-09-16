package com.ds.rani.twopointers;

/**
 * Pascal's triangle is a triangular 2-D array of integers which can be constructed from the following points:
 * The first row has th number 1.
 * For each subsequent row, each element is the sum of the numbers directly above it, on either side.
 * For example, here are the first few rows:
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * <p>
 * K is an input, then you have to return the kth row of Pascal's triangle. Do this using O(k) space.
 */

//Approach:Use 2D array traversing approach,for every row 0th col val and last column value is always 1,
//For other case (not 0th column or last column) value is value from the previous row same column+ previous row,col-1
//time Complexity:o(K^2) where k is the input
//space complexity:o(k)  as I have used 1D array
public class PascalTriangle {

    public static void printPascal(int k) {
        int[] arr = new int[k];
        for (int row = 0; row < k; row++)
        {
            for (int col = row; col >= 0; col--)
            {
                // First and last values in every row are 1
                if (row == col || col == 0)
                    arr[col] = 1;
                else // Other values are sum of current index for previous row and its previoues value
                    arr[col] = arr[col]+arr[col - 1] ;
                System.out.print( arr[col] + " " );
            }
            System.out.println( " " );
        }
    }


    public static void main(String[] args) {
        printPascal( 7 );

    }
}
