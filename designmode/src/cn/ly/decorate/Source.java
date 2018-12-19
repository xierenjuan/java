package cn.ly.decorate;


public class Source implements Sourceable{
	@Override
	public void method() {
		System.out.println("原生method");
	}
}
