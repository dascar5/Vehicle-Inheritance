import java.util.ArrayList;
public class Test {
	

		public static void main(String[]args) {
			
			Vozilo.setOsnovicaZaRegistraciju((float)0.6);
			
			
			ArrayList<Vozilo>niz=new ArrayList<Vozilo>();			
			niz.add(new Automobil("Audi","A4",2000,2003,5,5));
			niz.add(new Automobil("BMW","M3",3000,2010,5,5));
			niz.add(new Kamion("MAN","T32",5000,1985,10));
			niz.add(new Kamion("Tamic","???",3000,1982,5));
			niz.add(new Motocikl("Tomos","T5",49,1988,10000));
			niz.add(new Motocikl("Ducati","2324",1200,2012,2000));		
			
			float cijena = 0;
			
			for(Vozilo a:niz) {
				System.out.println(a);
				cijena+=a.cijenaRegistracije();
			}
			System.out.println("Ukupno da platis " + cijena + "EUR");
			
		}
}











/*Vozilo.setOsnovicaZaRegistraciju((float) 0.6);
Automobil a = new Automobil("Lada","Special",1500,1975,5,5);
System.out.println(a.cijenaRegistracije());
System.out.println(a);*/


/*for(int i=0;i<niz.length;i++){
System.out.println(a);
cijena+=a.cijenaRegistracije();*/