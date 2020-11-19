package ICE20;

public class BAR implements Element {

	@Override
	public void accept(Visitor v) {
	
        v.visit(this);
    }

	public String getName() {
		return this.getClass().toString();
	} 

    
    


}
