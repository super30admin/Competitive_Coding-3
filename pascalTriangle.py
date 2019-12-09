class Solution(object):
    def pascalTriangle(self, k):
        triangle = [[1]]
        for i in range(1,k):
            temp = [1]
            for j in range(len(triangle[i-1])-1):
                temp.append(triangle[i-1][j] + triangle[i-1][j+1])
            temp.append(1)
            triangle.append(temp)
        return(triangle[k-1])


obj = Solution()
print(obj.pascalTriangle(6))