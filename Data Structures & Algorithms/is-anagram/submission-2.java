class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else {
                int value = hm.get(s.charAt(i));
                hm.put(s.charAt(i),value+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!hm1.containsKey(t.charAt(i))){
                hm1.put(t.charAt(i),1);
            }else {
                int value = hm1.get(t.charAt(i));
                hm1.put(t.charAt(i),value+1);
            }
        }
        if(hm.equals(hm1)){
            return true;
        }
        return false;
    }
}
