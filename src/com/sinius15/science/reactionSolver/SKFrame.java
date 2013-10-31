package com.sinius15.science.reactionSolver;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import com.sinius15.science.general.Units;

public class SKFrame extends JFrame {

	private static final long serialVersionUID = -6706879829213883719L;
	private JPanel contentPane;
	private JTextField stof1;
	private JTextField stof2;
	private JTextField stof3;
	private JTextField stof4;
	private JTextField stof5;
	private JTextField stof6;
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup1 = new ButtonGroup();

	public SKFrame() {
		setTitle("Rekenen aan reacties op de automatische piloot.");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 616, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		stof1 = new JTextField();
		stof1.setBounds(10, 60, 86, 20);
		contentPane.add(stof1);
		stof1.setColumns(10);
		
		stof2 = new JTextField();
		stof2.setBounds(106, 60, 86, 20);
		contentPane.add(stof2);
		stof2.setColumns(10);
		
		stof3 = new JTextField();
		stof3.setBounds(202, 60, 86, 20);
		contentPane.add(stof3);
		stof3.setColumns(10);
		
		stof4 = new JTextField();
		stof4.setBounds(323, 60, 86, 20);
		contentPane.add(stof4);
		stof4.setColumns(10);
		
		stof5 = new JTextField();
		stof5.setBounds(419, 60, 86, 20);
		contentPane.add(stof5);
		stof5.setColumns(10);
		
		stof6 = new JTextField();
		stof6.setBounds(515, 60, 86, 20);
		contentPane.add(stof6);
		stof6.setColumns(10);
		
		JLabel label = new JLabel("+");
		label.setBounds(193, 63, 8, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("+");
		label_1.setBounds(96, 63, 18, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("+");
		label_2.setBounds(410, 63, 18, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("+");
		label_3.setBounds(506, 63, 18, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("=>");
		label_4.setBounds(298, 63, 46, 14);
		contentPane.add(label_4);
		
		JLabel lblHetFormaat = new JLabel("Vul hieronder de reactievergelijking in. Voorbeeld: 2KClO3  =>  2KCl + 3O2\r\n");
		lblHetFormaat.setBounds(10, 11, 418, 20);
		contentPane.add(lblHetFormaat);
		
		JLabel lblHoudRekeningMet = new JLabel("Houdt rekening met hoofd en kleine letters! Lege velden worden genegeerd.");
		lblHoudRekeningMet.setBounds(10, 32, 418, 20);
		contentPane.add(lblHoudRekeningMet);
		
		final JRadioButton wil1 = new JRadioButton("");
		wil1.setSelected(true);
		buttonGroup1.add(wil1);
		wil1.setBounds(40, 189, 28, 23);
		contentPane.add(wil1);
		
		final JRadioButton wil2 = new JRadioButton("");
		buttonGroup1.add(wil2);
		wil2.setBounds(131, 189, 28, 23);
		contentPane.add(wil2);
		
		final JRadioButton wil3 = new JRadioButton("");
		buttonGroup1.add(wil3);
		wil3.setBounds(233, 189, 28, 23);
		contentPane.add(wil3);
		
		final JRadioButton wil4 = new JRadioButton("");
		buttonGroup1.add(wil4);
		wil4.setBounds(351, 189, 28, 23);
		contentPane.add(wil4);
		
		final JRadioButton wil5 = new JRadioButton("");
		buttonGroup1.add(wil5);
		wil5.setBounds(445, 189, 28, 23);
		contentPane.add(wil5);
		
		final JRadioButton wil6 = new JRadioButton("");
		buttonGroup1.add(wil6);
		wil6.setBounds(547, 189, 28, 23);
		contentPane.add(wil6);
		
		final JRadioButton heeft1 = new JRadioButton("");
		heeft1.setSelected(true);
		buttonGroup2.add(heeft1);
		heeft1.setBounds(40, 113, 28, 23);
		contentPane.add(heeft1);
		
		final JRadioButton heeft2 = new JRadioButton("");
		buttonGroup2.add(heeft2);
		heeft2.setBounds(131, 113, 28, 23);
		contentPane.add(heeft2);
		
		final JRadioButton heeft3 = new JRadioButton("");
		buttonGroup2.add(heeft3);
		heeft3.setBounds(233, 113, 28, 23);
		contentPane.add(heeft3);
		
		final JRadioButton heeft4 = new JRadioButton("");
		buttonGroup2.add(heeft4);
		heeft4.setBounds(351, 113, 28, 23);
		contentPane.add(heeft4);
		
		final JRadioButton heeft5 = new JRadioButton("");
		buttonGroup2.add(heeft5);
		heeft5.setBounds(445, 113, 28, 23);
		contentPane.add(heeft5);
		
		final JRadioButton heeft6 = new JRadioButton("");
		buttonGroup2.add(heeft6);
		heeft6.setBounds(547, 113, 28, 23);
		contentPane.add(heeft6);
		
		JLabel lblVulHieronderIn = new JLabel("Zet een bolletje bij de stof waarvan je de massa weet.");
		lblVulHieronderIn.setBounds(10, 95, 591, 14);
		contentPane.add(lblVulHieronderIn);
		
		JLabel lblVulHierIn = new JLabel("Vul hier in wat je weet van de stof waarbij je bij de vorige stap een bolletje hebt gezet:");
		lblVulHierIn.setBounds(10, 143, 428, 14);
		contentPane.add(lblVulHierIn);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner.setBounds(445, 140, 60, 20);
		contentPane.add(spinner);
		
		final JComboBox<String> eenheidBox1 = new JComboBox<String>();
		eenheidBox1.setModel(new DefaultComboBoxModel<String>(new String[] {"mico gram", "mili gram", "gram", "kilo gram", "ton"}));
		eenheidBox1.setSelectedIndex(2);
		eenheidBox1.setBounds(515, 140, 86, 20);
		contentPane.add(eenheidBox1);
		
		JLabel lblVulHieronderIn_1 = new JLabel("Vul hieronder in van welke stof je de massa wilt weten.");
		lblVulHieronderIn_1.setBounds(10, 168, 591, 14);
		contentPane.add(lblVulHieronderIn_1);
		
		final JComboBox<String> eenheidBox2 = new JComboBox<String>();
		eenheidBox2.setModel(new DefaultComboBoxModel<String>(new String[] {"mico gram", "mili gram", "gram", "kilo gram", "ton"}));
		eenheidBox2.setSelectedIndex(2);
		eenheidBox2.setBounds(298, 219, 86, 20);
		contentPane.add(eenheidBox2);
		
		JLabel lblKiesHierDe = new JLabel("Kies hier de eenheid waarin je de uitkomst in wilt hebben.");
		lblKiesHierDe.setBounds(10, 222, 283, 14);
		contentPane.add(lblKiesHierDe);
		final SKFrame frame = this;
		
		JButton btnBereken = new JButton("Bereken!");
		btnBereken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame, "Dit programma'tje is een hobby projectje. Er kunnen fouten in zitten!" + System.lineSeparator()
						+ "Ook let dit programmatje niet op significantie, dus dat moet u zelf doen." + System.lineSeparator()
						+ "Verder is het niet de bedoeling dat hiermee huiswerk opgaven worden gemaakt, dit is alleen een controle middel."
						+ "Gebruik op eigen risico.", "Pas Op!", JOptionPane.WARNING_MESSAGE);
				
				System.out.println("==========Begin nieuwe berekening==================");
				
				String[] in = new String[6];
				in[0] = stof1.getText();
				in[1] = stof2.getText();
				in[2] = stof3.getText();
				in[3] = stof4.getText();
				in[4] = stof5.getText();
				in[5] = stof6.getText();
				
				Stof input = null;
				try {
					if(heeft1.isSelected()) input = new Stof(in[0]);
					if(heeft2.isSelected()) input = new Stof(in[1]);
					if(heeft3.isSelected()) input = new Stof(in[2]);
					if(heeft4.isSelected()) input = new Stof(in[3]);
					if(heeft5.isSelected()) input = new Stof(in[4]);
					if(heeft6.isSelected()) input = new Stof(in[5]);
				} catch (Exception e1) {
					e1.printStackTrace();
					System.err.println("Er is iets fout gegaan. Dit is jou fout. Je bakt er helemaal niks van!");
					
				}
				if(input == null || input.molMassa == 0.0f){
					System.err.println("Er is iets fout gegaan. Dit is jou fout. Je bakt er helemaal niks van!");
					return;
				}
					
				System.out.println("De molaire massa van " + input.name + " is " + input.molMassa + " gram/mol" );	
				
				Stof wil = null;
				try {
					if(wil1.isSelected()) wil = new Stof(in[0]);
					if(wil2.isSelected()) wil = new Stof(in[1]);
					if(wil3.isSelected()) wil = new Stof(in[2]);
					if(wil4.isSelected()) wil = new Stof(in[3]);
					if(wil5.isSelected()) wil = new Stof(in[4]);
					if(wil6.isSelected()) wil = new Stof(in[5]);
				} catch (Exception e1) { 
					e1.printStackTrace();
					System.err.println("Er is iets fout gegaan. Dit is jou fout. Je bakt er helemaal niks van!");
				}
				if(wil == null || wil.molMassa == 0.0f){
					System.err.println("Er is iets fout gegaan. Dit is jou fout. Je bakt er helemaal niks van!");
					return;
				}
					
				System.out.println("De molaire massa van " + wil.name + " is " + wil.molMassa + " gram/mol" );
				
				float beginMass = Float.parseFloat(spinner.getValue().toString());
				int beginEenheid = eenheidBox1.getSelectedIndex();
				float grams = Units.toGram(beginMass, beginEenheid);
				System.out.println("De gegenves omrekenen naar gram: " +  beginMass + " " + Units.eenheidToString(beginEenheid)  + "  =>  " + grams + " gram");
				System.out.println("Nu hebben we alle gegenvens die we nodig hebben!");
				System.out.println("");
				
				
				System.out.println("Nu gaan nu het gegeven omrekenen naar mol:");
				System.out.println("Formule: mol = gram / molaire massa      (mol = gram / gram/mol)");
				float mol = grams / input.molMassa;
				System.out.println("Invullen: " + grams + "/" + input.molMassa + " = " + mol + " mol");
				
				System.out.println("");
				System.out.println("Nu gaan we het aantal mol van de gevraagde stof berekenen:");
				System.out.println("De truc is om het aantal mol te delen door het aantal moleculen van de gegeven stof, ");
				System.out.println("keer het aantal moleculen van de gevraagde stof.");
				float mol2 = mol;
				mol = mol / input.aantalMols * wil.aantalMols;
				System.out.println("Dus: " + mol2 + "/" + input.aantalMols + "*" + wil.aantalMols + " = " + mol + " mol");
				System.out.println("Dus er is " + mol + " mol " + wil.name);
				System.out.println("");
				
				System.out.println("Nu moeten we het aantal mol nog omrekenen naar gram.");
				System.out.println("Formule: gram = molaire massa * mol       (gram = gram/mol * mol)");
				grams = wil.molMassa * mol;
				System.out.println("Invullen: " + wil.molMassa  + "*" + mol + " = " + grams + " gram");
				System.out.println("");
				
				int eindEenheid = eenheidBox2.getSelectedIndex();
				float endMass = Units.to(grams, Units.GRAM, eindEenheid);
				System.out.println("De laatste stap is het omrekenen van gram naar " + Units.eenheidToString(eindEenheid));
				System.out.println("Daar is hopelijk geen uitleg voor nodig.");
				System.out.println("");
				
				System.out.println("Conclusie: Als je bij deze reactie " + beginMass + " " + Units.eenheidToString(beginEenheid) + " " + input.name + " hebt, "
									+ "dan heb je in theorie " + endMass + " " + Units.eenheidToString(eindEenheid) + " " + wil.name + ".");
				System.out.println("");
				System.out.println("");
			}
		});
		btnBereken.setBounds(10, 247, 591, 35);
		contentPane.add(btnBereken);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 299, 591, 386);
		contentPane.add(scrollPane);
		
		JTextPane console = new JTextPane();
		scrollPane.setViewportView(console);
		
		MessageConsole mc = new MessageConsole(console);
		mc.redirectOut();
		mc.redirectErr(Color.RED, null);
		setLocationRelativeTo(null);
	}
}
