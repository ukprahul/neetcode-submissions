class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String result = new String(a);
            if(!hm.containsKey(result)){
                hm.put(result, new ArrayList<>());
            }
            hm.get(result).add(strs[i]);
        }       
        return new ArrayList<>(hm.values());   
    }
}
