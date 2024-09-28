class Solution {
        public String longestPalindrome(String s) {
            String result = s.substring(0, 1);
            int len = s.length();
            int left = 0;
            int right = 0;

            for(int i=0;i<len;i++){
                left = i - 1;
                right = i + 1;
                while(left >= 0 && right < len){
                    // odd
                    String palindromeOdd = s.substring(left, right+1);
                    // even
                    String palindromeEven = s.substring(left, right);
                    // System.out.println(palindromeOdd);
                    // System.out.println(palindromeEven);

                        if ((result.length() < palindromeOdd.length()) && (palindromeOdd.equals(reverse(palindromeOdd)))) {
                            result = palindromeOdd;
                            System.out.println(result);
                        }
                        if ((result.length() < palindromeEven.length()) && (palindromeEven.equals(reverse(palindromeEven))) ) {
                            result = palindromeEven;
                            System.out.println(result);
                        }
                    left = left - 1;
                    right = right + 1;
                }
                if(left < 0){
                    while(right <= len){
                        String palindrome = s.substring(i, right);
                        if(result.length() < palindrome.length()) {
                            if (palindrome.equals(reverse(palindrome))) {
                                {
                                    result = palindrome;
                                }
                            }
                        }
                        right = right + 1;
                    }
                }
                if(right <= len){
                    while(left >= 0){
                    String palindrome = s.substring(left, right);
                     if(result.length() < palindrome.length()){
                                if(palindrome.equals(reverse(palindrome))) {
                                    result = palindrome;
                                }
                            }

                        left = left - 1;
                    }
                }
            }
            return result;
        }
        public String reverse(String s){
            char[] reverseArray = new char[s.length()];
            int len = s.length() - 1;

            for (int i=0; i<s.length();i++){
                reverseArray[i] = s.charAt(len);
                len = len - 1;
            }
            String reversed = new String(reverseArray);
            return reversed;
        }    
    }
