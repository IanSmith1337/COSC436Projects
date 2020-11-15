package Assignment5.TaxComputation;

public class MDTaxComputation extends TaxComputation {
	
	public double computeTax(PurchasedItems items, ReceiptDate date) {
		// calls private method taxHoliday as part of this computation
	}

	private boolean taxHoliday(ReceiptDate date);
		// returns true if date of receipt within the state’s tax free holiday,
		// else returns false. Supporting method of method computeTax.	
}