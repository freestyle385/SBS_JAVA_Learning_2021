package java_06_28;

public class Void_return_calculator {

	public static void main(String[] args) {
		int ���;

		��� = ����.��(10, 20);
		System.out.println("��� : " + ���);
		// ��� => ��� : 30

		��� = ����.��(30, 20);
		System.out.println("��� : " + ���);
		// ��� => ��� : 50

		��� = ����.��(30, 70);
		System.out.println("��� : " + ���);
		// ��� => ��� : 100

		��� = ����.��(30, 70);
		System.out.println("��� : " + ���);
		// ��� => ��� : -40

		��� = ����.��(3, 7);
		System.out.println("��� : " + ���);
		// ��� => ��� : 21
	}
}

class ���� {
	static int ��(int a, int b) {
		return a + b;
		// void�� �������� �ʰڴٴ� ��. �׷��Ƿ� ������ ���̷��� int �Լ��� �����ؾ� ��
	}

	static int ��(int a, int b) {
		return a - b;
	}

	static int ��(int a, int b) {
		return a * b;
	}
}