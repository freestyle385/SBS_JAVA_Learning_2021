package java_07_07;

public class ReturnTypeMethod {

	public static void main(String[] args) {
		int i = �κ�.get����();
		boolean b = �κ�.get��();
		���2 a��� = �κ�.get���();
		���2 a���2 = �κ�.get���2();
		���2 a���3 = �κ�.get���3();
		���2 a���4 = �κ�.get���4();
		���2 a���5 = �κ�.get���5(123, false);
		�κ�.get���6(123, false);
	}

}
class �κ� {
	static int get����() {
		return 0;
	}
	static boolean get��() {
		return true;
	}
	static ���2 get���() {
		return null;
	}
	static ���2 get���2() {
		���2 a��� = null;
		return a���;
	}
	static ���2 get���3() {
		���2 a��� = null;
		return a���;
	}
	static ���2 get���4() {
		���2 a��� = null;
		return a���;
	}
	static ���2 get���5(int ����, boolean ��ȥ����) {
		���2 a��� = null;
		a���.���� = ����;
		a���.��ȥ���� = ��ȥ����;
		return a���;
	}
	static void get���6(int ����, boolean ��ȥ����) {
		���2 a��� = null;
		a���.���� = ����;
		a���.��ȥ���� = ��ȥ����;
		return; // �������� �ʰڴ�(�Լ��� ������) => void �Լ��� ���� �Ұ��ϹǷ�.
	}
}
class ���2 extends �κ� {
	int ����;
	boolean ��ȥ����;
}