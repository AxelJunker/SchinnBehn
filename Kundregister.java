package schinnBehnFinal;
import java.util.*;

public class Kundregister {
	public Kundregister() {
		Kund k = new Kund();
		k.setOrgNr("1");
		k.setForetagsNamn("Västerbergs Kött AB");
		k.setKontaktPerson("Leif Larsson");
		k.setLeveransAdress("Storgatan 1");
		k.setFakturaAdress("Palmegatan 2");
		k.setTelefonNr("0707070707");
		k.setMail("info@vasterbergs.se");
		kundLista.add(k);
		
		k = new Kund();
		k.setOrgNr("2");
		k.setForetagsNamn("Ikea Restauranger AB ");
		k.setKontaktPerson("John Karlsson");
		k.setLeveransAdress("Landslagsgatan 1");
		k.setFakturaAdress("Kryssribbgatan 2");
		kundLista.add(k);
	}
	private ArrayList<Kund> kundLista = new ArrayList<Kund>();

	public ArrayList<Kund> getKundLista() {
		return kundLista;
	}
	public void setKundLista(ArrayList<Kund> kundLista) {
		this.kundLista = kundLista;
	}
	public Kund hittaKund(String orgNr) {
		for(Kund tmp : kundLista){
			if(tmp.getOrgNr().equals(orgNr)){
				return tmp;
			}
		}
		return null;
	}
	public void uppdateraKund(String orgNr, String foretagsNamn, String kontaktPerson,  String leveransAdress, String fakturaAdress, String telefonNr, String mail) {
		Kund k = hittaKund(orgNr);
		k.setForetagsNamn(foretagsNamn);
		k.setKontaktPerson(kontaktPerson);
		k.setLeveransAdress(leveransAdress);
		k.setFakturaAdress(fakturaAdress);
		k.setTelefonNr(telefonNr);
		k.setMail(mail);
	}
	public void nyKund(String orgNr, String foretagsNamn, String kontaktPerson, String leveransAdress, String fakturaAdress, String telefonNr, String mail) {
		Kund k = new Kund();
		k.setOrgNr(orgNr);
		k.setForetagsNamn(foretagsNamn);
		k.setKontaktPerson(kontaktPerson);
		k.setLeveransAdress(leveransAdress);
		k.setFakturaAdress(fakturaAdress);
		k.setTelefonNr(telefonNr);
		k.setMail(mail);
		kundLista.add(k);
	}
	public void taBortKund(String orgNr) {
		Kund k = hittaKund(orgNr);
		kundLista.remove(k);
	}
}
