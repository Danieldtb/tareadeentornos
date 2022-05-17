import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

public class miVentana {

	private JFrame frame;
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
					miVentana window = new miVentana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public miVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Código Departamento");
		lblNewLabel.setBounds(65, 70, 300, 22);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(250, 65, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre Departamento");
		lblNewLabel_1.setBounds(65, 125, 300, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(250, 120, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Extensión Departamento");
		lblNewLabel_2.setBounds(65, 180, 300, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(250, 175, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton botonInsertar = new JButton("Inserte Datos");
		botonInsertar.setBounds(40, 227, 89, 23);
		frame.getContentPane().add(botonInsertar);

		botonInsertar.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e) {

				System.out.println(" Los datos se han insertado correctamente");

				System.exit(0);

			}

		});

		JButton botonLimpiar = new JButton("Salir");
		botonLimpiar.setBounds(299, 227, 89, 23);
		frame.getContentPane().add(botonLimpiar);

		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("El formulario se ha limpiado satisfactoriamente");
				System.exit(0);
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 200, 140));
		panel.setBounds(25, 25, 380, 200);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel_3 = new JLabel("FORMULARIO");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
	}

}
