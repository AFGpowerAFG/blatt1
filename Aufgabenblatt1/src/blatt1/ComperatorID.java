package blatt1;

import java.util.Comparator;
//TODO Generics
public class ComperatorID implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		if (customer1.getId() < customer2.getId()) {
			return -1;
			
		}
		if (customer1.getId() == customer2.getId()) {
			return 0;
			
		}
		
		
			return 1;
			
		

	}

}
