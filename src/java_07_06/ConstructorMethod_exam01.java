package java_07_06;

public class ConstructorMethod_exam01 {

	public static void main(String[] args) {
		���_1 aȫ�浿 = new ȫ�浿();
		System.out.printf("== ȫ�浿 ���� ==\n");
		System.out.printf("�̸� : %s\n", aȫ�浿.�̸�); // ȫ�浿
		System.out.printf("���� : %s\n", aȫ�浿.����); // 22
		���_1 aȫ��� = new ȫ���();
		System.out.printf("== ȫ��� ���� ==\n");
		System.out.printf("�̸� : %s\n", aȫ���.�̸�); // ȫ���
		System.out.printf("���� : %s\n", aȫ���.����); // 22
	}

}

class ���_1 {
	String �̸�;
	int ����;

	���_1() {
		this.���� = 22;
	}
	// ������ �޼ҵ�� new�� �� �ڵ����� �����.
	// Ŭ���������� �Լ����� �����ǰ� Ÿ�� ���� X.
}

class ȫ�浿 extends ���_1 {
	ȫ�浿() {
		this.�̸� = "ȫ�浿";
	}
	// ������ �޼ҵ�	
}

class ȫ��� extends ���_1 {
	ȫ���() {
		this.�̸� = "ȫ���";
	}
	// ������ �޼ҵ�
}