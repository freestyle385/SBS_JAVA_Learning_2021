package java_07_07;

public class RunningMan {

	public static void main(String[] args) {
		사람1 a사람 = new 사람1();
		a사람.달리기_속력 = 20;
		a사람.달리다();
		// 사람이 20km/h로 달립니다.
		a사람.달리다();
		// 사람이 20km/h로 달립니다.

		a사람.달리기_속력 = 50;
		a사람.달리다();
		// 사람이 50km/h로 달립니다.
	}

}

class 사람1 {
	int 달리기_속력;
	void 달리다() {
		System.out.println("사람이 " + 달리기_속력 + "km/h 로 달립니다.");
	}
}