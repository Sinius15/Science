package com.sinius15.science.solutionSolver;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.sinius15.science.general.Units;
import com.sinius15.science.reactionSolver.MessageConsole;
import com.sinius15.science.reactionSolver.Stof;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SpinnerNumberModel;

public class SolutionFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField stof;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public SolutionFrame() {
		setResizable(false);
		setTitle("Rekenen aan oplossingen op de automatische piloot");
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
		setBounds(100, 100, 421, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		stof = new JTextField();
		stof.setBounds(241, 8, 164, 20);
		contentPane.add(stof);
		stof.setColumns(10);
		
		final JRadioButton oplossing = new JRadioButton("totale hoeveelheid oplossing");
		oplossing.setSelected(true);
		buttonGroup.add(oplossing);
		oplossing.setBounds(6, 78, 180, 23);
		contentPane.add(oplossing);
		
		final JRadioButton opgelosteStof = new JRadioButton("hoeveelheid opgeloste stof\r\n");
		buttonGroup.add(opgelosteStof);
		opgelosteStof.setBounds(6, 104, 180, 23);
		contentPane.add(opgelosteStof);
		
		final JRadioButton deMolariteit = new JRadioButton("molariteit");
		buttonGroup.add(deMolariteit);
		deMolariteit.setBounds(6, 130, 180, 23);
		contentPane.add(deMolariteit);
		
		final JSpinner liter = new JSpinner();
		liter.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		liter.setBounds(241, 79, 77, 20);
		contentPane.add(liter);
		
		final JSpinner massa = new JSpinner();
		massa.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		massa.setBounds(241, 110, 77, 20);
		contentPane.add(massa);
		
		final JSpinner molariteit = new JSpinner();
		molariteit.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		molariteit.setBounds(241, 141, 77, 20);
		contentPane.add(molariteit);
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"mico gram", "mili gram", "gram", "kilo gram", "ton"}));
		comboBox_1.setSelectedIndex(2);
		comboBox_1.setBounds(328, 107, 77, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblMolPerLieter = new JLabel("M");
		lblMolPerLieter.setBounds(328, 144, 35, 14);
		contentPane.add(lblMolPerLieter);
		
		JLabel lblWelkeStofIs = new JLabel("Welke stof is opgelost?        Bijvoorbeeld 'NaCl' ");
		lblWelkeStofIs.setBounds(6, 11, 241, 14);
		contentPane.add(lblWelkeStofIs);
		
		JLabel lblWelkeVanDe = new JLabel("Welke van de volgende eigenschappen wil je berekenen?");
		lblWelkeVanDe.setBounds(6, 36, 357, 20);
		contentPane.add(lblWelkeVanDe);
		
		JLabel lblZetEenBolletje = new JLabel("Zet een bolletje bij welke je wil berekenen, vul de rest in.");
		lblZetEenBolletje.setBounds(6, 56, 357, 20);
		contentPane.add(lblZetEenBolletje);
		
		JLabel lblLiter = new JLabel("Liter");
		lblLiter.setBounds(328, 82, 46, 14);
		contentPane.add(lblLiter);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 217, 399, 247);
		contentPane.add(scrollPane);
		
		JTextPane console = new JTextPane();
		scrollPane.setViewportView(console);
		
		JButton btnBereken = new JButton("Bereken");
		btnBereken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.err.println("=====Nieuwe Berekening=======");
				//formule =   Molariteit = mol / liter
				Stof s;
				try {
					s = new Stof(stof.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
					System.out.println("De stof ingevuld is geen geldigge stof.");
					return;
				}
				System.out.println("De molaire massa van " + s.originalIn + " is " + s.molMassa + " gram/mol");
				if(oplossing.isSelected()){		//aantal liter is gevraagd
					float gram = Units.toGram(((float) massa.getValue()), comboBox_1.getSelectedIndex());
					System.out.println("Het aantal " + s.originalIn + " omrekenen naar gram: " + massa.getValue() + " " + Units.eenheidToString(comboBox_1.getSelectedIndex()) + " => " + gram + " gram");
					float M = (float) molariteit.getValue();
					System.out.println("De molariteit van de oplossing is " + M + " mol per liter");
					System.out.println("Nu hebben we alle gegevens die we nodig hebben!");
					System.out.println("");
					System.out.println("Het aantal gram omrekenen naar mol:");
					System.out.println("Formule: mol = gram / molaire massa     (mol = gram / gram/mol)");
					float mol = gram/s.molMassa;
					System.out.println("Invullen: " + gram + "/" + s.molMassa + " = " + mol);
					System.out.println("");
					System.out.println("Nu gaat het echte werk beginnen:");
					System.out.println("Formule: Liter = mol / molariteit     (L = mol / M)");
					float L = mol / M;
					System.out.println("Invullen: " + mol + "/" + M + " = " + L);
					System.out.println("");
					System.out.println("Conclusie: Als je een oplossing hebt van "+ s.originalIn + " in water, en deze oplossing heeft een molariteit van " + M + "M, dan heb je " + L + " liter van deze oplossing.");
					
				}
				else if(opgelosteStof.isSelected()){    //mol is gevraagd
					float M = (float) molariteit.getValue();
					System.out.println("De molariteit van de oplossing is " + M + " mol per liter");
					float L = (float) liter.getValue();
					System.out.println("Het aantal literis " + L + " liter");
					System.out.println("Nu hebben we alle gegevens die we nodig hebben!");
					System.out.println("");
					System.out.println("Formule: mol = molariteit * liter          (mol = M * L)");
					float mol = M * L;
					System.out.println("Invullen: " + M + "*" + L + " = " + mol);
					System.out.println("Er zit " + mol + " mol in de oplossing");
					System.out.println("");
					System.out.println("Mol omrekenen naar gram:");
					System.out.println("Formule: gram = mol * molaire massa      (gram = mol * gram/mol)");
					float gram = mol * s.molMassa;
					System.out.println("Invullen: " + mol + "*" + s.molMassa + " = " + gram);
					System.out.println("");
					String outUnit = Units.eenheidToString(comboBox_1.getSelectedIndex());
					System.out.println("De laatste stap is het omrekenen van gram naar " + outUnit);
					System.out.println("Hier is hopelijk geen uitleg voor nodig.");
					float out = Units.to(gram, Units.GRAM, comboBox_1.getSelectedIndex());
					System.out.println("Dat wordt dan " + out + " " + outUnit);
					System.out.println("");
					System.out.println("Conclusie: Als je een oplossing van " + s.originalIn + " in " + L + "liter water met een molariteit van " + M + " mol/liter, dan zit er " + out + " " + outUnit + " in opgelost.");
				}
				else if(deMolariteit.isSelected()){   //molariteti is gevraagd
					float gram = Units.toGram(((float) massa.getValue()), comboBox_1.getSelectedIndex());
					System.out.println("Het aantal " + s.originalIn + " omrekenen naar gram: " + massa.getValue() + " " + Units.eenheidToString(comboBox_1.getSelectedIndex()) + " => " + gram + " gram");
					float L = (float) liter.getValue();
					System.out.println("Het aantal liter is " + L + " liter");
					System.out.println("Nu hebben we alle gegevens die we nodig hebben!");
					System.out.println("");
					System.out.println("Het aantal gram omrekenen naar mol:");
					System.out.println("Formule: mol = gram / molaire massa     (mol = gram / gram/mol)");
					float mol = gram/s.molMassa;
					System.out.println("Invullen: " + gram + "/" + s.molMassa + " = " + mol);
					System.out.println("");
					System.out.println("Nu gaat het echte werk beginnen:");
					System.out.println("Formule: Molariteit = mol / liter     (M = mol / Liter)");
					float M = mol / L;
					System.out.println("Invullen: " + mol + "/" + L + " = " + M);
					System.out.println("");
					System.out.println("Conclusie: Als je een oplossing van " + gram + " gram " + s.originalIn + " in " + L + " liter water, dan is de molariteit " + M + " mol/liter");
				}
				
			}
		});
		btnBereken.setBounds(6, 172, 399, 34);
		contentPane.add(btnBereken);
		
		MessageConsole mc = new MessageConsole(console);
		mc.redirectOut();
		mc.redirectErr(Color.RED, null);
		setLocationRelativeTo(null);
	}
}
