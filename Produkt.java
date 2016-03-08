package schinnBehnFinal;
import java.util.*;
public class Produkt {

	private String artikelNr;
	private String namn;
    private double pris;
    private ArrayList <Orderrad> orderRadListaP = new ArrayList<Orderrad>();
    private Produktregister produktRegister;
	
    public String getArtikelNr() {
		return artikelNr;
	}
	public void setArtikelNr(String artikelNr) {
		this.artikelNr = artikelNr;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}
	public ArrayList <Orderrad> getOrderRadListaP() {
		return orderRadListaP;
	}
	public void setOrderRadListaP(ArrayList <Orderrad> orderRadListaP) {
		this.orderRadListaP = orderRadListaP;
	}
	public Produktregister getProduktRegister() {
		return produktRegister;
	}
	public void setProduktRegister(Produktregister produktRegister) {
		this.produktRegister = produktRegister;
	}
}
