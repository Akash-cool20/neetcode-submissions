class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int []arr = new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a'] += 1;
            }
            String key = Arrays.toString(arr);
            if(map.containsKey(key)){
                map.get(key).add(s); 
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key, temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}
