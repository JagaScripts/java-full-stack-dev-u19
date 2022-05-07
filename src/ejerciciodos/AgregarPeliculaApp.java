package ejerciciodos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * java-full-stack-dev-u19 - ejerciciodos - AgregarPeliculaApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 07/05/2022
 */
public class AgregarPeliculaApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPeliculaApp frame = new AgregarPeliculaApp();
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
	public AgregarPeliculaApp() {
		setResizable(false);
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ecribe el título de una película");
		lblNewLabel.setBounds(39, 37, 153, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setBounds(302, 37, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(37, 61, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	
		
		JButton btnNewButton = new JButton("Añadir películas");
		
		btnNewButton.setBounds(53, 112, 115, 23);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		comboBox.setBounds(263, 60, 115, 22);
		contentPane.add(comboBox);
		comboBox.addItem("Matrix");
		comboBox.addItem("Hasta el último hombre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().trim().isEmpty()) {
					comboBox.addItem(textField.getText().trim());
				}
			}
		});
		
	}
}
