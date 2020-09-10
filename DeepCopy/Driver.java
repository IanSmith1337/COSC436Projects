package DeepCopy;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {3, 7, 9};
        Shallow s = new Shallow(nums);
        s.showData();
        nums[0] = 13;
        s.showData();
    }
}
