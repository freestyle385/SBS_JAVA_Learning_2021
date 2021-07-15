package java_06_25;

public class void_calculator {

	public static void main(String[] args) {
		계산기.더한결과를_화면에_출력(10, 20);
		// 출력 => 결과 : 30

		계산기.더한결과를_화면에_출력(50, 20);
		// 출력 => 결과 : 70

		계산기.뺀결과를_화면에_출력(50, 20);
		// 출력 => 결과 : 30

		계산기.뺀결과를_화면에_출력(5, 2);
		// 출력 => 결과 : 3

		계산기.곱한결과를_화면에_출력(5, 2);
		// 출력 => 결과 : 10
	}
}

class 계산기 {
	static void 더한결과를_화면에_출력(int a, int b) {
		System.out.printf("결과 : %d\n", a + b);
	}
	static void 뺀결과를_화면에_출력(int a, int b) {
		System.out.printf("결과 : %d\n", a - b);
	}
	static void 곱한결과를_화면에_출력(int a, int b) {
		System.out.printf("결과 : %d\n", a * b);
	}
}