package DeepCopy;

import java.util.Arrays;

public class Deep {
    private int[] data;

    public Deep(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData()
    {
        System.out.println(Arrays.toString(data));
    }
}
