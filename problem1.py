# time complexity is O(n2) and space complexity is O(nm)
class Problem1:
    def generate(self, numRows):
        res = [[1]]
        
        for i in range(numRows-1):
            temp = [0]+res[-1]+[0]
            row = []
            for j in range(len(res[-1])+1):
                row.append(temp[j]+ temp[j+1])
            res.append(row)
        return res
    
        

                