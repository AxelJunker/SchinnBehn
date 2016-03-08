package schinnBehnFinal;
import java.util.*;

public class Order {

	private String orderNr;
	private String bestallare;
	private double totPris;
	private ArrayList<Orderrad> orderRadListaO = new ArrayList<Orderrad>();
	private Kund kund;
	private Orderregister orderRegister;
	
	public String getOrderNr() {
		return orderNr;
	}
	public void setOrderNr(String orderNr) {
		this.orderNr = orderNr;
	}
	public String getBestallare() {
		return bestallare;
	}
	public void setBestallare(String bestallare) {
		this.bestallare = bestallare;
	}
	public double getTotPris() {
		return totPris;
	}
	public void setTotPris(double totPris) {
		this.totPris += totPris;
	}
	public ArrayList<Orderrad> getOrderRadListaO() {
		return orderRadListaO;
	}
	public void setOrderRadListaO(ArrayList<Orderrad> orderRadListaO) {
		this.orderRadListaO = orderRadListaO;
	}
	public Kund getKund() {
		return kund;
	}
	public void setKund(Kund kund) {
		this.kund = kund;
	}
	public Orderregister getOrderRegister() {
		return orderRegister;
	}
	public void setOrderRegister(Orderregister orderRegister) {
		this.orderRegister = orderRegister;
	}
}
