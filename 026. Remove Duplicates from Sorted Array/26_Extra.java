import java.util.HashSet;
import java.util.Set;

public class Extra {
    /**
     * 返回不重复数组长度
     */
    public int returnLength(int[] nums) {
        int j = 1;
		int times = 0;
		for (int i = 0; i < nums.length; i = j) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					times++;
				} else {
					break;
				}
			}
		}
		return nums.length - times;
    }
     public int returnLength2(int[] nums) {
        
        Set set = new HashSet<>();
        for (int i : nums) {
            set.add(nums[i]);
        }
		return set.size();
    }
}
