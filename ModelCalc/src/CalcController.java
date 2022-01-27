import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcController implements ActionListener {

	CalcView view;
	
	public CalcController() {
		view = new CalcView();
		view.bt_calc.addActionListener((ActionListener) this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.bt_calc) {
			String su1Str = view.tf_su1.getText();
			String su2Str = view.tf_su2.getText();
			String oper = view.cb_oper.getSelectedItem().toString();
			
			if(!su1Str.matches("[0-9]+")||!su2Str.matches("[\\d]+")) {
				view.la_result.setText("숫자만 입력하세요.");
				return;
			}else if(oper.equals("/")&&su2Str.equals("0")) {
				view.la_result.setText("0으로 나룻 수 없습니다.");
				return;
			}
			
			Calculator calc = new Calculator(Integer.parseInt(su1Str), Integer.parseInt(su2Str), oper);
			
			String result = calc.getResultstr();
			
			view.la_result.setText(result);
			view.reset();
		}
		
	}
	
	
	public static void main(String[] args) {
		new CalcController();
	}
	
	
	
	
}
