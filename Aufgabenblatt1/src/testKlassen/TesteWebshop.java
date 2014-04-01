package testKlassen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import blatt1.Customer;
import blatt1.SortierKriterium;
import blatt1.WebShop;

public class TesteWebshop {

	private WebShop webshop;
	private Customer customer;

	@Before
	public void setUp() throws Exception {
		webshop = new WebShop();

	}

	@Test
	public void testHinzufuegen() {
		customer = new Customer("Coca", "Cola");

		assertFalse("Teste hinzufuegen",
				webshop.customerListe.contains(customer));

		webshop.hinzufuegen(customer);

		assertTrue("Teste hinzufuegen",
				webshop.customerListe.contains(customer));

	}

	@Test
	public void testEntfernen() {
		customer = new Customer("Coca", "Cola");
		webshop.hinzufuegen(customer);
		
		assertTrue("Teste hinzufuegen",
				webshop.customerListe.contains(customer));
		webshop.entfernen(customer);
		assertFalse("Teste hinzufuegen",
				webshop.customerListe.contains(customer));
	}

	@Test
	public void testSortieren() {
		Customer c1 = new Customer("Steve", "Wozniak");
		Customer c2 = new Customer("Steve", "Jobs");
		Customer c3 = new Customer("Bill", "Gates");

		webshop.hinzufuegen(c1);
		webshop.hinzufuegen(c2);
		webshop.hinzufuegen(c3);

		webshop.printListOfCustomers(SortierKriterium.SORT_NAME);

		assertTrue(
				"Pruefe Sortieren",
				(webshop.customerListe.get(0).getNachname().equals("Gates"))
						&& (webshop.customerListe.get(1).getNachname()
								.equals("Jobs"))
						&& (webshop.customerListe.get(2).getNachname()
								.equals("Wozniak")));

	}
	
	
	@Test
	public void testSortierenID() {

	    WebShop webshop2 = new WebShop();
	 
		Customer c1 = new Customer("Steve", "Wozniak");
		Customer c2 = new Customer("Steve", "Jobs");
		Customer c3 = new Customer("Bill", "Gates");

		webshop2.hinzufuegen(c1);
		webshop2.hinzufuegen(c2);
		webshop2.hinzufuegen(c3);

		webshop2.printListOfCustomers(SortierKriterium.SORT_ID);

		assertTrue(
				"Pruefe Sortieren",
				(webshop2.customerListe.get(0).getId() == 3 )
						&& (webshop2.customerListe.get(1).getId() == 4)
								
						&& (webshop2.customerListe.get(2).getId() == 5 ) );

	}
	
	

}
