package ICE20;

public class VisitorDemo {
    public static void main(String[] args) {
        Element[] list = {new FOO(), new BAR(), new BAZ()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element e : list) {
            e.accept(up);
        }
        for (Element e : list) {
            e.accept(down);
        }
    }   
}