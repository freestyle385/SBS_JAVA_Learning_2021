package java_06_30;

public class Weapon_sword_bow_overloading {

	public static void main(String[] args) {

		���� a���� = new Į();
		Į aĮ = new Į();
		Ȱ aȰ = new Ȱ();

		a����.����();
	}

}

class ���� {
	void ����() {
// �ڽ� Ŭ������ ���� ��ư�� ����� ���� ��ư ���� = ��ü ���� ����(������)
// ���� Ŭ�������� Į Ŭ������ �Ѿ ���� ��ư�� ����
	}
}

class Į extends ���� {
	void ����() {
		System.out.println("Į�� �����մϴ�.");
	}
}

class Ȱ extends ���� {
	void ����() {
		System.out.println("Ȱ�� �����մϴ�.");
	}
}