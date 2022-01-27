package ProjcatA15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.Scanner;

public class Calculator2 extends JFrame implements Calc {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
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
	public Calculator2() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 300, 300, 400);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btn_1 = new JButton("1");
		btn_1.setBounds(12, 106, 60, 60);
		panel.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.setBounds(75, 106, 60, 60);
		panel.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(240, 240, 240));
		btn_3.setBounds(138, 106, 60, 60);
		panel.add(btn_3);

		JButton btn_4 = new JButton("4");
		btn_4.setBounds(12, 166, 60, 60);
		panel.add(btn_4);

		JButton minus = new JButton("-");
		minus.setBounds(202, 106, 60, 60);
		panel.add(minus);

		JButton btn_0 = new JButton("0");
		btn_0.setBounds(12, 281, 60, 60);
		panel.add(btn_0);

		JButton btn_7 = new JButton("7");
		btn_7.setBounds(12, 225, 60, 60);
		panel.add(btn_7);

		JButton btn_5 = new JButton("5");
		btn_5.setBounds(75, 166, 60, 60);
		panel.add(btn_5);

		JButton btn_8 = new JButton("8");
		btn_8.setBounds(75, 225, 60, 60);
		panel.add(btn_8);

		JButton btn_com = new JButton(".");
		btn_com.setBounds(75, 281, 60, 60);
		panel.add(btn_com);

		JButton btn_6 = new JButton("6");
		btn_6.setBounds(138, 166, 60, 60);
		panel.add(btn_6);

		JButton btn_9 = new JButton("9");
		btn_9.setBounds(138, 225, 60, 60);
		panel.add(btn_9);

		JButton btn_equls = new JButton("=");
		btn_equls.setBounds(138, 281, 60, 60);
		panel.add(btn_equls);

		JButton btn_plus = new JButton("+");
		btn_plus.setBounds(202, 166, 60, 60);
		panel.add(btn_plus);

		JButton btn_multi = new JButton("*");
		btn_multi.setBounds(202, 225, 60, 60);
		panel.add(btn_multi);

		JButton btn_div = new JButton("/");
		btn_div.setBounds(202, 281, 60, 60);
		panel.add(btn_div);

		JButton clear_btn = new JButton("clear");
		clear_btn.setBounds(12, 73, 250, 23);
		panel.add(clear_btn);

		JLabel lblNewLabel = new JLabel(result);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(12, 10, 250, 47);
		panel.add(lblNewLabel);
	}
}
