package Assignment5.abstractClass;

import java.util.Calendar;
import Assignment5.Class.*;

public abstract class TaxComputation {
	public abstract double computeTax(PurchasedItems items, Calendar date);
	protected abstract boolean taxHoliday(Calendar date);
}


