package cn.ly.proxy;

public class Proxy implements Sourceable{
	
	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		System.out.println("调用之前");
		source.method();
		System.out.println("调用之后");
	}

}
