package Assignment4;

import java.util.*;

/* 
Menu class:

*/

public class Menu implements Iterable<MenuItem> {

    public final int APPETIZERS = 1;
    public final int MAIN_DISH = 2;
    public final int DESSERT = 3;
    private ArrayList<MenuItem> menuObject;

    public Menu() {
        this.menuObject = initMenuItems();
    }

    private ArrayList<MenuItem> initMenuItems() {
        menuObject = new ArrayList<>();
        MenuItem item = new MenuItem("Mac and Cheese", MAIN_DISH, false, 10.99);
        MenuItem item2 = new MenuItem("Garlic Naan", APPETIZERS, false, 5.99);
        MenuItem item3 = new MenuItem("Sushi", APPETIZERS, true, 19.99);
        menuObject.add(item);
        menuObject.add(item2);
        menuObject.add(item3);
        return menuObject;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new AllItemsIterator();
    }

    public Iterator<MenuItem> iterator(int type, int price) {
        switch (type) {
            case 2:
                return new AppetizerIterator();
                break;
            case 3:
                return new MainDishIterator(price);
                break;
            case 4:
                return new DessertIterator();
                break;
            case 5:
                return new HeartHealthyIterator();
                break;
            case 6:
                return new MainDishIterator(price);
                break;
            default:
                iterator();
                break;
        }
        return new AllItemsIterator();
    }

    public class AllItemsIterator implements Iterator<MenuItem> {
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
                while(item.length() < 4 || current < values.length) {
                    item = this.next();
                }
                current--;
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
        double price;

        public MainDishIterator(double price) {
            if (price > 0) {  
                this.price = price;
            }
        }

        public boolean hasNext() {
            try {
                item = this.next();
                while(item.length() < 4 || current < values.length) {
                    item = this.next();
                }
                current--;
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
                while(item.length() < 4 || current < values.length) {
                    item = this.next();
                }
                current--;
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
                while(item.length() < 4 || current < values.length) {
                    item = this.next();
                }
                current--;
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