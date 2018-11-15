
public class Automobil extends Vozilo {
	private int brojVrata;
	private int brojOsoba;
	
	
	
	//default constructor, za pozivanje
	public Automobil() {
		this(null, null, 0, 0, 0, 0);
	} 

	//generate constructors ali izaberes da invoke vozilo(string, string, int, int)
	public Automobil(String marka, String model, int kubikaza, int godiste, int brojVrata, int brojOsoba) {
		super(marka, model, kubikaza, godiste);
		this.brojVrata = brojVrata;
		this.brojOsoba = brojOsoba;
	}

	//geteri i seteri
	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public int getBrojOsoba() {
		return brojOsoba;
	}

	public void setBrojOsoba(int brojOsoba) {
		this.brojOsoba = brojOsoba;
	}

	
	

	//formula za registraciju automobila
	@Override
	public float cijenaRegistracije() { //ovdje stavjen float jer su prva dva int
		float reg = ((float)this.getKubikaza()/10+(2018-this.getGodiste())*10)*Vozilo.getOsnovicaZaRegistraciju(); //statickim metodama pristupamo preko naziva klase
		return reg;
	}

	//to string za automobil, izabrane inherited metode iz vozila za nasledjivanje
	@Override
	public String toString() {
		return "Automobil [brojVrata=" + brojVrata + ", brojOsoba=" + brojOsoba + ", getMarka()=" + getMarka()
				+ ", getModel()=" + getModel() + ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste()
				+ "]";
	}

}
