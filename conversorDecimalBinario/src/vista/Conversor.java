package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Numero;

public class Conversor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numero;
	private Numero numeros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 21, 17, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 32, 98, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel panelDecimal = new JPanel();
		GridBagConstraints gbc_panelDecimal = new GridBagConstraints();
		gbc_panelDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_panelDecimal.fill = GridBagConstraints.BOTH;
		gbc_panelDecimal.gridx = 1;
		gbc_panelDecimal.gridy = 0;
		contentPane.add(panelDecimal, gbc_panelDecimal);
		GridBagLayout gbl_panelDecimal = new GridBagLayout();
		gbl_panelDecimal.columnWidths = new int[] { 12, 74, 62, 0, 0 };
		gbl_panelDecimal.rowHeights = new int[] { 11, 0 };
		gbl_panelDecimal.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelDecimal.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelDecimal.setLayout(gbl_panelDecimal);

		JLabel lblNewLabel = new JLabel("Decimal");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panelDecimal.add(lblNewLabel, gbc_lblNewLabel);

		numero = new JTextField();
		GridBagConstraints gbc_numero = new GridBagConstraints();
		gbc_numero.insets = new Insets(0, 0, 0, 5);
		gbc_numero.fill = GridBagConstraints.HORIZONTAL;
		gbc_numero.gridx = 2;
		gbc_numero.gridy = 0;
		panelDecimal.add(numero, gbc_numero);
		numero.setColumns(10);

		JPanel panelBinario = new JPanel();
		GridBagConstraints gbc_panelBinario = new GridBagConstraints();
		gbc_panelBinario.insets = new Insets(0, 0, 5, 5);
		gbc_panelBinario.fill = GridBagConstraints.BOTH;
		gbc_panelBinario.gridx = 1;
		gbc_panelBinario.gridy = 1;
		contentPane.add(panelBinario, gbc_panelBinario);
		GridBagLayout gbl_panelBinario = new GridBagLayout();
		gbl_panelBinario.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelBinario.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelBinario.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelBinario.rowWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		panelBinario.setLayout(gbl_panelBinario);

		JLabel lblNewLabel_1 = new JLabel("Binario");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelBinario.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel resultado = new JLabel("");
		GridBagConstraints gbc_resultado = new GridBagConstraints();
		gbc_resultado.insets = new Insets(0, 0, 5, 0);
		gbc_resultado.gridx = 1;
		gbc_resultado.gridy = 0;
		panelBinario.add(resultado, gbc_resultado);

		JPanel botonCalcular = new JPanel();
		GridBagConstraints gbc_botonCalcular = new GridBagConstraints();
		gbc_botonCalcular.insets = new Insets(0, 0, 0, 5);
		gbc_botonCalcular.fill = GridBagConstraints.BOTH;
		gbc_botonCalcular.gridx = 1;
		gbc_botonCalcular.gridy = 2;
		contentPane.add(botonCalcular, gbc_botonCalcular);
		GridBagLayout gbl_botonCalcular = new GridBagLayout();
		gbl_botonCalcular.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_botonCalcular.rowHeights = new int[] { 0, 0 };
		gbl_botonCalcular.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_botonCalcular.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		botonCalcular.setLayout(gbl_botonCalcular);

		JButton calcular = new JButton("Calcular");
		calcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
							
			}
		});
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_calcular = new GridBagConstraints();
		gbc_calcular.insets = new Insets(0, 0, 0, 5);
		gbc_calcular.gridx = 1;
		gbc_calcular.gridy = 0;
		botonCalcular.add(calcular, gbc_calcular);
	}

}
