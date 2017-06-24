public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]) + 1;
                res[1] = i + 1;
            }
            map.put(diff, i);
        }
        return res;
    }
}