
public abstract class Vozilo {
	private String marka;
	private String model;
	private int kubikaza;
	private int godiste;
	private static float osnovicaZaRegistraciju;
	
	public Vozilo() {
		this(null,null,0,0);   //pozivanje stvari iz konstruktora, mora se odradit, ide prvo get set, pa konstruktori, pa ovo
	}
	
	public Vozilo(String marka, String model, int kubikaza, int godiste) {
		super();
		this.marka = marka;   //this.setMarka(marka) po njegovom ali moze i ovo moje
		this.model = model;
		this.kubikaza = kubikaza;
		this.godiste = godiste;
		}
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public static float getOsnovicaZaRegistraciju() {
		return osnovicaZaRegistraciju;
	}
	public static void setOsnovicaZaRegistraciju(float osnovicaZaRegistraciju) {
		Vozilo.osnovicaZaRegistraciju = osnovicaZaRegistraciju;
	}

	public abstract float cijenaRegistracije(); //ne mozemo je realizovati jer je abstraktna, nema instanci, sluzi samo za nasledjivanje

	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	} //generate to string, automatski
	
	
	
	
}
