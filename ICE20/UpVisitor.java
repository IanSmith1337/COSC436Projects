package ICE20;

public class UpVisitor implements Visitor {
    String visitType = "up visit on ";
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
