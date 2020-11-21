package Assignment5.TaxComputation;

import Assignment5.Class.*;
import Assignment5.abstractClass.*;

import java.util.Calendar;

public class CATaxComputation extends TaxComputation {
	
	public double computeTax(PurchasedItems items, Calendar date) {
		return .075;
	}

	protected boolean taxHoliday(Calendar date) {
		return false;
	}
}