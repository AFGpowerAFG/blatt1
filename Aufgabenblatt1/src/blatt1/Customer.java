package blatt1;

public class Customer {

	private String vorname;
	private String nachname;
	private int id;
	private static int statischerZaehler=0;
	
	public Customer( String vorname, String nachname ) {
		this.vorname = vorname;
		this.nachname =nachname;
		statischerZaehler++;
	    this.id = statischerZaehler;

	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
