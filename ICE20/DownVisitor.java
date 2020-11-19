package ICE20;

public class DownVisitor implements Visitor {
    String visitType = "down visit on ";
    public void visit(BAR bar) {
        System.out.println(visitType + bar.getName());
    }
    public void visit(FOO foo) {
        System.out.println(visitType + foo.getName());
    }
    public void visit(BAZ baz) {
        System.out.println(visitType + baz.getName());
    }
}
