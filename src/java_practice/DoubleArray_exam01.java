package java_practice;

public class DoubleArray_exam01 {

	public static void main(String[] args) {
		// 2차원배열 예시) int [][] array = new int[3][4];
		// 위 array는 3개의 배열을 가지고, 각각 4개의 정수를 담을 수 있다
		int[][] array = { { 1, 2, 3, 4 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

		// 2차원 배열 array는 이중 for문을 이용
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 줄을 출력합니다>");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
