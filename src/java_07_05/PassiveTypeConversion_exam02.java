// �ڵ��� ���������� ��� ��ü�� ������ ��, �ش� �������� ����Ű�� �ִ� ��ü�� �ٽ� ��� ���������� ����Ű��(�����ϰ�) �ϴ� �ڵ带 �ۼ����ּ���.

package java_07_05;

public class PassiveTypeConversion_exam02 {

	public static void main(String[] args) {
		�ڵ��� a�ڵ��� = new ���();
		��� a��� = (���) a�ڵ���;
	}

}
class �ڵ��� {
	void �޸���() {}
	void ����() {}
}
class ��� extends �ڵ��� {
	void �Ѳ���_������() {}
}