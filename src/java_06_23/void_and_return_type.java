package java_06_23;

public class void_and_return_type {

	public static void main(String[] args) {
		int x = 계산기.합(11, 22);
		System.out.printf("x : %d\n", x);

		int y = 계산기.합(42, 12);
		System.out.printf("y : %d\n", y);
		
		double z = 계산기.나누기(12.2, 5.12);
		System.out.printf("z : %.2f\n", z);
		// .2f로 실수 소수점 둘째 자리까지 지정	

	}

}

class 계산기 {
	static int 합(int a, int b) {
		// static이 입력되면, 설계도(타입)에서 직접 실행하게 함
		// void는 출력 등의 행위만 이루어질 뿐, 값을 리턴하여 내보내지는 못 함.
		// 리턴 값을 활용하기 위해서는 리턴 타입을 입력(int, float 등)
		return a + b;
	}

	static double 나누기(double a, double b) {
		return a / b;
	}
}
