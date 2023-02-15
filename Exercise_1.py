#Time Complexity : O(N), N being the number of values in the triangle. 
#Space Complexity : O(1), because the triangle is returned.
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had to do a little debugging, but not too 
#serious. 

#Your code here along with comments explaining your approach in three sentences only
'''Create the first two rows in the pascal's triangle as needed. Then, create the next
row from the row before if the triangle isn't complete. 
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #if triangle is only 1 or two rows. 
        if numRows==0:
            return []
        elif numRows==1:
            return [[1]]
        elif numRows==2:
            return [[1],[1,1]]
        else:
            #if the triangle is more than two rows. 
            result = [[1], [1,1]]
            count = 2
            while(numRows>count):
                #initialize the values with left and right. 
                prev = result[len(result)-1]
                temp = []
                temp.append(1)
                left = 0
                right=1
                curr = 1
                #iterate until new row is create and append to final array.
                while(right<len(prev)):
                    value = prev[left]+prev[right]
                    
                    temp.append(value)
                    left = left+1
                    right = right+1
                    curr = curr +1
                temp.append(1)
                result.append(temp)
                count = count+1
            return result