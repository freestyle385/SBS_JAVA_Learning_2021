package java_06_23;

public class void_and_return_type {

	public static void main(String[] args) {
		int x = ����.��(11, 22);
		System.out.printf("x : %d\n", x);

		int y = ����.��(42, 12);
		System.out.printf("y : %d\n", y);
		
		double z = ����.������(12.2, 5.12);
		System.out.printf("z : %.2f\n", z);
		// .2f�� �Ǽ� �Ҽ��� ��° �ڸ����� ����	

	}

}

class ���� {
	static int ��(int a, int b) {
		// static�� �ԷµǸ�, ���赵(Ÿ��)���� ���� �����ϰ� ��
		// void�� ��� ���� ������ �̷���� ��, ���� �����Ͽ� ���������� �� ��.
		// ���� ���� Ȱ���ϱ� ���ؼ��� ���� Ÿ���� �Է�(int, float ��)
		return a + b;
	}

	static double ������(double a, double b) {
		return a / b;
	}
}
