package schinnBehnFinal;
import java.util.*;
public class Orderregister {

	private ArrayList<Order> orderLista = new ArrayList<Order>();
	private int i = 1;
	
	public ArrayList<Order> getOrderLista() {
		return orderLista;
	}
	public void setOrderLista(ArrayList<Order> orderLista) {
		this.orderLista = orderLista;
	}
	public void addOrder(Order o) {
		o.setOrderNr(String.valueOf(i));
		orderLista.add(o);
		i++;
	}
	public Order hittaOrder(String orderNr) {
		for(Order tmp : orderLista){
			if(tmp.getOrderNr().equals(orderNr)){
				return tmp;
			}
		}
		return null;
	}
	public void taBortOrder(String orderNr) {
		orderLista.remove(hittaOrder(orderNr));
	}
}
