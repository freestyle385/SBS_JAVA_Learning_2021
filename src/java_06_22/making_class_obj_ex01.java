// �ڵ��� Ŭ���� ������ ���� ����, ��ü ����
// ������ ��ü�� ������ ����
// '�޸���'��� ���� ������ �߻�ȭ�� �Լ� ����

package java_06_22;

public class making_class_obj_ex01 {

	public static void main(String[] args) {
		�ڵ��� a�ڵ���1 = new �ڵ���();
		�ڵ��� b�ڵ���2 = new �ڵ���();
		
		a�ڵ���1.�ְ�ӷ� = 250;
		b�ڵ���2.�ְ�ӷ� = 340;
		
		System.out.printf("a�ڵ���1�� �ְ�ӷ� : %d\n", a�ڵ���1.�ְ�ӷ�);
		System.out.printf("b�ڵ���2�� �ְ�ӷ� : %d\n", b�ڵ���2.�ְ�ӷ�);
		
		a�ڵ���1.�޸���();
		b�ڵ���2.�޸���();
		
		a�ڵ���1.����();
		b�ڵ���2.����();
	}

}

class �ڵ���{
	int �ְ�ӷ�;
	int ����;
	void �޸���() {
		System.out.println("�޸��ϴ�.");
	}
	void ����() {
		System.out.println("���ϴ�.");
	}
}