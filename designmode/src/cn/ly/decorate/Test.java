package cn.ly.decorate;

public class Test {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable d = new Decorator(source);
		d.method();
	}
}
