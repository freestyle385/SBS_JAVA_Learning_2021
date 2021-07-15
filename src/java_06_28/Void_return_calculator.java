package java_06_28;

public class Void_return_calculator {

	public static void main(String[] args) {
		int 결과;

		결과 = 계산기.합(10, 20);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 30

		결과 = 계산기.합(30, 20);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 50

		결과 = 계산기.합(30, 70);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 100

		결과 = 계산기.차(30, 70);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : -40

		결과 = 계산기.곱(3, 7);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 21
	}
}

class 계산기 {
	static int 합(int a, int b) {
		return a + b;
		// void는 리턴하지 않겠다는 뜻. 그러므로 리턴이 쓰이려면 int 함수로 적용해야 함
	}

	static int 차(int a, int b) {
		return a - b;
	}

	static int 곱(int a, int b) {
		return a * b;
	}
}