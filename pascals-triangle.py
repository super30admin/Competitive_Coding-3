# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

from typing import List


class Solution:
    def gen_list(self, n, prev):
        #print("count is: ", n)
        #print("prev_li is:", prev)

        if n == 0:  # the base condition
            return [1]  # first row of the triangle

        else:
            # printing only 1's in the list of list of integers
            li = [1] * (n+1)
            #print("after [1]*(n+1) is: ", li)
            if n > 1:  # if count is greater than 1

                for i in range(1, n):  # running a loop within the range of 1 to total count

                    #print("inside for loop now for i=", i)
                    li[i] = prev[i-1] + prev[i]
                    #print("li[i] is now:", li[i], "....and the list is: ", li)

            #print("Now finally returning list as: ", li)
            return li

    def generate(self, numRows: int) -> List[List[int]]:
        # initializing
        li = []  # li will be the current list
        prev_li = []  # the list prev to current

        count = 0  # to keep the track of the count incrementing in the list
        triangle = []  # the final triangle list

        while count != numRows:  # we will run the while till the count is not equal to number of rows i.e. because the count and numRows are going to be the same
            # calling the gen_list function in li

            li = self.gen_list(count, prev_li)
            prev_li = li  # making the prev to be current list

            # appending the list of integers in the list li
            triangle.append(li)
            count = count + 1  # incrementing the count after every append

        return triangle
