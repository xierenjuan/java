package cn.ly.adapter;

public class Test {
	public static void main(String[] args) {
		Sourceable able = new SourceSub1();
		Sourceable able2 = new SourceSub2();
		
		able.method1();
		able.method2();
		able2.method1();
		able2.method2();
	}
}
