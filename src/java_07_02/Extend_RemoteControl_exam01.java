package java_07_02;

public class Extend_RemoteControl_exam01 {

	public static void main(String[] args) {
		System.out.println("== ǥ��Tv ������ �鿩���� �� ==");

		������Tv a������Tv = new ������Tv();
		�ＺTv a�ＺTv = new �ＺTv();
		LGTv aLGTv = new LGTv();

		a������Tv.�ѱ�();
		// ��� => ������Tv �����ϴ�.
		a������Tv.����();
		// ��� => ������Tv �����ϴ�.
		a������Tv.vr�ѱ�();
		// ��� => ������Tv vr�ѱ�!

		a�ＺTv.�ѱ�();
		// ��� => �ＺTv �����ϴ�.
		a�ＺTv.����();
		// ��� => �ＺTv �����ϴ�.
		a�ＺTv.ar�ѱ�();
		// ��� => �ＺTv ar�ѱ�!

		aLGTv.�ѱ�();
		// ��� => LGTv �����ϴ�.
		aLGTv.����();
		// ��� => LGTv �����ϴ�.
		aLGTv.���Ӹ����ȯ();
		// ��� => LGTv ���Ӹ����ȯ!

		System.out.println("== ǥ��Tv ������ �鿩�� �� ==");

		// ǥ��Tv �������� �����.
		ǥ��Tv aǥ��Tv;

		// aǥ��Tv ������ ������Tv ��ü�� �����Ѵ�.
		aǥ��Tv = a������Tv;
		aǥ��Tv.�ѱ�();
		// ��� : ������TV �����ϴ�.
		aǥ��Tv.����();
		// ��� : ������TV �����ϴ�.

		// aǥ��Tv ������ �ＺTv ��ü�� �����Ѵ�.
		aǥ��Tv = a�ＺTv;
		aǥ��Tv.�ѱ�();
		// ��� : �ＺTV �����ϴ�.
		aǥ��Tv.����();
		// ��� : �ＺTV �����ϴ�.

		// aǥ��Tv ������ LGTv ��ü�� �����Ѵ�.
		aǥ��Tv = aLGTv;
		aǥ��Tv.�ѱ�();
		// ��� : LGTV �����ϴ�.
		aǥ��Tv.����();
		// ��� : LGTV �����ϴ�.

		// LGTV���� ���� ����� ǥ��Tv �������� �̿��ؼ� ȣ���ϱ� => �Ұ���
		// (LGTv) => aǥ��Tv ������ �ִ� ǥ��Tv �������� LGTv������ȭ �ؼ� `aLGTv2` ������ ����.
		LGTv aLGTv2 = (LGTv) aǥ��Tv;
		aLGTv2.���Ӹ����ȯ();
	}
}
class ǥ��Tv {
	void �ѱ�() {
	}

	void ����() {
	}
}
// �Ʒ� Ŭ�����鸶�� ���� �Լ� ������ �����Ƿ�, ǥ��Tv������ ��ư�� ���� �������
class ������Tv extends ǥ��Tv {
	void �ѱ�() {
		System.out.println("������Tv �����ϴ�.");
	}

	void ����() {
		System.out.println("������Tv �����ϴ�.");
	}

	void vr�ѱ�() {
		System.out.println("������Tv vr�ѱ�!");
	}
}

class �ＺTv extends ǥ��Tv {
	void �ѱ�() {
		System.out.println("�ＺTv �����ϴ�.");
	}

	void ����() {
		System.out.println("�ＺTv �����ϴ�.");
	}

	void ar�ѱ�() {
		System.out.println("�ＺTv ar�ѱ�!");
	}
}

class LGTv extends ǥ��Tv {
	void �ѱ�() {
		System.out.println("LGTv �����ϴ�.");
	}

	void ����() {
		System.out.println("LGTv �����ϴ�.");
	}

	void ���Ӹ����ȯ() {
		System.out.println("LGTv ���Ӹ����ȯ!");
	}
}