package cn.ly.absrtactfactory;

public class Test {
	public static void main(String[] args) {
		Factory factory = new SenderEmailFactory();
		Sender produce = factory.produce();
		produce.send();
	}
}
