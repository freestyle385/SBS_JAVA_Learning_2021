package java_06_23;

public class obj_compare {

	public static void main(String[] args) {
		��� a��� = new ���();
		a���.���ϴ�();
		a���.���ϴ�();
		a���.���ϴ�();
		// new�� �� ���̹Ƿ�, ��ü�� 1��. 1���� ����� 3�� ���� ��.
		
		new ���().���ϴ�();
		new ���().���ϴ�();
		new ���().���ϴ�();
		// new�� �� ���̹Ƿ�, ��ü�� 3��. 3���� ����� 1���� ���� ��.
	}

}
class ���{
	static void ���ϴ�() {
		System.out.println("����� ���մϴ�.");
	}
}