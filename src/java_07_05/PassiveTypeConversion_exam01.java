// ���� i�� ������ �ִ� 10�� double �� ������ �ְ� �ش� ������ ���� �ٽ� i�� �ֱ�
package java_07_05;

public class PassiveTypeConversion_exam01 {

	public static void main(String[] args) {
		int i = 10;
	    double d = i; // ���⼱ �ڵ�����ȯ ���
	    i = (int) d; // ���⼱ �ڵ�����ȯ �Ұ��� => ������ȯ
	    
	    System.out.println(i);
	}

}
