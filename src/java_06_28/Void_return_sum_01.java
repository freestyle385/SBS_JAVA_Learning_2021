package java_06_28;

// ���� : �Ʒ��� ���� ��� �ǵ��� ���ּ���.

class Void_return_sum_01 {
	public static void main(String[] args) {
		// ���� ����
		int c = 20 + Math01.���ϱ�(10, 20);
		System.out.println(c);
		// ���� ��

		int ���1 = Math01.oneToSum(3);
		System.out.println("���1 : " + ���1);
		// ��� : ���1 : 6

		int ���2 = Math01.oneToSum(10);
		System.out.println("���2 : " + ���2);
		// ��� : ���2 : 55
	}
}

class Math01 {
	// static => ��������
	// static�� ���� Ŭ������ ���ݴ��� �����Ѵ�.
	static int ���ϱ�(int a, int b) {
		// ���� �޼����� int c�� �Ʒ� int c�� ���� ���谡 ����.
		int c = a + b;

		// return ���� Ÿ�԰� �Լ����� �պκ��� ���ƾ� �Ѵ�.
		// return => ����
		return c;
	}

	static int oneToSum(int max) {
		int sum = 0;
		int i = 1;

		while (i <= max) {
			sum += i;
			i++;
		}

		return sum;
	}
}