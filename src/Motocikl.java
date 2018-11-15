
public class Motocikl extends Vozilo {
	private int kilometraza;
	
	
	
	
	public Motocikl() {
		this(null,null,0,0,0);
	}


	public Motocikl(String marka, String model, int kubikaza, int godiste, int kilometraza) {
		super(marka, model, kubikaza, godiste);
		this.kilometraza = kilometraza;
	}
	
	
	public int getKilometraza() {
		return kilometraza;
	}


	public void setKilometraza(int kilometraza) {
		this.kilometraza = kilometraza;
	}





	@Override
	public String toString() {
		return "Motocikl [kilometraza=" + kilometraza + ", getMarka()=" + getMarka() + ", getModel()=" + getModel()
				+ ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}


	@Override
	public float cijenaRegistracije() {
		float reg = ((float)this.getKubikaza()/5-(float)(this.getKilometraza())/100)*Vozilo.getOsnovicaZaRegistraciju();
		return reg;
	}

}
