/*
time complexitu: O(n), n is the length of string
space complexity: O(1)
*/
class ValidPalindrome {
    
       // s = s.replaceAll("[^a-zA-Z0-9]", "");
       // s = s.toLowerCase();
       // System.out.println(s);
      public boolean isPalindrome(String s) 
    {  
        int low =0;
        int high =s.length()-1;
        
        while(low < high)
        {
            while(low < high && !Character.isLetterOrDigit(s.charAt(low)))
            {
                low++;
            }
            while(low < high && !Character.isLetterOrDigit(s.charAt(high)))
            {
                high--;
            }
            
            if( low < high && Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high)))
            {
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        
        
        return true;
    }
}