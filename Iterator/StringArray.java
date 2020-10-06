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

    public Iterator<String> longStringIterator() {
        return new LongStringIterator();
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

    public class LongStringIterator implements Iterator<String> {
        int current = 0;
        String item = "";

        public boolean hasNext() {
            try {
                item = this.next();
                while(item.length() < 4 || current > values.length) {
                    item = this.next();
                }
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