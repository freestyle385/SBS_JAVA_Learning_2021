package java_06_28;

// ���� : �Ʒ��� ���� ��� �ǵ��� ���ּ���.

class Void_return_sum_02 {
	public static void main(String[] args) {
		int ���1 = Math02.nToMSum(2, 3);
		System.out.println("���1 : " + ���1);
		// ��� : ���1 : 5

		int ���2 = Math02.nToMSum(5, 10);
		System.out.println("���2 : " + ���2);
		// ��� : ���2 : 45
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