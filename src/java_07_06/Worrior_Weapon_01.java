package java_07_06;

public class Worrior_Weapon_01 {

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
		a����.����ڸ� = �̸�;
		a����.�۵�();
	}
}

class ���� {
	String ����ڸ�;
	void �۵�( ) {
		
	}
}

class Į extends ���� {
	void �۵�( ) {
		System.out.println(����ڸ� + "�� Į�� �����մϴ�.");
	}
}

class Ȱ extends ���� {
	void �۵�( ) {
		System.out.println(����ڸ� + "�� Ȱ�� �����մϴ�.");
	}
}
