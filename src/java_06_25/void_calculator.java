package java_06_25;

public class void_calculator {

	public static void main(String[] args) {
		����.���Ѱ����_ȭ�鿡_���(10, 20);
		// ��� => ��� : 30

		����.���Ѱ����_ȭ�鿡_���(50, 20);
		// ��� => ��� : 70

		����.�������_ȭ�鿡_���(50, 20);
		// ��� => ��� : 30

		����.�������_ȭ�鿡_���(5, 2);
		// ��� => ��� : 3

		����.���Ѱ����_ȭ�鿡_���(5, 2);
		// ��� => ��� : 10
	}
}

class ���� {
	static void ���Ѱ����_ȭ�鿡_���(int a, int b) {
		System.out.printf("��� : %d\n", a + b);
	}
	static void �������_ȭ�鿡_���(int a, int b) {
		System.out.printf("��� : %d\n", a - b);
	}
	static void ���Ѱ����_ȭ�鿡_���(int a, int b) {
		System.out.printf("��� : %d\n", a * b);
	}
}