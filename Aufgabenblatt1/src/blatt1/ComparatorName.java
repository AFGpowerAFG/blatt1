package blatt1;

import java.util.Comparator;

public class ComparatorName implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		
		return customer1.getNachname().compareTo(customer2.getNachname());
	}

}
