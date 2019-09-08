/* Problem Statement:
Verified on leetcode

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]


 *
 * Time Complexity : O(n^2) worst case
 * Space Complexity : O(1) excluding the data needed by APIs
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>



/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numRows, int* returnSize, int** returnColumnSizes){
    
    int index = 0; /* for loop iteration */
    int index1 = 0;
    int **final_arr = NULL;
    int fixed_elem = 1;
    int *retColArr = NULL;
    
    /* Validations and errors handling */
    *returnColumnSizes = 0;
    *returnSize = 0;
    if (numRows == 0) {
        return final_arr;
    }
    /* Memory allocations for output arrays */
    final_arr = (int **)malloc(sizeof(int *) * numRows);
    
    if (!final_arr) {
        printf("Memory allocation failed\n");
        return final_arr;
    }
    
    retColArr = (int *)malloc(sizeof(int) * numRows);
    if (!retColArr) {
        printf("Memory allocation failed\n");
        return retColArr;
    }
    /* Go for each iteration and then run another loop inside to get the previous row data */
    for (index = 0; index < numRows; index++) {
        
        final_arr[index] = (int *)malloc(sizeof(int) * (index + 1));
        if (!final_arr[index]) {
            printf("Memory allocation failed\n");
            return final_arr;
        }
        retColArr[index] = index + 1;

        /* run for current row and use it for previous row */
        for (index1 = 0; index1 < (index+1); index1++) {
            /* Corner cases */
            if (index1 == 0 || index1 == index) {
                final_arr[index][index1] = fixed_elem;
            } else {
                final_arr[index][index1] = final_arr[index - 1][index1 - 1] + final_arr[index - 1][index1];                  
            } 
         
        }
    }
    *returnSize = numRows;
    *returnColumnSizes = retColArr;
    return final_arr;

}


int main(int argc, char *argv[]) {

    if (argc < 2) {
        printf("Usage: ./a.out <num1> ... <num n>\n");
        exit(1);
    }
    /* TODO: Write main function for it. To test, run it on LeetCode platform */
    return 0;
}


