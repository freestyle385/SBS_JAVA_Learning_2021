package java_07_07;

public class ReturnTypeMethod {

	public static void main(String[] args) {
		int i = 로봇.get정수();
		boolean b = 로봇.get논리();
		사람2 a사람 = 로봇.get사람();
		사람2 a사람2 = 로봇.get사람2();
		사람2 a사람3 = 로봇.get사람3();
		사람2 a사람4 = 로봇.get사람4();
		사람2 a사람5 = 로봇.get사람5(123, false);
		로봇.get사람6(123, false);
	}

}
class 로봇 {
	static int get정수() {
		return 0;
	}
	static boolean get논리() {
		return true;
	}
	static 사람2 get사람() {
		return null;
	}
	static 사람2 get사람2() {
		사람2 a사람 = null;
		return a사람;
	}
	static 사람2 get사람3() {
		사람2 a사람 = null;
		return a사람;
	}
	static 사람2 get사람4() {
		사람2 a사람 = null;
		return a사람;
	}
	static 사람2 get사람5(int 나이, boolean 결혼여부) {
		사람2 a사람 = null;
		a사람.나이 = 나이;
		a사람.결혼여부 = 결혼여부;
		return a사람;
	}
	static void get사람6(int 나이, boolean 결혼여부) {
		사람2 a사람 = null;
		a사람.나이 = 나이;
		a사람.결혼여부 = 결혼여부;
		return; // 리턴하지 않겠다(함수를 끝낸다) => void 함수는 리턴 불가하므로.
	}
}
class 사람2 extends 로봇 {
	int 나이;
	boolean 결혼여부;
}