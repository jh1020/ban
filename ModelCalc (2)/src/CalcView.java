
import java.awt.FlowLayout;

import javax.swing.*;

public class CalcView extends JFrame {
	public JTextField tf_su1,tf_su2;
	public JComboBox<String> cb_oper;
	public JButton bt_calc;
	public JLabel la_result;
	
	JPanel panel;
	
	public CalcView() {
		setTitle("Simple Calculator"); //이름 설정
		
		//컴포넌트 초기화 및 설정
		tf_su1 = new JTextField(5);
		tf_su2 = new JTextField(5);
		
		cb_oper = new JComboBox();
		cb_oper.addItem("+");
		cb_oper.addItem("-");
		cb_oper.addItem("*");
		cb_oper.addItem("/");
		
		bt_calc = new JButton("계산");
		la_result = new JLabel();
		
		//레이아웃
		setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.add(tf_su1);
		panel.add(cb_oper);
		panel.add(tf_su2);
		panel.add(bt_calc);
		
		add(panel);
		add(la_result);
		
		setBounds(300,200,300,120);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void reset() {
		tf_su1.setText("");
		tf_su2.setText("");
	}
}
