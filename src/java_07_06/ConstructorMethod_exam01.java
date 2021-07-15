package java_07_06;

public class ConstructorMethod_exam01 {

	public static void main(String[] args) {
		사람_1 a홍길동 = new 홍길동();
		System.out.printf("== 홍길동 정보 ==\n");
		System.out.printf("이름 : %s\n", a홍길동.이름); // 홍길동
		System.out.printf("나이 : %s\n", a홍길동.나이); // 22
		사람_1 a홍길순 = new 홍길순();
		System.out.printf("== 홍길순 정보 ==\n");
		System.out.printf("이름 : %s\n", a홍길순.이름); // 홍길순
		System.out.printf("나이 : %s\n", a홍길순.나이); // 22
	}

}

class 사람_1 {
	String 이름;
	int 나이;

	사람_1() {
		this.나이 = 22;
	}
	// 생성자 메소드는 new일 때 자동으로 실행됨.
	// 클래스명으로 함수명이 결정되고 타입 설정 X.
}

class 홍길동 extends 사람_1 {
	홍길동() {
		this.이름 = "홍길동";
	}
	// 생성자 메소드	
}

class 홍길순 extends 사람_1 {
	홍길순() {
		this.이름 = "홍길순";
	}
	// 생성자 메소드
}