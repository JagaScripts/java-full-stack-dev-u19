package ejercciotres;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * java-full-stack-dev-u19 - ejercciotres - encuestaApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 07/05/2022
 */
public class encuestaApp extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					encuestaApp frame = new encuestaApp();
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
	public encuestaApp() {
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 32, 109, 23);
		rdbtnNewRadioButton.setActionCommand(rdbtnNewRadioButton.getText());
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 58, 109, 23);
		rdbtnNewRadioButton_1.setActionCommand(rdbtnNewRadioButton_1.getText());
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 84, 109, 23);
		rdbtnNewRadioButton_2.setActionCommand(rdbtnNewRadioButton_2.getText());
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(10, 11, 135, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(218, 11, 177, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(215, 32, 129, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(215, 58, 129, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(215, 84, 129, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JSlider slider = new JSlider();
		slider.setMinimum(1);
		slider.setMaximum(10);
		slider.setBounds(22, 209, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(22, 174, 200, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Mostrar encuesta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensaje = "El sistema operativo elegido es ";
				mensaje += buttonGroup.getSelection().getActionCommand() + "\n";
				
				String cadenaChecks = "";
				if (chckbxNewCheckBox.isSelected()) {
					
					cadenaChecks += chckbxNewCheckBox.getText();
					
				} else if(chckbxNewCheckBox_1.isSelected()){
					
					cadenaChecks += ", " + chckbxNewCheckBox_1.getText();
					
				} else if (chckbxNewCheckBox_2.isSelected()) {
					
					cadenaChecks += ", " + chckbxNewCheckBox_2.getText();
				}
				if (cadenaChecks.isEmpty()) {
					
					mensaje += "No has seleccionado ninguna especialidad.\n";
					
				}else {
					
					mensaje += "Las especialidades seleccionadas son: " + cadenaChecks + ".\n";

				}
				mensaje += "Las horas dedicadas al ordenador son " + slider.getValue() + ".";
				JOptionPane.showMessageDialog(null, mensaje);
			}
		});
		btnNewButton.setBounds(280, 194, 144, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
