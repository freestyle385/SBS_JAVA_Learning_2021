package java_06_23;

public class obj_compare {

	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.말하다();
		a사람.말하다();
		a사람.말하다();
		// new가 한 번이므로, 객체는 1개. 1명의 사람이 3번 말한 것.
		
		new 사람().말하다();
		new 사람().말하다();
		new 사람().말하다();
		// new가 세 번이므로, 객체는 3개. 3명의 사람이 1번씩 말한 것.
	}

}
class 사람{
	static void 말하다() {
		System.out.println("사람이 말합니다.");
	}
}