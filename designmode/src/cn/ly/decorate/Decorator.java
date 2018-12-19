package cn.ly.decorate;

public class Decorator implements Sourceable{
	
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("在扩展原生method方法之前");
		source.method();
		System.out.println("扩展之后");
	}
	
}
