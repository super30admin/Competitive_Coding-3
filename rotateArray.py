class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k %= len(nums)
        self.reverse(nums,0,len(nums)-1)
        self.reverse(nums,0,k-1)
        self.reverse(nums,k,len(nums)-1)



    def reverse(self, nums: List[int], start: int, end: int):
        while start < end:
            nums[start],nums[end] = nums[end],nums[start]
            start +=1
            end -=1
