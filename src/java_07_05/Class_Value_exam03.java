package java_07_05;

public class Class_Value_exam03 {

	public static void main(String[] args) {
		���� a���� = new ����();

		String �̸� = "ĭ";
		a����.�̸� = �̸�;
		a����.���� = 20;
		a����.�ڱ�Ұ�();

		a����.����++;
		a����.�ڱ�Ұ�();

		a����.���� = 30;
		a����.�̸� = "ī��";
		a����.�ڱ�Ұ�();

		a����.a���� = new Ȱ();
		a����.����();
		// ��� : ī�ϰ� Ȱ�� �����մϴ�.

		a����.a���� = new Į();
		a����.����();
		// ��� : ī�ϰ� Į�� �����մϴ�.
	}
}

class ���� {
	// �ν��Ͻ� ����
	String �̸�;
	// �ν��Ͻ� ����
	int ����;
	// �ν��Ͻ� ����
	���� a����;

	void �ڱ�Ұ�() {
		System.out.println("�ȳ��ϼ���. ���� " + this.���� + "�� " + this.�̸� + " �Դϴ�.");
	}

	void ����() {
		a����.�۵�(this.�̸�);
	}
}

class ���� {
	void �۵�(String ����ڸ�) {

	}
}

class Į extends ���� {
	void �۵�(String ����ڸ�) {
		System.out.println(����ڸ� + "�� Į�� �����մϴ�");
	}
}

class Ȱ extends ���� {
	void �۵�(String ����ڸ�) {
		System.out.println(����ڸ� + "�� Ȱ�� �����մϴ�");
	}
}
