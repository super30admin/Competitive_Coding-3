from pip import List
#Time Complexity = O(n^2)
#Space Complexity = O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        list1 = []
        for i in range(1,numRows+1):
            print(i)
            list2 = [0 for x in range(i)]
            for j in range(i):
                if(j==0 or j==i-1):
                    list2[j]=1
                else:
                    list2[j] = list1[i-2][j]+list1[i-2][j-1]
            list1.append(list2)
            print(list1)
        return list1
        