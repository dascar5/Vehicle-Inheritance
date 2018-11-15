
public class Kamion extends Vozilo {
	private int nosivost;
	
	
	
	
	
	public Kamion() {
		this(null,null,0,0,0);
	}





	public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) {
		super(marka, model, kubikaza, godiste);
		this.nosivost = nosivost;
	}





	public int getNosivost() {
		return nosivost;
	}





	public void setNosivost(int nosivost) {
		this.nosivost = nosivost;
	}


	

	@Override
	public String toString() {
		return "Kamion [nosivost=" + nosivost + ", getMarka()=" + getMarka() + ", getModel()=" + getModel()
				+ ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}





	@Override
	public float cijenaRegistracije() {
		float reg = (((float)this.getKubikaza()/10+(2018-this.getGodiste()*10))-Vozilo.getOsnovicaZaRegistraciju()); 
		return reg;
	}

}
