package ProjectA13;

public class ProjectA1205 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println("Exception이 발생했습니다.");
		}
	}
}
