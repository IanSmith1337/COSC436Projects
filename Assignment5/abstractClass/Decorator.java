package Assignment5.abstractClass;

import Assignment5.interfaces.Receipt;

public abstract class Decorator implements Receipt {
	private Receipt trailer;

	protected Decorator(Receipt r) {
		trailer = r;
	}

	protected void callTrailer()  {
		trailer.prtReceipt();
	}

	public abstract void prtReceipt();
}