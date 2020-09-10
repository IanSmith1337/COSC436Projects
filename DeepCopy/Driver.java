package DeepCopy;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {3, 7, 9};
        Shallow s = new Shallow(nums);
        Deep d = new Deep(nums);
        System.out.println("Shallow (Before Modification):");
        s.showData();
        System.out.println("\n");
        System.out.println("Deep (Before Modification):");
        d.showData();
        System.out.println("\n");
    
        nums[0] = 13;
        System.out.println("Shallow (After Modification)");
        s.showData();
        System.out.println("\n");
        System.out.println("Deep (After Modification):");
        d.showData();
        System.out.println("\n");
    }
}
