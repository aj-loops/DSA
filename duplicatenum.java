import java.util.HashMap;

public class duplicatenum {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {

            if (map.containsKey(key)) {
                // map.put(key, map.get(key)+1);
                return key;
            } else {
                map.put(key, 1);
            }
        }
        return 0;
    }
}
