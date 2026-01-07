package Report;

import exceptionsHandler.InvalidSaleException;

import java.util.List;
public class generateReports {
    public generateReports(List<InvalidSaleException.Sale> sales) {
        System.out.println("Generating reports for " + sales.size() + " sales.");
    }
}
