package java_07_05;

public class Class_Value_exam02 {

	public static void main(String[] args) {
		전사1 a전사 = new 전사1();
		
		a전사.나이 = 20;
		a전사.a무기 = new 활1();
		a전사.a무기 = new 칼1();
	}

}

class 전사1 {
	int 나이;
	무기1 a무기;
}

class 무기1 {
	
}
class 활1 extends 무기1 {

}

class 칼1 extends 무기1 {

}