class Solution {
    public boolean isPalindrome(String s) {
      if (s.isEmpty()) return true;
      s = s.toLowerCase();
      StringBuilder str = new StringBuilder();
      for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int a = c;
        if ((a >= 48 && a <= 57) || (a >= 97 && a<= 122)) {
                str.append(c);
        }
      }

      String newStr = str.toString();
      int i = 0;
      int j = newStr.length() - 1;
      while(i < j) {
        if (newStr.charAt(i) != newStr.charAt(j)) return false;
        i++;
        j--;
      }
  
       return true;
    }
}
