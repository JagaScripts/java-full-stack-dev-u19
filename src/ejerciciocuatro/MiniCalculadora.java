package ejerciciocuatro;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * java-full-stack-dev-u19 - ejerciciocuatro - MiniCalculadora
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 07/05/2022
 */
public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setTitle("Mini Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 111, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(10, 179, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Operando 1");
		lblNewLabel.setBounds(10, 18, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operando 2");
		lblNewLabel_1.setBounds(10, 80, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 154, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 225, 209, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double operando1 = Double.parseDouble(textField.getText());
					Double operando2 = Double.parseDouble(textField_1.getText());
					Double resultado = operando1 + operando2;
					textField_2.setText(String.valueOf(resultado));
					
				} catch (Exception e2) {
					
					lblNewLabel_3.setText(e2.getMessage());
					
				}
			}
		});
		btnNewButton.setBounds(119, 11, 100, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double operando1 = Double.parseDouble(textField.getText());
					Double operando2 = Double.parseDouble(textField_1.getText());
					Double resultado = operando1 - operando2;
					textField_2.setText(String.valueOf(resultado));
					
				} catch (Exception e2) {
					
					lblNewLabel_3.setText(e2.getMessage());
					
				}
			}
		});
		btnNewButton_1.setBounds(119, 42, 100, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicación");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double operando1 = Double.parseDouble(textField.getText());
					Double operando2 = Double.parseDouble(textField_1.getText());
					Double resultado = operando1 * operando2;
					textField_2.setText(String.valueOf(resultado));
					
				} catch (Exception e2) {
					
					lblNewLabel_3.setText(e2.getMessage());
					
				}
			}
		});
		btnNewButton_2.setBounds(119, 76, 100, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("División");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Double operando1 = Double.parseDouble(textField.getText());
					Double operando2 = Double.parseDouble(textField_1.getText());
					Double resultado = operando1 / operando2;
					textField_2.setText(String.valueOf(resultado));
					
				} catch (Exception e2) {
					
					lblNewLabel_3.setText(e2.getMessage());
					
				}
			}
		});
		btnNewButton_3.setBounds(119, 110, 100, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton_4.setBounds(119, 144, 100, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("About");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Mini calculadora reaizada por:\nJose Antonio González Alcántara");
			}
		});
		btnNewButton_5.setBounds(119, 178, 100, 23);
		contentPane.add(btnNewButton_5);
		
	}
}
