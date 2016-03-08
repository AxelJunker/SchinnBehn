package schinnBehnFinal;
import java.util.*;

public class Kund{
	
	private String orgNr;
	private String foretagsNamn;
	private String kontaktPerson;
	private String leveransAdress;
	private String fakturaAdress;
	private String mail;
	private String telefonNr;
	private ArrayList<Order> orderLista = new ArrayList<Order>();
	private Kundregister kundRegister;
	
	public String getOrgNr() {
		return orgNr;
	}
	public void setOrgNr(String orgNr) {
		this.orgNr = orgNr;
	}
	public String getForetagsNamn() {
		return foretagsNamn;
	}
	public void setForetagsNamn(String foretagsNamn) {
		this.foretagsNamn = foretagsNamn;
	}
	public String getKontaktPerson() {
		return kontaktPerson;
	}
	public void setKontaktPerson(String kontaktPerson) {
		this.kontaktPerson = kontaktPerson;
	}
	public String getLeveransAdress() {
		return leveransAdress;
	}
	public void setLeveransAdress(String leveransAdress) {
		this.leveransAdress = leveransAdress;
	}
	public String getFakturaAdress() {
		return fakturaAdress;
	}
	public void setFakturaAdress(String fakturaAdress) {
		this.fakturaAdress = fakturaAdress;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefonNr() {
		return telefonNr;
	}
	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}
	public ArrayList<Order> getOrderLista() {
		return orderLista;
	}
	public void setOrderLista(ArrayList<Order> orderLista) {
		this.orderLista = orderLista;
	}
	public Kundregister getKundRegister() {
		return kundRegister;
	}
	public void setKundRegister(Kundregister kundRegister) {
		this.kundRegister = kundRegister;
	}
}
