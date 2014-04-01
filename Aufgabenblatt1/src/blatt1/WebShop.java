package blatt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebShop {
	
	public List<Customer> customerListe = new ArrayList<Customer>();
	
	
	public void hinzufuegen(Customer customer){
		customerListe.add(customer);
		
	}
	
	public void entfernen(Customer customer){
		customerListe.remove(customer);
		
	}
	
	
	public void printListOfCustomers(SortierKriterium kriterium){
		switch (kriterium) {
		case SORT_ID:
			Collections.sort(customerListe, new ComperatorID());
			
			for(int i =0; i< customerListe.size() ; i++){
				System.out.println(customerListe.get(i).getNachname() + " "+  customerListe.get(i).getVorname() +" "+ customerListe.get(i).getId());
			}
			
			break;
		case SORT_NAME:
			Collections.sort(customerListe, new ComparatorName());
			for(int i =0; i< customerListe.size() ; i++){
				System.out.println(customerListe.get(i).getNachname() +" "+ customerListe.get(i).getVorname() + " " +customerListe.get(i).getId());
			}
			break;

		default:
			System.out.println("Sortierenum nicht gefunden");
			break;
		}
		
		
		
	}
	

}
