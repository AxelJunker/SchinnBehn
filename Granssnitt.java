package schinnBehnFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Granssnitt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmSchinnBehn;
	private JTextField orgNrInputK;
	private JTextField foretagsNamnInputK;
	private JTextField leveransAdressInputK;
	private JTextField fakturaAdressInputK;
	private JTextField telefonNummerInputK;
	private JTextField mailInputK;
	private JTextField mailInputVK;
	private JTextField telefonnummerInputVK;
	private JTextField fakturaAdressInputVK;
	private JTextField leveransAdressInputVK;
	private JTextField foretagsNamnInputVK;
	private JTextField bestallareInputO;
	private JTextField leveransAdressInputO;
	private JTextField foretagsNamnInputO;
	private JTextField artikelNrInputO;
	private JTextField organisationsNrInputO;
	private JTextField orderNummerOutputO;
	private JTextField artikelNummerInputP;
	private JTextField namnInputP;
	private JTextField prisInputP;
	private JTextField prisOutputVP;
	private JTextField namnOutputVP;
	private JTextField artikelNummerOutputVP;
	private JTextField kontaktPersonInputK;
	private JTextField organisationsNrInputVK;
	private JTextField kontaktPersonInputVK;
	private JTextField organisationsNrInputVO;
	private JTextField orderNrInputVO;
	private JSpinner antalInputSpinnerO;
	private JTable visaOrderRaderTabell;
	DefaultTableModel tablemodelVOR;
	DefaultTableModel tablemodelVOK;
	private JTextField totPrisO;
	private JTable visaOrderTabellVOK;
	private JTabbedPane orderVal;
	
	Kundregister kundregister = new Kundregister();
	Orderregister orderregister = new Orderregister();
	Produktregister produktregister = new Produktregister();
	private Order order = new Order();
	private Orderrad orderrad = new Orderrad();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Granssnitt window = new Granssnitt();
					window.frmSchinnBehn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Granssnitt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frmSchinnBehn = new JFrame();
		frmSchinnBehn.setTitle("Schinn & Behn");
		frmSchinnBehn.setBounds(100, 100, 598, 457);
		frmSchinnBehn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSchinnBehn.getContentPane().setLayout(null);
		
		JTabbedPane meny = new JTabbedPane(JTabbedPane.TOP);
		meny.setBounds(6, 6, 586, 423);
		frmSchinnBehn.getContentPane().add(meny);
		
		JPanel kundMeny = new JPanel();
		meny.addTab("Kund", null, kundMeny, null);
		kundMeny.setLayout(null);
		
		JTabbedPane kundVal = new JTabbedPane(JTabbedPane.TOP);
		kundVal.setBounds(6, 6, 553, 365);
		kundMeny.add(kundVal);
		
		JPanel RegistreraKund = new JPanel();
		kundVal.addTab("Registrera kund", null, RegistreraKund, null);
		RegistreraKund.setLayout(null);
		
		JLabel lblOrganisationsnummerK = new JLabel("Kundnummer");
		lblOrganisationsnummerK.setBounds(6, 57, 140, 16);
		RegistreraKund.add(lblOrganisationsnummerK);
		
		JLabel lblForetagsNamnK = new JLabel("Företagsnamn");
		lblForetagsNamnK.setBounds(6, 85, 117, 16);
		RegistreraKund.add(lblForetagsNamnK);
		
		JLabel lblLeveransadressK = new JLabel("Leveransadress");
		lblLeveransadressK.setBounds(6, 141, 140, 16);
		RegistreraKund.add(lblLeveransadressK);
		
		JLabel lblFakturaadressK = new JLabel("Fakturaadress");
		lblFakturaadressK.setBounds(6, 169, 117, 16);
		RegistreraKund.add(lblFakturaadressK);
		
		JLabel lblTelefonnummerK = new JLabel("Telefonnummer");
		lblTelefonnummerK.setBounds(6, 197, 117, 16);
		RegistreraKund.add(lblTelefonnummerK);
		
		JLabel lblMailK = new JLabel("Mail");
		lblMailK.setBounds(6, 225, 61, 16);
		RegistreraKund.add(lblMailK);
		
		orgNrInputK = new JTextField();
		orgNrInputK.setBounds(198, 52, 202, 26);
		RegistreraKund.add(orgNrInputK);
		orgNrInputK.setColumns(10);
		
		foretagsNamnInputK = new JTextField();
		foretagsNamnInputK.setBounds(198, 80, 202, 26);
		RegistreraKund.add(foretagsNamnInputK);
		foretagsNamnInputK.setColumns(10);
		
		leveransAdressInputK = new JTextField();
		leveransAdressInputK.setBounds(198, 136, 202, 26);
		RegistreraKund.add(leveransAdressInputK);
		leveransAdressInputK.setColumns(10);
		
		fakturaAdressInputK = new JTextField();
		fakturaAdressInputK.setBounds(198, 164, 202, 26);
		RegistreraKund.add(fakturaAdressInputK);
		fakturaAdressInputK.setColumns(10);
		
		telefonNummerInputK = new JTextField();
		telefonNummerInputK.setBounds(198, 192, 202, 26);
		RegistreraKund.add(telefonNummerInputK);
		telefonNummerInputK.setColumns(10);
		
		mailInputK = new JTextField();
		mailInputK.setBounds(198, 220, 202, 26);
		RegistreraKund.add(mailInputK);
		mailInputK.setColumns(10);
		
		JButton btnRegistreraK = new JButton("Registrera");
		btnRegistreraK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registreraNyKund();
			}
		});
		btnRegistreraK.setBounds(409, 284, 117, 29);
		RegistreraKund.add(btnRegistreraK);
		
		JLabel lblKontaktpersonK = new JLabel("Kontaktperson");
		lblKontaktpersonK.setBounds(6, 113, 104, 16);
		RegistreraKund.add(lblKontaktpersonK);
		
		kontaktPersonInputK = new JTextField();
		kontaktPersonInputK.setBounds(198, 107, 202, 28);
		RegistreraKund.add(kontaktPersonInputK);
		kontaktPersonInputK.setColumns(10);
		
		JPanel visaKund = new JPanel();
		kundVal.addTab("Visa kund", null, visaKund, null);
		visaKund.setLayout(null);
		
		mailInputVK = new JTextField();
		mailInputVK.setColumns(10);
		mailInputVK.setBounds(197, 215, 202, 26);
		visaKund.add(mailInputVK);
		
		telefonnummerInputVK = new JTextField();
		telefonnummerInputVK.setColumns(10);
		telefonnummerInputVK.setBounds(197, 187, 202, 26);
		visaKund.add(telefonnummerInputVK);
		
		fakturaAdressInputVK = new JTextField();
		fakturaAdressInputVK.setColumns(10);
		fakturaAdressInputVK.setBounds(197, 159, 202, 26);
		visaKund.add(fakturaAdressInputVK);
		
		leveransAdressInputVK = new JTextField();
		leveransAdressInputVK.setColumns(10);
		leveransAdressInputVK.setBounds(197, 131, 202, 26);
		visaKund.add(leveransAdressInputVK);
		
		foretagsNamnInputVK = new JTextField();
		foretagsNamnInputVK.setColumns(10);
		foretagsNamnInputVK.setBounds(197, 75, 202, 26);
		visaKund.add(foretagsNamnInputVK);
		
		JLabel lblForetagsNamnVK = new JLabel("Företagsnamn");
		lblForetagsNamnVK.setBounds(6, 80, 117, 16);
		visaKund.add(lblForetagsNamnVK);
		
		JLabel lblLeveransadressVK = new JLabel("Leveransadress");
		lblLeveransadressVK.setBounds(6, 136, 140, 16);
		visaKund.add(lblLeveransadressVK);
		
		JLabel lblFakturaadressVK = new JLabel("Fakturaadress");
		lblFakturaadressVK.setBounds(6, 164, 117, 16);
		visaKund.add(lblFakturaadressVK);
		
		JLabel lblTelefonnummerVK = new JLabel("Telefonnummer");
		lblTelefonnummerVK.setBounds(6, 192, 117, 16);
		visaKund.add(lblTelefonnummerVK);
		
		JLabel lblMailVK = new JLabel("Mail");
		lblMailVK.setBounds(6, 220, 61, 16);
		visaKund.add(lblMailVK);
		
		JButton btnUppdateraK = new JButton("Uppdatera");
		btnUppdateraK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			uppdateraKund();
			}
		});
		btnUppdateraK.setBounds(388, 284, 138, 29);
		visaKund.add(btnUppdateraK);
		
		JButton btnSokKundVK = new JButton("Sök kund");
		btnSokKundVK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sokKund();
			}
		});
		btnSokKundVK.setBounds(409, 6, 117, 29);
		visaKund.add(btnSokKundVK);
		
		JButton btnTaBortK = new JButton("Ta bort");
		btnTaBortK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			taBortKund();
			}
		});
		btnTaBortK.setBounds(259, 284, 117, 29);
		visaKund.add(btnTaBortK);
		
		JLabel lblOrganisationsnummerVK = new JLabel("Kundnummer");
		lblOrganisationsnummerVK.setBounds(6, 11, 166, 16);
		visaKund.add(lblOrganisationsnummerVK);
		
		organisationsNrInputVK = new JTextField();
		organisationsNrInputVK.setBounds(197, 5, 202, 28);
		visaKund.add(organisationsNrInputVK);
		organisationsNrInputVK.setColumns(10);
		
		JLabel lblKontaktPersonVK = new JLabel("Kontaktperson");
		lblKontaktPersonVK.setBounds(6, 108, 117, 16);
		visaKund.add(lblKontaktPersonVK);
		
		kontaktPersonInputVK = new JTextField();
		kontaktPersonInputVK.setBounds(197, 102, 202, 28);
		visaKund.add(kontaktPersonInputVK);
		kontaktPersonInputVK.setColumns(10);
		
		JPanel orderMeny = new JPanel();
		meny.addTab("Order", null, orderMeny, null);
		orderMeny.setLayout(null);
		
		orderVal = new JTabbedPane(JTabbedPane.TOP);
		orderVal.setBounds(6, 6, 553, 365);
		orderMeny.add(orderVal);
		
		JPanel registreraOrder = new JPanel();
		orderVal.addTab("Registrera order", null, registreraOrder, null);
		registreraOrder.setLayout(null);
		
		JLabel lblOrdernummerO = new JLabel("Ordernummer");
		lblOrdernummerO.setBounds(6, 121, 96, 16);
		registreraOrder.add(lblOrdernummerO);
		
		bestallareInputO = new JTextField();
		bestallareInputO.setBounds(163, 90, 130, 26);
		registreraOrder.add(bestallareInputO);
		bestallareInputO.setColumns(10);
		
		JLabel lblOrganisationsnummerO = new JLabel("Kundnummer");
		lblOrganisationsnummerO.setBounds(6, 11, 148, 16);
		registreraOrder.add(lblOrganisationsnummerO);
		
		leveransAdressInputO = new JTextField();
		leveransAdressInputO.setBounds(163, 62, 130, 26);
		registreraOrder.add(leveransAdressInputO);
		leveransAdressInputO.setColumns(10);
		
		JLabel lblBestallareO = new JLabel("Beställare");
		lblBestallareO.setBounds(6, 95, 96, 16);
		registreraOrder.add(lblBestallareO);
		
		foretagsNamnInputO = new JTextField();
		foretagsNamnInputO.setBackground(Color.LIGHT_GRAY);
		foretagsNamnInputO.setEditable(false);
		foretagsNamnInputO.setBounds(163, 33, 130, 26);
		registreraOrder.add(foretagsNamnInputO);
		foretagsNamnInputO.setColumns(10);
		
		tablemodelVOR = new DefaultTableModel();
		String col[] = { "Namn", "Antal", "Pris/st", "Pris" };
		tablemodelVOR.setColumnIdentifiers(col);
		
		JScrollPane visaOrderraderO = new JScrollPane(visaOrderRaderTabell);
		visaOrderraderO.setBounds(163, 149, 363, 123);
		registreraOrder.add(visaOrderraderO);
		
		visaOrderRaderTabell = new JTable(tablemodelVOR) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		visaOrderraderO.setViewportView(visaOrderRaderTabell);
		visaOrderRaderTabell.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		visaOrderRaderTabell.setModel(tablemodelVOR);
		
		artikelNrInputO = new JTextField();
		artikelNrInputO.setBounds(79, 149, 75, 26);
		registreraOrder.add(artikelNrInputO);
		artikelNrInputO.setColumns(10);
		
		JLabel lblArtikelnrO = new JLabel("Artikelnr");
		lblArtikelnrO.setBounds(6, 154, 61, 16);
		registreraOrder.add(lblArtikelnrO);
		
		JLabel lblAntalO = new JLabel("Antal");
		lblAntalO.setBounds(6, 182, 61, 16);
		registreraOrder.add(lblAntalO);
		
		SpinnerModel sm = new SpinnerNumberModel(1, 1, 9, 1);
		antalInputSpinnerO = new JSpinner(sm);
		antalInputSpinnerO.setBounds(79, 177, 44, 26);
		registreraOrder.add(antalInputSpinnerO);
		
		JButton btnLaggTillO = new JButton("Lägg till");
		btnLaggTillO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nyOrderRad();
			}
		});
		btnLaggTillO.setBounds(6, 210, 117, 29);
		registreraOrder.add(btnLaggTillO);
		
		JButton btnTaBortO = new JButton("Ta bort");
		btnTaBortO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			taBortOrderRad();
			}
		});
		btnTaBortO.setBounds(6, 243, 117, 29);
		registreraOrder.add(btnTaBortO);
		
		JButton btnRegistreraOrderO = new JButton("Registrera");
		btnRegistreraOrderO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			registreraOrder();
			}
		});
		btnRegistreraOrderO.setBounds(409, 284, 117, 29);
		registreraOrder.add(btnRegistreraOrderO);
		
		JButton btnSokKundO = new JButton("Sök kund");
		btnSokKundO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sokKundOrder();
			}
		});
		btnSokKundO.setBounds(305, 6, 117, 29);
		registreraOrder.add(btnSokKundO);
		
		JLabel lblLeveransadressO = new JLabel("Leveransadress");
		lblLeveransadressO.setBounds(6, 67, 106, 16);
		registreraOrder.add(lblLeveransadressO);
		
		organisationsNrInputO = new JTextField();
		organisationsNrInputO.setBackground(Color.WHITE);
		organisationsNrInputO.setBounds(163, 6, 130, 26);
		registreraOrder.add(organisationsNrInputO);
		organisationsNrInputO.setColumns(10);
		
		JLabel lblForetagsnamnO = new JLabel("Företagsnamn");
		lblForetagsnamnO.setBounds(6, 39, 106, 16);
		registreraOrder.add(lblForetagsnamnO);
		
		orderNummerOutputO = new JTextField();
		orderNummerOutputO.setEditable(false);
		orderNummerOutputO.setBackground(Color.LIGHT_GRAY);
		orderNummerOutputO.setBounds(163, 116, 130, 26);
		registreraOrder.add(orderNummerOutputO);
		orderNummerOutputO.setColumns(10);
		
		JLabel lblTotalPrisO = new JLabel("Totalpris");
		lblTotalPrisO.setBounds(6, 289, 61, 16);
		registreraOrder.add(lblTotalPrisO);
		
		totPrisO = new JTextField();
		totPrisO.setEditable(false);
		totPrisO.setBackground(Color.LIGHT_GRAY);
		totPrisO.setBounds(79, 283, 75, 28);
		registreraOrder.add(totPrisO);
		totPrisO.setColumns(10);
		
		JButton btnTaBortOrder = new JButton("Ta bort order");
		btnTaBortOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			taBortOrder();
			}
		});
		btnTaBortOrder.setBounds(176, 284, 117, 29);
		registreraOrder.add(btnTaBortOrder);
		
		JButton btnUppdatera = new JButton("Uppdatera");
		btnUppdatera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			uppdateraOrder();
			}
		});
		btnUppdatera.setBounds(292, 284, 117, 29);
		registreraOrder.add(btnUppdatera);
		
		JPanel visaOrderHistorik = new JPanel();
		orderVal.addTab("Visa orderhistorik", null, visaOrderHistorik, null);
		visaOrderHistorik.setLayout(null);
		
		tablemodelVOK = new DefaultTableModel();
		String colVOK[] = { "Företagsnamn", "Beställare", "OrderNr", "Leveransadress", "Pris" };
		tablemodelVOK.setColumnIdentifiers(colVOK);
		
		JScrollPane scrollPaneVisaOrdrarVOK = new JScrollPane(visaOrderTabellVOK);
		scrollPaneVisaOrdrarVOK.setBounds(6, 73, 520, 199);
		visaOrderHistorik.add(scrollPaneVisaOrdrarVOK);
		
		visaOrderTabellVOK = new JTable(tablemodelVOK) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		visaOrderTabellVOK.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneVisaOrdrarVOK.setViewportView(visaOrderTabellVOK);
		visaOrderTabellVOK.setModel(tablemodelVOK);
		
		JButton btnSokKundVO = new JButton("Sök kund");
		btnSokKundVO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sokKundVisaOrder();
			}
		});
		btnSokKundVO.setBounds(309, 6, 117, 29);
		visaOrderHistorik.add(btnSokKundVO);
		
		JButton btnUppdateraOrderVO = new JButton("Uppdatera");
		btnUppdateraOrderVO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			uppdateraOrderVisaOrder();
			}
		});
		btnUppdateraOrderVO.setBounds(409, 284, 117, 29);
		visaOrderHistorik.add(btnUppdateraOrderVO);
		
		JLabel lblOrganisationsNummerVO = new JLabel("Kundnummer");
		lblOrganisationsNummerVO.setBounds(6, 11, 145, 16);
		visaOrderHistorik.add(lblOrganisationsNummerVO);
		
		organisationsNrInputVO = new JTextField();
		organisationsNrInputVO.setBounds(163, 5, 134, 28);
		visaOrderHistorik.add(organisationsNrInputVO);
		organisationsNrInputVO.setColumns(10);
		
		JLabel lblOrderNummerVO = new JLabel("Ordernummer");
		lblOrderNummerVO.setBounds(6, 45, 122, 16);
		visaOrderHistorik.add(lblOrderNummerVO);
		
		orderNrInputVO = new JTextField();
		orderNrInputVO.setBounds(163, 39, 134, 28);
		visaOrderHistorik.add(orderNrInputVO);
		orderNrInputVO.setColumns(10);
		
		JButton btnSokOrderVO = new JButton("Sök order");
		btnSokOrderVO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sokOrderVisaOrder();
			}
		});
		btnSokOrderVO.setBounds(309, 40, 117, 29);
		visaOrderHistorik.add(btnSokOrderVO);
		
		JButton btnTaBortVO = new JButton("Ta bort");
		btnTaBortVO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			taBortOrderVisaOrder();
			}
		});
		btnTaBortVO.setBounds(296, 284, 117, 29);
		visaOrderHistorik.add(btnTaBortVO);
		
		JPanel produktMeny = new JPanel();
		meny.addTab("Produkt", null, produktMeny, null);
		produktMeny.setLayout(null);
		
		JTabbedPane produktVal = new JTabbedPane(JTabbedPane.TOP);
		produktVal.setBounds(6, 6, 553, 365);
		produktMeny.add(produktVal);
		
		JPanel registreraProdukt = new JPanel();
		produktVal.addTab("Registrera produkt", null, registreraProdukt, null);
		registreraProdukt.setLayout(null);
		
		JLabel lblArtikelnummerP = new JLabel("Artikelnummer");
		lblArtikelnummerP.setBounds(6, 40, 105, 16);
		registreraProdukt.add(lblArtikelnummerP);
		
		JLabel lblNamnP = new JLabel("Namn");
		lblNamnP.setBounds(6, 68, 61, 16);
		registreraProdukt.add(lblNamnP);
		
		JLabel lblPrisP = new JLabel("Pris");
		lblPrisP.setBounds(6, 96, 61, 16);
		registreraProdukt.add(lblPrisP);
		
		artikelNummerInputP = new JTextField();
		artikelNummerInputP.setEditable(false);
		artikelNummerInputP.setBackground(Color.LIGHT_GRAY);
		artikelNummerInputP.setBounds(144, 35, 130, 26);
		registreraProdukt.add(artikelNummerInputP);
		artikelNummerInputP.setColumns(10);
		
		namnInputP = new JTextField();
		namnInputP.setBounds(144, 63, 130, 26);
		registreraProdukt.add(namnInputP);
		namnInputP.setColumns(10);
		
		prisInputP = new JTextField();
		prisInputP.setBounds(144, 91, 130, 26);
		registreraProdukt.add(prisInputP);
		prisInputP.setColumns(10);
		
		JButton btnRegistreraP = new JButton("Registrera");
		btnRegistreraP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			registreraProdukt();
			}
		});
		btnRegistreraP.setBounds(409, 284, 117, 29);
		registreraProdukt.add(btnRegistreraP);
		
		JPanel visaProdukt = new JPanel();
		produktVal.addTab("Visa produkt", null, visaProdukt, null);
		visaProdukt.setLayout(null);
		
		prisOutputVP = new JTextField();
		prisOutputVP.setColumns(10);
		prisOutputVP.setBounds(144, 100, 130, 26);
		visaProdukt.add(prisOutputVP);
		
		namnOutputVP = new JTextField();
		namnOutputVP.setColumns(10);
		namnOutputVP.setBounds(144, 72, 130, 26);
		visaProdukt.add(namnOutputVP);
		
		artikelNummerOutputVP = new JTextField();
		artikelNummerOutputVP.setBackground(SystemColor.text);
		artikelNummerOutputVP.setColumns(10);
		artikelNummerOutputVP.setBounds(144, 44, 130, 26);
		visaProdukt.add(artikelNummerOutputVP);
		
		JLabel lblPrisVP = new JLabel("Pris");
		lblPrisVP.setBounds(6, 105, 61, 16);
		visaProdukt.add(lblPrisVP);
		
		JLabel lblNamnVP = new JLabel("Namn");
		lblNamnVP.setBounds(6, 77, 61, 16);
		visaProdukt.add(lblNamnVP);
		
		JLabel lblArtikelnummerVP = new JLabel("Artikelnummer");
		lblArtikelnummerVP.setBounds(6, 49, 105, 16);
		visaProdukt.add(lblArtikelnummerVP);
		
		JButton btnSokProduktVP = new JButton("Sök produkt");
		btnSokProduktVP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sokProdukt();
			}
		});
		btnSokProduktVP.setBounds(409, 6, 117, 29);
		visaProdukt.add(btnSokProduktVP);
		
		JButton btnUppdateraVP = new JButton("Uppdatera");
		btnUppdateraVP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			uppdateraProdukt();
			}
		});
		btnUppdateraVP.setBounds(409, 284, 117, 29);
		visaProdukt.add(btnUppdateraVP);
		
		JButton btnTaBortVP = new JButton("Ta bort");
		btnTaBortVP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			taBortProdukt();
			}
		});
		btnTaBortVP.setBounds(280, 284, 117, 29);
		visaProdukt.add(btnTaBortVP);
		
		JLabel lblNewLabel = new JLabel("Schinn & Behn");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(16, 4, 185, 16);
		frmSchinnBehn.getContentPane().add(lblNewLabel);
	}
	public void registreraNyKund() {
		if (kundregister.hittaKund(orgNrInputK.getText()) == null) {
			if (!orgNrInputK.getText().equals("")) {
				kundregister.nyKund(orgNrInputK.getText(), foretagsNamnInputK.getText(), kontaktPersonInputK.getText(), leveransAdressInputK.getText(),
				fakturaAdressInputK.getText(), telefonNummerInputK.getText(), mailInputK.getText());
			
				JOptionPane.showMessageDialog(this, "Kunden är nu registrerad!");
			}
			else {
				JOptionPane.showMessageDialog(this, "Inget organisationsnummer inmatat");
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "Kund finns redan i registeret!");
		}
	}
	public void sokKund() {
		boolean b = false;

		for (Kund tmp : kundregister.getKundLista()) {
			if (tmp.getOrgNr().equals(organisationsNrInputVK.getText())) {
				b = true;
				organisationsNrInputVK.setText(tmp.getOrgNr());
				foretagsNamnInputVK.setText(tmp.getForetagsNamn());
				kontaktPersonInputVK.setText(tmp.getKontaktPerson());
				leveransAdressInputVK.setText(tmp.getLeveransAdress());
				fakturaAdressInputVK.setText(tmp.getFakturaAdress());
				telefonnummerInputVK.setText(tmp.getTelefonNr());
				mailInputVK.setText(tmp.getMail());
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null, "Det finns ingen kund med det organisationsnummret");
			organisationsNrInputVK.setText(null);
			foretagsNamnInputVK.setText(null);
			kontaktPersonInputVK.setText(null);
			leveransAdressInputVK.setText(null);
			fakturaAdressInputVK.setText(null);
			telefonnummerInputVK.setText(null);
			mailInputVK.setText(null);
		}
	}
	public void uppdateraKund() {
		Kund k = kundregister.hittaKund(organisationsNrInputVK.getText());
		if(k != null) {
			if(!organisationsNrInputVK.getText().equals("")) {
				kundregister.uppdateraKund(organisationsNrInputVK.getText(), foretagsNamnInputVK.getText(), kontaktPersonInputVK.getText(), leveransAdressInputVK.getText(),
								fakturaAdressInputVK.getText(), telefonnummerInputVK.getText(), mailInputVK.getText());
				foretagsNamnInputVK.setText(foretagsNamnInputVK.getText());
				kontaktPersonInputVK.setText(kontaktPersonInputVK.getText());
				leveransAdressInputVK.setText(leveransAdressInputVK.getText());
				fakturaAdressInputVK.setText(fakturaAdressInputVK.getText());
				telefonnummerInputVK.setText(telefonnummerInputVK.getText());
				mailInputVK.setText(mailInputVK.getText());

				JOptionPane.showMessageDialog(null, "Kund uppdaterad");
			} else {
				JOptionPane.showMessageDialog(null, "Inget organisationsnummer inmatat");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen kund med det organisationsnumret");
		}
	}
	public void taBortKund() {
		Kund k = kundregister.hittaKund(organisationsNrInputVK.getText());
		if(k != null) {
			if(!organisationsNrInputVK.getText().equals("")) {
				kundregister.taBortKund(organisationsNrInputVK.getText());
				JOptionPane.showMessageDialog(null, "Kund borttagen");
				organisationsNrInputVK.setText(null);
				foretagsNamnInputVK.setText(null);
				kontaktPersonInputVK.setText(null);
				leveransAdressInputVK.setText(null);
				fakturaAdressInputVK.setText(null);
				telefonnummerInputVK.setText(null);
				mailInputVK.setText(null);
			} else {
				JOptionPane.showMessageDialog(null, "Inget organisationsnummer inmatat");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen kund med det organisationsnumret");
		}
	}
	public void sokKundOrder() {
		orderNummerOutputO.setText(null);
		artikelNrInputO.setText(null);
		totPrisO.setText(null);
		for (int i = visaOrderRaderTabell.getRowCount() - 1; i >= 0; i--) {
		    tablemodelVOR.removeRow(i);
		}
		boolean b = false;
		for (Kund tmp : kundregister.getKundLista()) {
			if (tmp.getOrgNr().equals(organisationsNrInputO.getText())) {
				b = true;
				organisationsNrInputO.setText(tmp.getOrgNr());
				leveransAdressInputO.setText(tmp.getLeveransAdress());
				foretagsNamnInputO.setText(tmp.getForetagsNamn());
				bestallareInputO.setText(tmp.getKontaktPerson());
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null, "Det finns ingen kund med det organisationsnummret");
			organisationsNrInputO.setText(null);
			leveransAdressInputO.setText(null);
			foretagsNamnInputO.setText(null);
			bestallareInputO.setText(null);
		}
	}
	public void nyOrderRad() {
		Produkt p = produktregister.hittaProdukt(artikelNrInputO.getText());
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		if (p != null) {
			if (o == null) {
				boolean finns = false;
				for (Orderrad tmp : order.getOrderRadListaO()) {
					if (tmp.getProdukt().getArtikelNr().equals(p.getArtikelNr())) {
						tmp.setAntal((tmp.getAntal() + (Integer) antalInputSpinnerO.getValue()));
						tmp.setPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
						order.setTotPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
						finns = true;
					}
				}
				if (finns == false) {
					orderrad.setAntal((Integer) antalInputSpinnerO.getValue());
					orderrad.setPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
					orderrad.setProdukt(p);
					orderrad.setOrder(order);
					order.setTotPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
					order.getOrderRadListaO().add(orderrad);
					orderrad = new Orderrad();
				}
				uppdateraOrderRadLista();
			}
			if (o != null) {
				boolean finns2 = false;
				for (Orderrad tmp : o.getOrderRadListaO()) {
					if (tmp.getOrder().equals(o)) {
						if (tmp.getProdukt().getArtikelNr().equals(p.getArtikelNr())) {
							tmp.setAntal((tmp.getAntal() + (Integer) antalInputSpinnerO.getValue()));
							tmp.setPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
							o.setTotPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
							finns2 = true;
						}
					}
				}
				if (finns2 == false) {
					orderrad.setAntal((Integer) antalInputSpinnerO.getValue());
					orderrad.setPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
					orderrad.setProdukt(p);
					orderrad.setOrder(o);
					o.setTotPris(p.getPris() * (Integer) antalInputSpinnerO.getValue());
					o.getOrderRadListaO().add(orderrad);
					orderrad = new Orderrad();
				}
				uppdateraOrderRadLista();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen produkt med det artikelnumret");
		}
	}
	public void uppdateraOrderRadLista() {
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		
		if(o == null) {
			tablemodelVOR = new DefaultTableModel();
			String colVOR[] = { "Namn", "Antal", "Pris/st", "Pris" };
			tablemodelVOR.setColumnIdentifiers(colVOR);

			for (Orderrad tmp : order.getOrderRadListaO()) {
				String row[] = { tmp.getProdukt().getNamn(), String.valueOf(tmp.getAntal()), String.valueOf(tmp.getProdukt().getPris()), String.valueOf(tmp.getPris()) };
				tablemodelVOR.addRow(row);
			}
			visaOrderRaderTabell.setModel(tablemodelVOR);
			totPrisO.setText(String.valueOf(order.getTotPris()));
		}
		if(o != null) {
			tablemodelVOR = new DefaultTableModel();
			String colVOR[] = { "Namn", "Antal", "Pris/st", "Pris" };
			tablemodelVOR.setColumnIdentifiers(colVOR);

			for (Orderrad tmp : o.getOrderRadListaO()) {
				String row[] = { tmp.getProdukt().getNamn(), String.valueOf(tmp.getAntal()), String.valueOf(tmp.getProdukt().getPris()), String.valueOf(tmp.getPris()) };
				tablemodelVOR.addRow(row);
			}
			visaOrderRaderTabell.setModel(tablemodelVOR);
			totPrisO.setText(String.valueOf(o.getTotPris()));
		}
	}
	public void taBortOrderRad() {
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		if(o == null) {
			if (visaOrderRaderTabell.getSelectedRow() >= 0) {
				Object produkt = (Object) visaOrderRaderTabell.getValueAt(visaOrderRaderTabell.getSelectedRow(), 0);
				for (Iterator<Orderrad> iterator = order.getOrderRadListaO().iterator(); iterator.hasNext();) {
					Orderrad tmp = iterator.next();
					if(produkt.equals(tmp.getProdukt().getNamn())) {
						tablemodelVOR.removeRow(visaOrderRaderTabell.getSelectedRow());
						order.setTotPris(-tmp.getPris());
						iterator.remove();
					}
				}
			} 
			else {
				JOptionPane.showMessageDialog(null, "Ingen orderrad vald");
			}
			uppdateraOrderRadLista();
		}
		if(o != null) {
			if (visaOrderRaderTabell.getSelectedRow() >= 0) {
				Object produkt = (Object) visaOrderRaderTabell.getValueAt(visaOrderRaderTabell.getSelectedRow(), 0);
				for (Iterator<Orderrad> iterator = o.getOrderRadListaO().iterator(); iterator.hasNext();) {
					Orderrad tmp = iterator.next();
					if(produkt.equals(tmp.getProdukt().getNamn())) {
						tablemodelVOR.removeRow(visaOrderRaderTabell.getSelectedRow());
						o.setTotPris(-tmp.getPris());
						iterator.remove();
					}
				}
			} 
			else {
				JOptionPane.showMessageDialog(null, "Ingen orderrad vald");
			}
			uppdateraOrderRadLista();
		}
	}
	public void registreraOrder() {
		Kund k = kundregister.hittaKund(organisationsNrInputO.getText());
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		if(o == null) {
			if(k != null) {
				if (!totPrisO.getText().equals("") && !totPrisO.getText().equals("0.0")) {
					if(!bestallareInputO.getText().equals("")) {
						order.setKund(k);
						order.setBestallare(bestallareInputO.getText());
						orderregister.addOrder(order);
						k.getOrderLista().add(order);
						orderNummerOutputO.setText(order.getOrderNr());
						String orderNr = order.getOrderNr();
						order = new Order();
					
						JOptionPane.showMessageDialog(null, "Order registrerad! Ordernummer: " + orderNr);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Ingen beställare är inskriven");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Inga valda produkter. Skriv in artikelnummer och klicka på Lägg till.");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Ingen kund vald. Skriv in eller sök organisationsnummer.");
			}
		}
		if(o != null) {
			JOptionPane.showMessageDialog(null, "Ordern finns redan. Tryck på uppdatera för att uppdatera ordern.");
		}
	}
	public void sokKundVisaOrder() {
		orderNrInputVO.setText(null);
		if(tablemodelVOK.getRowCount() > 0) {
			for (int i = visaOrderTabellVOK.getRowCount() - 1; i >= 0; i--) {
				tablemodelVOK.removeRow(i);
			}
		}
		Kund k = kundregister.hittaKund(organisationsNrInputVO.getText());
		boolean finns = false;
		if(k != null) {
			for (Order tmp : orderregister.getOrderLista()) {
				if(k.equals(tmp.getKund())) {
					String row[] = { tmp.getKund().getForetagsNamn(), tmp.getBestallare(), tmp.getOrderNr(), tmp.getKund().getLeveransAdress(), String.valueOf(tmp.getTotPris()) };
					tablemodelVOK.addRow(row);
					finns = true;
				}
			}
			if(finns == false) {
				JOptionPane.showMessageDialog(null, "Kunden har inga ordrar");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Det finns ingen kund med det organisationsnumret");
		}
	}
	public void sokOrderVisaOrder() {
		organisationsNrInputVO.setText(null);
		Order o = orderregister.hittaOrder(orderNrInputVO.getText());
		
		if(tablemodelVOK.getRowCount() > 0) {
			for (int i = visaOrderTabellVOK.getRowCount() - 1; i >= 0; i--) {
				tablemodelVOK.removeRow(i);
			}
		}
		
		if(o != null) {
			orderVal.setSelectedIndex(0);
			organisationsNrInputO.setText(o.getKund().getOrgNr());
			leveransAdressInputO.setText(o.getKund().getLeveransAdress());
			foretagsNamnInputO.setText(o.getKund().getForetagsNamn());
			bestallareInputO.setText(o.getBestallare());
			orderNummerOutputO.setText(o.getOrderNr());
			artikelNrInputO.setText(null);
			totPrisO.setText(String.valueOf(o.getTotPris()));
		
			for(int i = tablemodelVOR.getRowCount() - 1; i >= 0; i--) {
				tablemodelVOR.removeRow(i);
			}
			for(Orderrad tmp : o.getOrderRadListaO()) {
				if(tmp.getOrder().equals(o)) {
					String row[] = { tmp.getProdukt().getNamn(), String.valueOf(tmp.getAntal()), String.valueOf(tmp.getProdukt().getPris()), String.valueOf(tmp.getPris()) };
					tablemodelVOR.addRow(row);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen order med det ordernumret");
		}
	}
	public void uppdateraOrderVisaOrder() {
		orderNrInputVO.setText(null);
		String orderNr = (String) visaOrderTabellVOK.getValueAt(visaOrderTabellVOK.getSelectedRow(), 2);
		Order o = orderregister.hittaOrder(orderNr);
		orderVal.setSelectedIndex(0);
		
		organisationsNrInputO.setText(o.getKund().getOrgNr());
		leveransAdressInputO.setText(o.getKund().getLeveransAdress());
		foretagsNamnInputO.setText(o.getKund().getForetagsNamn());
		bestallareInputO.setText(o.getBestallare());
		orderNummerOutputO.setText(o.getOrderNr());
		artikelNrInputO.setText(null);
		totPrisO.setText(String.valueOf(o.getTotPris()));
		
		for(int i = tablemodelVOR.getRowCount() - 1; i >= 0; i--) {
			tablemodelVOR.removeRow(i);
		}
		for(Orderrad tmp : o.getOrderRadListaO()) {
			if(tmp.getOrder().equals(o)) {
				String row[] = { tmp.getProdukt().getNamn(), String.valueOf(tmp.getAntal()), String.valueOf(tmp.getProdukt().getPris()), String.valueOf(tmp.getPris()) };
				tablemodelVOR.addRow(row);
			}
		}
	}
	public void taBortOrderVisaOrder() {
		String orderNr = (String) visaOrderTabellVOK.getValueAt(visaOrderTabellVOK.getSelectedRow(), 2);
		Order o = orderregister.hittaOrder(orderNr);
		
		if (visaOrderTabellVOK.getSelectedRow() >= 0) {
			tablemodelVOK.removeRow(visaOrderTabellVOK.getSelectedRow());
			orderregister.taBortOrder(orderNr);
			for (Iterator<Orderrad> iterator = o.getOrderRadListaO().iterator(); iterator.hasNext();) {
				Orderrad tmp = iterator.next();
				if(o.equals(tmp.getOrder())) {
					iterator.remove();
				}
			}
			JOptionPane.showMessageDialog(null, "Order borttagen");
		} else {
			JOptionPane.showMessageDialog(null, "Ingen order vald");
		}
	}
	public void taBortOrder() {
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		
		if(o == null) {
			for (Iterator<Orderrad> iterator = order.getOrderRadListaO().iterator(); iterator.hasNext();) {
				Orderrad tmp = iterator.next();
				if(order.equals(tmp.getOrder())) {
					iterator.remove();
				}
			}
			for (int i = visaOrderRaderTabell.getRowCount() - 1; i >= 0; i--) {
			    tablemodelVOR.removeRow(i);
			}
			orderregister.getOrderLista().remove(order);
			organisationsNrInputO.setText(null);
			leveransAdressInputO.setText(null);
			foretagsNamnInputO.setText(null);
			bestallareInputO.setText(null);
			orderNummerOutputO.setText(null);
			artikelNrInputO.setText(null);
			totPrisO.setText(null);
			
			JOptionPane.showMessageDialog(null, "Order borttagen");
		}
		if(o != null) {
			for (Iterator<Orderrad> iterator = o.getOrderRadListaO().iterator(); iterator.hasNext();) {
				Orderrad tmp = iterator.next();
				if(o.equals(tmp.getOrder())) {
					iterator.remove();
				}
			}
			for (int i = visaOrderRaderTabell.getRowCount() - 1; i >= 0; i--) {
			    tablemodelVOR.removeRow(i);
			}
			if(organisationsNrInputO.getText().equals(organisationsNrInputVO.getText())) {
				if(tablemodelVOK.getRowCount() > 0) {
					for (int i = visaOrderTabellVOK.getRowCount() - 1; i >= 0; i--) {
						tablemodelVOK.removeRow(i);
					}
				}
			}
			orderregister.taBortOrder(orderNummerOutputO.getText());
			organisationsNrInputO.setText(null);
			leveransAdressInputO.setText(null);
			foretagsNamnInputO.setText(null);
			bestallareInputO.setText(null);
			orderNummerOutputO.setText(null);
			artikelNrInputO.setText(null);
			totPrisO.setText(null);
			JOptionPane.showMessageDialog(null, "Order borttagen");
		}
	}
	public void uppdateraOrder() {
		Kund k = kundregister.hittaKund(organisationsNrInputO.getText());
		Order o = orderregister.hittaOrder(orderNummerOutputO.getText());
		if(o != null) {
			if(k != null) {
				if (!totPrisO.getText().equals("") && !totPrisO.getText().equals("0.0")) {
					if(!bestallareInputO.getText().equals("")) {
						o.setKund(k);
						o.setBestallare(bestallareInputO.getText());
						orderNummerOutputO.setText(String.valueOf(o.getOrderNr()));
				
						JOptionPane.showMessageDialog(null, "Order uppdaterad!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Ingen beställare är inskriven");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Inga valda produkter. Skriv in artikelnummer och klicka på Lägg till.");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Ingen kund vald. Sök med organisationsnummer.");
			}
		}
		if(o == null) {
			JOptionPane.showMessageDialog(null, "Ordern finns inte. Tryck på registrera för att skapa ny order.");
		}
	}
	public void registreraProdukt() {
		produktregister.nyProdukt(namnInputP.getText(), Double.valueOf(prisInputP.getText()));
		JOptionPane.showMessageDialog(this, "Produkten är nu registrerad! Artikelnummer: " + String.valueOf(produktregister.getI() - 1));
			artikelNummerInputP.setText(String.valueOf(produktregister.getI() - 1));
	}
	public void uppdateraProdukt() {
		Produkt p = produktregister.hittaProdukt(artikelNummerOutputVP.getText());
		if(p != null) {
			if(!artikelNummerOutputVP.getText().equals("")) {
				produktregister.uppdateraProdukt(artikelNummerOutputVP.getText(), namnOutputVP.getText(), Double.valueOf(prisOutputVP.getText()));
				artikelNummerOutputVP.setText(p.getArtikelNr());
				namnOutputVP.setText(p.getNamn());
				prisOutputVP.setText(String.valueOf(p.getPris()));

				JOptionPane.showMessageDialog(null, "Produkt uppdaterad");
			} else {
				JOptionPane.showMessageDialog(this, "Inget artikelnummer inmatat");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen produkt med det artikelnumret");
		}
	}
	public void sokProdukt() {
		boolean b = false;

		for (Produkt tmp : produktregister.getProduktLista()) {
			if (tmp.getArtikelNr().equals(artikelNummerOutputVP.getText())) {
				b = true;
				artikelNummerOutputVP.setText(tmp.getArtikelNr());
				namnOutputVP.setText(tmp.getNamn());
				prisOutputVP.setText(String.valueOf(tmp.getPris()));
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null, "Det finns ingen produkt med det artikelnumret");
			artikelNummerOutputVP.setText(null);
			namnOutputVP.setText(null);
			prisOutputVP.setText(null);
		}
	}
	public void taBortProdukt() {
		Produkt p = produktregister.hittaProdukt(artikelNummerOutputVP.getText());
		if(p != null) {
			if(!artikelNummerOutputVP.getText().equals("")) {
				produktregister.taBortProdukt(artikelNummerOutputVP.getText());
				artikelNummerOutputVP.setText(null);
				namnOutputVP.setText(null);
				prisOutputVP.setText(null);

				JOptionPane.showMessageDialog(null, "Produkt borttagen");
			} else {
				JOptionPane.showMessageDialog(this, "Inget artikelnummer inmatat");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Det finns ingen produkt med det artikelnumret");
		}
	}
}
