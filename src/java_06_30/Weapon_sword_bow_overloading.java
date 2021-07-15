package java_06_30;

public class Weapon_sword_bow_overloading {

	public static void main(String[] args) {

		무기 a무기 = new 칼();
		칼 a칼 = new 칼();
		활 a활 = new 활();

		a무기.공격();
	}

}

class 무기 {
	void 공격() {
// 자식 클래스의 공격 버튼과 연결된 메인 버튼 생성 = 자체 내용 없음(껍데기)
// 무기 클래스에서 칼 클래스로 넘어가 공격 버튼을 실행
	}
}

class 칼 extends 무기 {
	void 공격() {
		System.out.println("칼로 공격합니다.");
	}
}

class 활 extends 무기 {
	void 공격() {
		System.out.println("활로 공격합니다.");
	}
}