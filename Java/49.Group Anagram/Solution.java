class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> results = new HashMap();
        for(String str : strs)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            if(!results.containsKey(sortedString)){
                results.put(sortedString,new ArrayList());
            }
            results.get(sortedString).add(str);
        }

        return new ArrayList<>(results.values());
    }
}