package com.sinius15.science;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.sinius15.science.reactionSolver.SKFrame;
import com.sinius15.science.solutionSolver.SolutionFrame;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MainScreen() {
		setResizable(false);
		setTitle("Science Helper");
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
		setBounds(100, 100, 345, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final MainScreen thiss = this;
		JButton btnRekenenAanReactie = new JButton("Rekenen aan reacties");
		btnRekenenAanReactie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SKFrame f = new SKFrame();
				f.setVisible(true);
				thiss.dispose();
			}
		});
		btnRekenenAanReactie.setBounds(10, 37, 315, 34);
		contentPane.add(btnRekenenAanReactie);
		
		JLabel lblWatWilJe = new JLabel("Wat wil je gaan doen?");
		lblWatWilJe.setBounds(10, 11, 130, 14);
		contentPane.add(lblWatWilJe);
		
		JButton btnRekenenAanOplossingen = new JButton("Rekenen aan oplossingen");
		btnRekenenAanOplossingen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolutionFrame f = new SolutionFrame();
				f.setVisible(true);
				thiss.dispose();
			}
		});
		btnRekenenAanOplossingen.setBounds(10, 82, 315, 34);
		contentPane.add(btnRekenenAanOplossingen);
		this.requestFocus();
		setLocationRelativeTo(null);
	}
}
