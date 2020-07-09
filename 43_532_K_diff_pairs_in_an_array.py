# June 14, 2020

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        '''
        Method 2 :
        Time complexity : O(n)
        Space complexity : O(n), when all unique elements, a little less than n with som duplicate elements

        - Absolute difference is k
        - separate out the test cases k>0, k<0,k==0
        - unique values are expected, so probably we can consider hashmap
        - separate cases for k>0 and k == 0
        - key + k = key itself, so if key+k in dict : will increase the number of pairs for 1 2 3 4 5 and give op as 5 pairs, but there are no pairs
        - because for : 1 1 2 2 2 3 3 3 , here 3 pairs is the output, but if key+k in dict : will return 8 pairs
        - Test cases :  3 1 4 5 1, k = 2; 3 1 4 5 4 5 ,k = 0
        '''

        dict = {}

        n = len(nums)
        pairs = 0

        for i in range(n):

            if nums[i] in dict:
                dict[nums[i]] += 1
            else:
                dict[nums[i]] = 1

        print(dict)

        # here we check for only key+k
        # eg. 3 : 1, 1:2, 4: 1, 5 : 1
        # this hashmap will take (3,5) (1, 3) also, hence we do not need double check, key+k key-k
        for key in dict:

            if k > 0:
                if key + k in dict:  # my key and key+k will be different only when k>0
                    print('pairs', key, key + k)
                    pairs += 1

            # special case :
            # all duplicate elements in hashmap will have count > 1
            # so here 1 1 , 1 1 1 will have only 1 pair ( 1 , 1)
            elif k == 0:  # hasmap having counts more than 1 w
                if dict[key] > 1:  # 1 1 1 2 3
                    pairs += 1

        print('no. of pairs', pairs)
        return pairs

        '''
        Method 1 :
        Time complexity : O(n)
        Space complexity : O(n)
        - Brute force : O (n^2)
        - Considering all the pairs, 
        - probably putting it in a list and then checking for uniqueness in that list ( removing duplicate values from that list)
        '''
