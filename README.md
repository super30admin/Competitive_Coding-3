# Competitive_Coding-3

Please submit the interview problems posted in slack channel here. The problems and statements are intentionally not shown here so that students are not able to see them in advance 


### Question 1 
https://leetcode.com/problems/pascals-triangle/

First we will store [1] for numrows = 1 case and [1, 1] for numrows = 2 case. Then we will iterate for numrows-2 times as we already got the first 2 rows of our pascal triangle. Then we will get the previous list from result List and iterate over the previous list with 2 pointers. We will add the first and second element and store the result in new list and increment both the pointers. In this list we will store the first and last element as 1 as it will always be 1 in any case.

### Question 2
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

Here first we will store unique index of each element. Then we will iterate over the given nums array. Now suppose the difference between current element and k is already there in the hashmap that means there exists a pair in an array which has k difference. So, we will increase the count which we need to return at the end and at the same time we will remove that diffrence from hashmap as well. So, we won't use same element again to make a different pair. For edge case such as if k = 0 we will check if we are not deleting the same element from itself we will check if given index i is not equal to the difference. 