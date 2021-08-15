interface Test1 {
	void foo();
}

interface Test2 {
	void bar();
}

abstract class Test3 {
	public abstract void foo();
}

public class Sample extends Test3 implements Test1, Test2 {
	public void foo() {
	}

	public void bar() {
	}
	
	
	public static void main(String[] args) {
		new Sample();
	}
}

// class クラス名 extends スーパークラス implements インタフェース名1[, インタフェース名2, ...]