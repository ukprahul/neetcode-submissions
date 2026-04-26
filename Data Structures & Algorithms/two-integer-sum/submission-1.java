class Solution {
    public int[] twoSum(int[] nums, int target) {
        //O(n2)
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};
        //O(n)
        HashMap<Integer, Integer>hm = new HashMap<>();
        hm.put(nums[0],0);
        for(int i = 1 ; i<nums.length;i++){
            int x = target - nums[i];
            if(hm.containsKey(x)){
                return new int[]{hm.getOrDefault(x,0),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}