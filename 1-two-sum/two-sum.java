class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i=0; i<nums.length; i++) 
        {
            int req_num = target - nums[i];
            if (hm.containsKey(req_num))
            {
                int[] ar={hm.get(req_num),i};
                return ar;
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}