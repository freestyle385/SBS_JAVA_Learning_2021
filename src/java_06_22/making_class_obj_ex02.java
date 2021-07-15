// 캐릭터 클래스 생성에 따른 변수, 객체 생성
// 변수와 객체의 리모콘 개념
// 클래스 생성에 따른 다양한 변수 타입 활용
// '소개하다'라는 동사 개념을 추상화한 함수 생성

package java_06_22;

public class making_class_obj_ex02 {

	public static void main(String[] args) {

		// 	방법 1 => 타입 미스매치로 인해 사용 불가
		//	int[] a캐릭터1 = new int[5];  => 더 간단하지만 int만 활용 가능
		//	a캐릭터1[0] = 1;
		//	a캐릭터1[1] = 22;
		//	a캐릭터1[2] = 1241523;
		//	a캐릭터1[3] = 50;
		//	a캐릭터1[4] = "홍길동";

		// 	방법 2 => 클래스에 설정된 타입들 모두 활용 가능(int와 String의 병행)
		캐릭터 a캐릭터 = new 캐릭터();
		a캐릭터.번호 = 2;
		a캐릭터.나이 = 23;
		a캐릭터.주민번호 = 1534653;
		a캐릭터.공격력 = 135;
		a캐릭터.이름 = "핵간지";
		introduce(a캐릭터.번호, a캐릭터.나이, a캐릭터.주민번호, a캐릭터.공격력, a캐릭터.이름);

	}
	static void introduce(int no, int age, int jumin, int attackP, String name) {
		//	매개변수는 달라도 알아서 매칭 가능
		System.out.println("캐릭터 소개====");
		System.out.printf("번호 : %d\n", no);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("주민번호 : %d\n", jumin);
		System.out.printf("공격력 : %d\n", attackP);
		System.out.printf("이름 : %s\n", name);
		
	}
}

class 캐릭터 {
	int 번호;
	int 나이;
	int 주민번호;
	int 공격력;
	String 이름;
}
