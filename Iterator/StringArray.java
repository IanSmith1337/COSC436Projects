package Iterator;

import java.util.*;

public class StringArray implements Iterable<String> {
    String[] values;
    public StringArray(String[] values){
        this.values = values;
    }

    public Iterator<String> iterator() {
        return new ArrayIterator();
    }


    public class ArrayIterator implements Iterator<String> {
        int current = 0;

        public boolean hasNext() {
            try {
                this.next();
                current--;
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public String next() {
            try {
                return values[current++];
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }
}