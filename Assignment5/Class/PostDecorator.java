package Assignment5.Class;
import Assignment5.abstractClass.*;
import Assignment5.interfaces.*; 

public class PostDecorator extends Decorator {

	private AddOn a;

	public PostDecorator(AddOn a, Receipt r) {
		super(r);
		this.a = a;
	}

	public void prtReceipt() {
		System.out.println(a.getLines());
		callTrailer();
	}
}

// similar, except that prtReceipt print the add on information
// after the other parts of the receipt are printed