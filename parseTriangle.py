class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for idx in range(0,numRows):
            rowbuilder = []
            for rowelement in range(0,idx+1):
                if rowelement == 0 or rowelement == idx:
                    rowbuilder.append(1)
                else:
                    left = result[idx-1][rowelement-1]
                    mid = result[idx-1][rowelement]
                    rowbuilder.append(left+mid)
            result.append(rowbuilder)
        return result