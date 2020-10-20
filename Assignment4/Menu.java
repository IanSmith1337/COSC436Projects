package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* 
Menu class:

*/

public class Menu implements Iterable<MenuItem> {

    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    private ArrayList<MenuItem> menuObject;

    public Menu() {
        this.menuObject = initMenuItems();
    }

    private ArrayList<MenuItem> initMenuItems() {
        menuObject = new ArrayList<>();
        return menuObject;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new AllItemsIterator();
    }

    public Iterator<MenuItem> iterator(int type) {
        switch (type) {
            case 2:
                return new AppetizerIterator();
            case 3:
                return new MainDishIterator();
            case 4:
                return new DessertIterator();
            case 5:
                return new HeartHealthyIterator();
            default:
                break;
        }
        return new AllItemsIterator();
    }

    public class AllItemsIterator implements Iterator<MenuItem> {
        int current = 0;

        public boolean hasNext() {
            try {
                this.next();
                if (current > menuObject.size()) {
                    throw new NoSuchElementException();
                } else {
                    current--;
                }
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public MenuItem next() {
            try {
                return menuObject.get(current++);
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }

    public class AppetizerIterator implements Iterator<MenuItem> {
        int current = 0;
        MenuItem item;

        public boolean hasNext() {
            try {
                item = this.next();
                while(item.getCategory() != 1 && current < menuObject.size()) {
                    item = this.next();
                }
                if (current >= menuObject.size()) {
                    throw new NoSuchElementException();
                } else {
                    current--;
                }
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public MenuItem next() {
            try {
                return menuObject.get(current++);
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }

    public class MainDishIterator implements Iterator<MenuItem> {
        int current = 0;
        MenuItem item;

        public boolean hasNext() {
            try {
                item = this.next();
                while(item.getCategory() != 2 && current < menuObject.size()) {
                    item = this.next();
                }
                if (current >= menuObject.size()) {
                    throw new NoSuchElementException();
                } else {
                    current--;
                }
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public MenuItem next() {
            try {
                return menuObject.get(current++);
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }

    public class DessertIterator implements Iterator<MenuItem> {
        int current = 0;
        MenuItem item;

        public boolean hasNext() {
            try {
                item = this.next();
                while(item.getCategory() != 3 && current < menuObject.size()) {
                    item = this.next();
                }
                if (current >= menuObject.size()) {
                    throw new NoSuchElementException();
                } else {
                    current--;
                }
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public MenuItem next() {
            try {
                return menuObject.get(current++);
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }

    public class HeartHealthyIterator implements Iterator<MenuItem> {
        int current = 0;
        MenuItem item;

        public boolean hasNext() {
            try {
                item = this.next();
                while(!(item.heartHealthy) && current < menuObject.size()) {
                    item = this.next();
                }
                if (current > menuObject.size()) {
                    throw new NoSuchElementException();
                } else {
                    current--;
                }
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public MenuItem next() {
            try {
                return menuObject.get(current++);
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
    }

	public void add(String string, int main_dish, boolean hh, double p) {
        MenuItem appendTemp = new MenuItem(string, main_dish, hh, p);
        menuObject.add(appendTemp);
	}
}