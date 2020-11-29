package Assignment6.UIDecorator;

public abstract class UIDeco implements UIElements {
    UIElements elements;

    @Override
    public void create() {
        elements.create();
    }
}
