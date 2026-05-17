class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                                        (a, b) -> map.get(b) - map.get(a) );

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            Integer key = entry.getKey();
            Integer value = entry.getValue();

            pq.add(key);
        }

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
       
    }
}
