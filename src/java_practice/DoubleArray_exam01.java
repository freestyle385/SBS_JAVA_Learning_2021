package java_practice;

public class DoubleArray_exam01 {

	public static void main(String[] args) {
		// 2�����迭 ����) int [][] array = new int[3][4];
		// �� array�� 3���� �迭�� ������, ���� 4���� ������ ���� �� �ִ�
		int[][] array = { { 1, 2, 3, 4 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

		// 2���� �迭 array�� ���� for���� �̿�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� ����մϴ�>");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
