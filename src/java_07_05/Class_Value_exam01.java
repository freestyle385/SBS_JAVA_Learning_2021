// 사람이 a왼팔 이라는 변수를 가질 수 있게 해주세요.
package java_07_05;

public class Class_Value_exam01 {

	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.a왼팔 = new 팔();
		
		a사람.나이 = 20;
		a사람.a왼팔.길이 = 30;
		
		System.out.println(a사람.a왼팔.길이); // 30
	}

}

class 사람 {
	// 클래스안에 변수를 정의 할 수 있다.
	int 나이;
	팔 a왼팔;

}

class 팔 extends 사람 {
	int 길이;
	
}