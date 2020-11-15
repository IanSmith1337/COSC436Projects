package Assignment5.TaxComputation;

import Assignment5.Class.*;
import Assignment5.abstractClass.*;
import java.util.Calendar;

public class MDTaxComputation extends TaxComputation {
	
	public double computeTax(PurchasedItems items, ReceiptDate date) {
        taxHoliday(date);
        if(//there is NO tax holiday)
        {
            
        }
        else //tax holiday
        {
            //calculate no tax
        }
        }
		// calls private method taxHoliday as part of this computation
    }

    private boolean taxHoliday(ReceiptDate date)
    {
        if(date  )
    }
    
		// returns true if date of receipt within the state’s tax free holiday,
		// else returns false. Supporting method of method computeTax.	
}

//  tax computation objects for other states are similar  (to be completed)