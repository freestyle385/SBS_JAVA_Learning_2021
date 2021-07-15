package java_06_28;

// 문제 : 아래와 같이 출력 되도록 해주세요.

class Void_return_sum_02 {
	public static void main(String[] args) {
		int 결과1 = Math02.nToMSum(2, 3);
		System.out.println("결과1 : " + 결과1);
		// 출력 : 결과1 : 5

		int 결과2 = Math02.nToMSum(5, 10);
		System.out.println("결과2 : " + 결과2);
		// 출력 : 결과2 : 45
	}
}

class Math02 {

	static int nToMSum(int a, int b) {
		int sum = 0;

		while (a <= b) {
			sum += a;
			a++;
		}
		return sum;
	}
}