//Time Complexity:O(n)
//Space Complexity:O(n)

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {

        int maxsum = 0;
        int currsum = 0;
        Map<Integer, Integer> track = new HashMap<>();

        track.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            currsum += nums[i] == 0 ? -1 : nums[i];

            if(track.containsKey(currsum)){
                maxsum = Math.max(maxsum, i - track.get(currsum));
            } else {
                track.put(currsum, i);
            }

        }

        return maxsum;
    }
}
