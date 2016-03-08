package schinnBehnFinal;
import java.util.*;
public class Produktregister {
	
	public Produktregister() {
		Produkt p = new Produkt();
		p.setNamn("Köttkorv");
		p.setPris(70);
		p.setArtikelNr("1");
		produktLista.add(p);
		
		p = new Produkt();
		p.setNamn("Rostbiff");
		p.setPris(100);
		p.setArtikelNr("2");
		produktLista.add(p);
		
		p = new Produkt();
		p.setNamn("Aladåb");
		p.setPris(500);
		p.setArtikelNr("3");
		produktLista.add(p);
	}
	private ArrayList<Produkt> produktLista = new ArrayList<Produkt>();
	private int i = 4;

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public ArrayList<Produkt> getProduktLista() {
		return produktLista;
	}
	public void setProduktLista(ArrayList<Produkt> produktLista) {
		this.produktLista = produktLista;
	}
	public Produkt hittaProdukt(String artikelNr) {
		for(Produkt tmp : produktLista){
			if(tmp.getArtikelNr().equals(artikelNr)){
				return tmp;
			}
		}
		return null;
	}
	public void nyProdukt(String namn, double pris) {
		Produkt p = new Produkt();
		p.setArtikelNr(String.valueOf(i));
		p.setNamn(namn);
		p.setPris(pris);
		produktLista.add(p);
		i++;
	}
	public void uppdateraProdukt(String artikelNr, String namn, double pris) {
		Produkt p = hittaProdukt(artikelNr);
		p.setArtikelNr(artikelNr);
		p.setNamn(namn);
		p.setPris(pris);
	}
	public void taBortProdukt(String artikelNr) {
		Produkt p = hittaProdukt(artikelNr);
		produktLista.remove(p);
	}
}
