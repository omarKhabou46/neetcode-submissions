class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //     Map<String, List<String>> map = new HashMap<>();
    //     List<List<String>> listeOfList = new ArrayList<>();
    //     for (int i = 0; i < strs.length; i++) {
    //         char[] arr = strs[i].toCharArray();
    //         Arrays.sort(arr);
    //         String s = new String(arr);
    //         if (!map.containsKey(s)) {
    //             List<String> liste = new ArrayList<>();
    //             liste.add(strs[i]);
    //             map.put(s, liste);
    //         }else {
    //             List<String> value = map.get(s);
    //             value.add(strs[i]);
    //             map.put(s, value);
    //         }
    //     }

    //     for (List<String> liste : map.values()) {
    //         listeOfList.add(liste);
    //     }

    //     return listeOfList;
    // }

    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> listeOfList = new ArrayList<>();

    for (int i = 0; i < strs.length; i++) { 
        byte[] arr = new byte[26];
        String str = strs[i];
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            int a = c - 'a';
            arr[a] += 1;
        }
        String s = new String(arr);
        if (!map.containsKey(s)) {
            List<String> liste = new ArrayList<>();
            liste.add(strs[i]);
            map.put(s, liste);
        }else {
            List<String> value = map.get(s);
            value.add(strs[i]);
            map.put(s, value);
        }
    }

    for (List<String> liste : map.values()) {
            listeOfList.add(liste);
       }

    return listeOfList;
}

}
