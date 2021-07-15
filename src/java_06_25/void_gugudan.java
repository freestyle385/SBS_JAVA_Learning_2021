package java_06_25;

public class void_gugudan {

	public static void main(String[] args) {

		new 구구단출력기().작동();
	}
}

class 구구단출력기 {
	// 구현시작
	void 작동() {
		int dan = 2;
		while (dan <= 9) {
			System.out.printf("==%d단==\n", dan);
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
			dan++;
		}

	}
	// 구현끝
}
