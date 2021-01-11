class Solution:
    def isPalindrome(self, s: str) -> bool:
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of string
        
        s = ''.join(ch.lower() for ch in s if ch.isalnum())
    
        left, right = 0, len(s) - 1
    
        while left <= right:
            if s[left] == s[right]:
                left += 1
                right -= 1
            else:
                return False
            
        return True