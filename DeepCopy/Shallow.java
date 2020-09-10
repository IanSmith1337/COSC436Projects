package DeepCopy;

import java.util.Arrays;

/**
 * Shallow
 */
public class Shallow {
    private int[] data;

    public Shallow(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 9};
        Shallow s = new Shallow(nums);
        s.showData();
        nums[0] = 13;
        s.showData();
    }
}