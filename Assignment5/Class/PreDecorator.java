package Assignment5.Class;

import Assignment5.abstractClass.Decorator;
import Assignment5.interfaces.AddOn;
import Assignment5.interfaces.Receipt;

public class PreDecorator extends Decorator {
	private AddOn a;

	public PreDecorator(AddOn a, Receipt r) {
		super(r);
		this.a = a;
	}

	public void prtReceipt() {
		System.out.println(a.getLines());
		callTrailer();
	}
}