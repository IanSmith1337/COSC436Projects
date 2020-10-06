package Iterator;

import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        String[] items = {"one", "two", "three", "four", "five"};
        StringArray stringArray = new StringArray(items);

        Iterator i = stringArray.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
