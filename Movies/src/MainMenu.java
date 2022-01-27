import java.io.IOException;
import java.util.ArrayList;

class MainMenu extends AbstractMenu {
	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT = "1: 영화 예매하기\n" + "2: 예매 확인하기\n" + "3: 예매 취소하기\n" + "4: 관리자 메뉴로 이동\n"
			+ "5: 종료\n\n" + "메뉴를 선택하세요:";

	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);
	}

	public static MainMenu getInstance() {
		return instance;
	}

	public Menu next() {
		switch (scanner.nextLine()) {
			case "1":
				reserve();
				return this;
				
			case "2":
				checkReservation();
				return this;
			case"3": 
				cancleRevation();
				return this;
			if (!checkAdminPassword()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu;

		case "q":
			return prevMenu;
		default:
			return this;
		}
	}

	private boolean checkAdminPassword() {
		System.out.print("관리자 비밀번호를 입력하세요: ");
		return "admin1234".equals(scanner.nextLine());
	}

	private void checkReservation() {
		System.out.println("발급번호를 입력하세요: ");
		try {
			Reservation r = Reservation.findById(scanner.nextLine());
			if (r != null) {
				System.out.printf(">> [확인완료] %s\n", r.toString());
			} else {
				System.out.println(">> 예매 내역이 없습니다.");
			}
		} catch (IOException e) {
			System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
		}
	}
	private void cancleRevation() {
		System.out.println("발급번호를 입력하세요: ");
		try {
			Reservation cancled =
					Reservation.cancle(scanner.nextLine());
			if (cancled != null) {
				System.out.printf(">> [취소완료] %s의 예매가 취소되었습니다.\n",
				cancled.toString());
			} else {
				System.out.println(">> 예매 내역이 없습니다.");
			}
		} catch (IOException e) {
			System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
		}
	}
	
	private void reserve() {
		try {
			ArrayList<Movie> movies = Movie.findAll();
			for(int i =0; i < movies.size(); i++) {
				System.out.printf("%s\n", movies.get(i).toString());
			}
			System.out.print("예매할 영화를 선택하세요: ");
			String movieIdStr = scanner.nextLine();
			Movie m = Movie.findById(movieIdStr);
			ArrayList<Reservation> reservations =
					Reservation.findByMovieId(movieIdStr);
			Seats seats = new Seats(reservations);
			seats.show();
			System.out.print("좌석을 선택하세요(예: E-9): ");
			String seatName = scanner.nextLine();
			seats.mark(seatName);
			Reservation r = new Reservation(
					Long.parseLong(movieIdStr),
					m.getTitle(),
					seatName
					);
			r.save();
			System.out.println(">> 예매가 완료되었습니다.");
			
			
		}
		
	}
	
	
	
	
}
