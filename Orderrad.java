package schinnBehnFinal;


public class Orderrad {
	
	private int antal;
	private double pris;
	private Produkt produkt;
	private Order order;
	
	public int getAntal() {
		return antal;
	}
	public void setAntal(int antal) {
		this.antal = antal;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris += pris;
	}
	public Produkt getProdukt() {
		return produkt;
	}
	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
