package ProjectA1111;

import java.util.Calendar;

public class ProjectA1105 {
	public static void print(String msg,  Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.println(msg + year + "/" + month + "/" + day + "/");
		switch (dayOfWeek) {
		case Calendar.SUNDAY:System.out.println("일요일"); break; 
		case Calendar.MONDAY:System.out.println("월요일"); break; 
		case Calendar.TUESDAY:System.out.println("화요일"); break; 
		case Calendar.WEDNESDAY:System.out.println("수요일"); break; 
		case Calendar.THURSDAY:System.out.println("목요일"); break; 
		case Calendar.FRIDAY:System.out.println("금요일"); break; 
		case Calendar.SATURDAY:System.out.println("토요일"); break; 
		}
		
		System.out.println("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		System.out.println(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초")
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		print("현재" , now);
		
		
		Calendar 
		
	}
}







