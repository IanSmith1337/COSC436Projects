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

    void showData() {
        System.out.println(Arrays.toString(data));
    }
}