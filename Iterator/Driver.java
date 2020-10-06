package Iterator;

import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        String[] nums = {"one", "two", "three", "four", "five"};
        String[] cars = {"subaru", "chevrolet", "toyota", "kia", "nissan"};

        StringArray stringArray = new StringArray(nums);
        StringArray longStringArray = new StringArray(nums);

        Iterator i = stringArray.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        Iterator longI = longStringArray.longStringIterator();

        while (longI.hasNext()) {
            System.out.println(longI.next());
        }
    }
}
