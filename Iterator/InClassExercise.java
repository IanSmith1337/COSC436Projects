package Iterator;

import java.util.*;

public class InClassExercise {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList  = new ArrayList<String>(5); 

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");
        print1(stringArrayList); 
        print2(stringArrayList);

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("one");
        stringTreeSet.add("two");
        stringTreeSet.add("three");
        stringTreeSet.add("four");
        stringTreeSet.add("five");
        print3(stringTreeSet);
        
    }

    public static void print1(ArrayList<String> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void print2(ArrayList<String> a){
        for (String string : a) {
            System.out.println(string);
        }
    }

    public static void print3(TreeSet<String> t){
        System.out.println(t);
    }
}
