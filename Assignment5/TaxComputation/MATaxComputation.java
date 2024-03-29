package Assignment5.TaxComputation;

import Assignment5.Class.*;
import Assignment5.abstractClass.*;

import java.util.Calendar;

public class MATaxComputation extends TaxComputation {
	
	public double computeTax(PurchasedItems items, Calendar date) {
        if(!taxHoliday(date)){
            return 0.0625;
        }
        else {
            return 0.00;
        }
    }

	protected boolean taxHoliday(Calendar date){
		return (date.get(Calendar.MONTH) == 8 && (date.get(Calendar.DAY_OF_MONTH) > 8 && date.get(Calendar.DAY_OF_MONTH) > 14));
	}
}
