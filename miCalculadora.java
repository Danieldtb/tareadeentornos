import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class miCalculadora {

	private JFrame frame;
	private JTextField caja;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miCalculadora window = new miCalculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Declaramos las variables
	public float primernumero;
	public float segundonumero;
	public String operador;

	/**
	 * Create the application.
	 */
	public miCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 328, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja = new JTextField();
		caja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		caja.setBackground(Color.WHITE);
		caja.setForeground(Color.BLACK);
		caja.setBounds(22, 21, 272, 34);
		frame.getContentPane().add(caja);
		caja.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText("");
			}
		});
		btnNewButton.setBounds(22, 77, 48, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(caja.getText());
				operador = "/";
				caja.setText("");
			}
		});
		btnNewButton_1.setBounds(96, 77, 48, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("*");
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(caja.getText());
				operador = "*";
				caja.setText("");
			}
		});
		btnNewButton_2.setBounds(170, 77, 48, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("-");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(caja.getText());
				operador = "-";
				caja.setText("");
			}
		});
		btnNewButton_3.setBounds(246, 77, 48, 45);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("7");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "7");
			}
		});
		btnNewButton_4.setBounds(22, 135, 48, 45);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("8");
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "8");
			}
		});
		btnNewButton_5.setBounds(96, 135, 48, 45);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("9");
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "9");
			}
		});
		btnNewButton_6.setBounds(170, 135, 48, 45);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("+");
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "+";
				caja.setText("");
			}
		});
		btnNewButton_7.setBounds(246, 135, 48, 103);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("4");
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_8.setBackground(Color.ORANGE);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "4");
			}
		});
		btnNewButton_8.setBounds(22, 193, 48, 45);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("5");
		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_9.setBackground(Color.ORANGE);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "5");
			}
		});
		btnNewButton_9.setBounds(96, 193, 48, 45);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("6");
		btnNewButton_10.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_10.setBackground(Color.ORANGE);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "6");
			}
		});
		btnNewButton_10.setBounds(170, 193, 48, 45);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("3");
		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_11.setBackground(Color.ORANGE);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "3");
			}
		});
		btnNewButton_11.setBounds(170, 251, 48, 45);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("2");
		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_12.setBackground(Color.ORANGE);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "2");
			}
		});
		btnNewButton_12.setBounds(96, 251, 48, 45);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("1");
		btnNewButton_13.setForeground(Color.BLACK);
		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_13.setBackground(Color.ORANGE);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "1");
			}
		});
		btnNewButton_13.setBounds(22, 251, 48, 45);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("0");
		btnNewButton_14.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_14.setBackground(Color.ORANGE);
		btnNewButton_14.setForeground(Color.BLACK);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "0");
			}
		});
		btnNewButton_14.setBounds(22, 309, 122, 45);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton(".");
		btnNewButton_15.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_15.setBackground(Color.ORANGE);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(caja.getText().contains("."))) {
					caja.setText(caja.getText()+".");
				}
			}
		});
		btnNewButton_15.setBounds(170, 309, 48, 45);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("=");
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_16.setBackground(Color.ORANGE);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundonumero = Float.parseFloat(caja.getText());
				switch(operador) {
				case "+": caja.setText(Float.toString((primernumero + segundonumero))); 
				break;
				}
				
				segundonumero = Float.parseFloat(caja.getText());
				switch(operador) {
				case "*": caja.setText(Float.toString((primernumero * segundonumero))); 
				break;
				}
				
				segundonumero = Float.parseFloat(caja.getText());
				switch(operador) {
				case "/": caja.setText(Float.toString((primernumero / segundonumero))); 
				break;
				}
				
				segundonumero = Float.parseFloat(caja.getText());
				switch(operador) {
				case "-": caja.setText(Float.toString((primernumero - segundonumero))); 
				break;
				}
			}
		});
		btnNewButton_16.setBounds(246, 251, 48, 103);
		frame.getContentPane().add(btnNewButton_16);
	}
}
