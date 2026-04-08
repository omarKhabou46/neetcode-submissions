class Solution {
    public boolean isAnagram(String s, String t) {
    //    if (s.length() != t.length()) {
    //     return false;
    //    }else {
    //     char[] charArray1 = s.toCharArray();
    //     char[] charArray2 = t.toCharArray();
    //     Arrays.sort(charArray1);
    //     Arrays.sort(charArray2);
    //     for (int i = 0; i < charArray1.length; i++) {
    //         if (charArray1[i] != charArray2[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    //    }


    if (s.length() != t.length()) {
    return false;
    }else {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char a = s.charAt(i);
        if (!map.containsKey(a)) map.put(a, 1);
        else map.put(a, map.get(a) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
        char a = t.charAt(i);
        if (!map.containsKey(a)) return false;
        else map.put(a, map.get(a) - 1);
    }

    for (Integer c : map.values()) {
        if (c != 0) return false;
    }
    
    return true;
   
    }

    }
}
